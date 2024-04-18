package com.topicwise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://www.youtube.com/watch?v=Ul_7T2WJIuQ&t=769s
public class Java8TechiIQN {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student(1, "Rohit", 30, "Male", "Mech", "Mumbai", 122, Arrays.asList("123", "321")),
                new Student(2, "Pulkit", 56, "Male", "cse", "Delhi", 12, Arrays.asList("234", "321")),
                new Student(3, "Ankit", 25, "Female", "Mech", "Patna", 22, Arrays.asList("356", "321")),
                new Student(4, "Satish", 30, "Male", "Mech", "Kerla", 112, Arrays.asList("456", "321")),
                new Student(5, "Roshan", 23, "Male", "Bio", "Mumbai", 2, Arrays.asList("4566", "321")),
                new Student(6, "Chetan", 24, "Male", "Mech", "Karnataka", 50, Arrays.asList("4454", "321")),
                new Student(7, "Arun", 26, "Male", "EC", "Karnataka", 98, Arrays.asList("4545", "321")),
                new Student(8, "Nam", 31, "Male", "CE", "Karnataka", 7, Arrays.asList("5555", "321")),
                new Student(9, "Sonu", 27, "Female", "CE", "Karnataka", 55, Arrays.asList("1235", "321")),
                new Student(10, "Shubham", 26, "Male", "IE", "Mumbai", 23, Arrays.asList("12358", "321"))
        );

        List<Emp> empList = Arrays.asList(new Emp("A",10000),
                new Emp("B",20000),
                new Emp("c",30000),
                new Emp("B",40000));

        //Frequnecy count of charcter
        String str = "i love sonu"; //{ =2, s=1, u=1, e=1, v=1, i=1, l=1, n=1, o=2}
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
//                .filter(c ->c != ' ') //filtering space
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()) );
        System.out.println(" >>>>>>"+frequencyMap);

                //        1. Find list whose rank is bet 50-100
        List<Student> stud = studentList.stream().filter(s -> s.getRank() > 50 && s.getRank() < 100).toList();

        //2. Find the student list who stay in karnataka and short them by names
//Approch 1
        List<Student> cityList = studentList.stream().filter(ss -> ss.getCity().equalsIgnoreCase("Karnataka")).toList();
        List<Student> sorted = cityList.stream().sorted(Comparator.comparing(Student::getFirstName)).toList();
//Approch 2 :
        List<Student> sortedList = studentList.stream().filter(ss -> ss.getCity().equalsIgnoreCase("Karnataka"))
                .sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder())).toList();

//        3. Find all department names
        Map<String, List<Student>> collect3 = studentList.stream().collect(Collectors.groupingBy(Student::getDept));

        List<String> collect = studentList.stream().map(Student::getDept).distinct().toList();
        Set<String> collesct = studentList.stream().map(Student::getDept).collect(Collectors.toSet());


        //4. Find all the contact number
        List<List<String>> collectUseMap = studentList.stream().map(Student::getContacts).collect(Collectors.toList());
        List<String> collectUseFlatMap = studentList.stream().flatMap(student -> student.getContacts().stream()).collect(Collectors.toList());

        //5. Group the student by department names
        Map<String, Long> studentNames = studentList.stream().collect(Collectors
                .groupingBy(Student::getDept, Collectors.counting())); //Collectors.groupingBy(Student::getName) for get info
        // 6.To get which branch have more students
        Map.Entry<String, Long> maxStudent = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();

        //7.Find average age of male and female
        Map<String, Double> collect1 = studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getAge)));

        //8. Find highest rank in each department
        Map<String, Optional<Student>> minRank = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.minBy(Comparator.comparing(Student::getRank))));

        //9. Find student who have 2nd rank
        Student student = studentList.stream().sorted(Comparator.comparing(Student::getRank))
                .skip(2)
                .findFirst().get();


        //increases the salary by 10% for employees whose salary is less than 3000:
        List<Emp> collect2 = empList.stream().filter(e -> e.getSal() <= 30000).
        peek(emp -> emp.setSal((emp.getSal() + emp.getSal() *15/100 ))).collect(Collectors.toList());

        System.out.println(collect2);
    }


}

class Student {
    private int id;
    private String firstName;
    private int age;
    private String gender;
    private String dept;
    private String city;
    private int rank;
    private List<String> contacts;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && rank == student.rank && Objects.equals(firstName, student.firstName) && Objects.equals(gender, student.gender) && Objects.equals(dept, student.dept) && Objects.equals(city, student.city) && Objects.equals(contacts, student.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, age, gender, dept, city, rank, contacts);
    }


    @Override
    public java.lang.String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName=" + firstName +
                ", age=" + age +
                ", gender=" + gender +
                ", dept=" + dept +
                ", city=" + city +
                ", rank=" + rank +
                ", contacts=" + contacts +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public Student(int id, String firstName, int age, String gender, String dept, String city, int rank, List<String> contacts) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
        this.city = city;
        this.rank = rank;
        this.contacts = contacts;
    }
}

class Emp {
    public Emp() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(name, emp.name) && Objects.equals(sal, emp.sal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    private String name;
    private int sal;

    public Emp(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }
}
