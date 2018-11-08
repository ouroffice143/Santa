					/*Program to print Multipliaction of the matrix*/

package com.reg.java;

import java.util.Scanner;

class MatrixMul{
  public static void main(String args[])
   {
      int row1,col1,row2, col2, sum = 0, i, j, k;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of row1s and col1umns of first matrix");
      row1 = in.nextInt();
      col1= in.nextInt();
 
      int first[][] = new int[row1][col1];
 
      System.out.println("Enter elements of first matrix");
 
      for (i = 0; i < row1; i++)
         for (j = 0; j < col1; j++)
            first[i][j] = in.nextInt();
 
      System.out.println("Enter the number of row1s and col1umns of second matrix");
     row2 = in.nextInt();
      col2 = in.nextInt();
 
      if (col1 !=row2)
         System.out.println("The matrices can't be multiplied with each other.");
      else
      {
         int second[][] = new int[row2][col2];
         int multiply[][] = new int[row1][col2];
 
         System.out.println("Enter elements of second matrix");
 
         for (i = 0; i <row2; i++)
            for (j = 0; j < col2; j++)
               second[i][j] = in.nextInt();
 
         for (i = 0; i < row1; i++)
         {
            for (j = 0; j < col2; j++)
            {  
               for (k = 0; k <row2; k++)
               {
                  sum = sum + first[i][k]*second[k][j];
               }
 
               multiply[i][j] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Product of the matrices:");
 
         for (i = 0; i < row1; i++)
         {
            for (j = 0; j < col2; j++)
               System.out.print(multiply[i][j]+"\t");
 
            System.out.print("\n");
         }
      }
   }
}