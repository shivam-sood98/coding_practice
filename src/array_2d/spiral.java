/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_2d;

/**
 *
 * @author Computer home
 */
public class spiral {
    static void spiral(int m,int n,int a[][])
    {
        //k=starting row index
       // m=ending row index
        //l=starting column index
        //n=ending column index
        //i=iterator
       int i;
       int k=0,l=0;
       
       while(k<m&&l<n)
       {
           for(i=l;i<n;i++)
           {
               System.out.print(a[k][i]);
           }
           k++;
           
           for(i=k;i<m;i++)
           {
               System.out.print(a[i][n-1]);
           }
           n--;
           
           if(k<m)
           {
               for(i=n-1;i>=l;i--)
               {
               }
               System.out.print(a[m-1][i]);
           }
           m--;
           
           if(l<n)
           {
               for(i=m-1;i>=k;i--)
               {
                   System.out.print(a[i][l]);
                   i++;
               }
           }
       }
    }
    public static void main(String[] args) {
        
        int a[][]={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
        spiral(3,6,a);
    }
}
