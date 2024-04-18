package com.assn.day1;

public class RowWiseMatrix {

    static int MAX= 10000;

    static int [][]arr = new int[MAX][MAX];
    static void rowMajor()
    {


        int i, j;

        // accessing element row wise
        for (i = 0; i < MAX; i++)
        {
            for (j = 0; j < MAX; j++)
            {
                arr[i][j]++;
            }
        }
    }

    static void colMajor()
    {

        int i, j;

        // accessing element column wise
        for (i = 0; i < MAX; i++)
        {
            for (j = 0; j < MAX; j++)
            {
                arr[j][i]++;
            }
        }
    }

    public static void main(String[] args) {

    }
}
