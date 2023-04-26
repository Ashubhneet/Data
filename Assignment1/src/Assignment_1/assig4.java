package Assignment_1;

import java.util.*;
public class assig4 {
    static int m=3, n=3;
    static void row(int arr[][])
    {
        int i, j, sum = 0;
        System.out.println("Finding Sum of each row:");
        for (i = 0; i < m; ++i)
        {
            for (j = 0; j < n; ++j)
            {
                sum += arr[i][j];
            }
            System.out.println("Sum of the row " + (i+1) + " = " +sum);
            sum = 0;
        }
    }
    static void col(int arr[][])
    {
        int i, j, sum = 0;
        System.out.println("Finding Sum of each column:");
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                sum = sum + arr[j][i];
            }
            System.out.println("Sum of the column "+ (i+1)+" = "+sum);
            sum = 0;
        }
    }
    public static void main(String[] args)
    {
        int i, j;
        int[][] arr = new int[m][n];
        Scanner sc=new Scanner(System.in);
        for (i = 0; i < m; i++)
        {
            System.out.println("Enter value for row "+ (i+1));
            for (j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        }
        row(arr);
        col(arr);
    }
}