
package rohit02;

import java.util.Scanner;
public class Arrey_2d_mul {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        int i,j,k;
        System.out.println("enter 1st ayyay");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=l.nextInt();
            }
        }
        System.out.println("enter 2nd array=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                b[i][j]=l.nextInt();
            }
        }
        System.out.println(" 1st array in tabular form is=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                
                System.out.print("\t"+a[i][j]);  
        }
            System.out.println("");
    }
        System.out.println("2nd array in tabular form is=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                
                System.out.print("\t"+b[i][j]);  
        }
            System.out.println("");
    }
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                c[i][j]=0;
                for(k=0;k<2;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
                    System.out.println("multiplication of array is=");

        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                
                System.out.print("\t"+c[i][j]);  
        }
            System.out.println("");
    }
    }
}
