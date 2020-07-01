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
public class second_lar {
     static void thrd()
    {
       int a[]={1,3,2,6,5};
       int high=Integer.MIN_VALUE;
       int shigh=Integer.MIN_VALUE;
       int thigh=Integer.MIN_VALUE;
       for(int i=0;i<a.length;i++)
       {
           if(a[i]>high)
           {
               int temp=a[i];
               thigh=shigh;
               shigh=high;
               
               high=temp;
           }
           
           if(a[i]<high&&a[i]>shigh)
           {
               shigh=a[i];
           }
           if(a[i]<high&&a[i]<shigh&&a[i]>thigh)
           {
               thigh=a[i];
           }
           
           
       }
      System.out.println("Highest is :"+high);
        System.out.println("Second HIgehst is :"+shigh);
        System.out.println("Third Highest is :"+thigh);
        
    }
    public static void main(String[] args) {
        int a[]={1,3,2,6,5};
        int high=Integer.MIN_VALUE;
        int shigh=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>high)
            {
                int temp=a[i];
                shigh=high;
                high=a[i];
            }
            if(a[i]>shigh&&a[i]<high)
            {
                shigh=a[i];
            }
        }
        System.out.println("Highest is :"+high);
        System.out.println("Second HIgehst is :"+shigh);
        System.out.println("---------------------------------------");
        System.out.println();
        thrd();
    }
}
