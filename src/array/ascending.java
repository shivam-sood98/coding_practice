/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Computer home
 */
public class ascending {
   
    public static void main(String[] args) {
       int a[]={1,3,2,6,5};
       for(int i=0;i<a.length;i++)
       {
           for(int j=i+1;j<a.length;j++)
           {
               if(a[i]>a[j])
               {
                   int temp=a[j];
                   a[j]=a[i];
                   a[i]=temp;
               }
           }
       }
       for(int i:a)
       {
           System.out.print(i+" ");
       }
    }
}
