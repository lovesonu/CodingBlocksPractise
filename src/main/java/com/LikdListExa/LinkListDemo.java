package com.LikdListExa;

public class LinkListDemo {

    public static void main(String[] args) {
        CustomLinkList cs = new CustomLinkList();
        cs.adFirst(10);
        cs.adFirst(20);
        cs.adFirst(30);
        cs.adFirst(40);
//        cs.pushNode(12);
//        cs.display();
//        cs.pushNodeEnd(11);
//        cs.display();
        cs.len();
//        cs.adLast(50);
//        cs.display_By_pos(1,99);
                cs.display();
//        cs.deletLast();
        System.out.println(cs.sortList());
//        cs.printREverse(cs.getHeadNode());

    }
}
