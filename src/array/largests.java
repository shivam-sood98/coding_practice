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
public class largests {
    static void largest(int a[])
    {
        int temp=0;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>large)
            {
                temp=a[i];
                a[i]=large;
                large=temp;
            }
        }
        System.out.println();
        System.out.println("Large is :"+large);
        System.out.println("secondlargest is :"+temp);
    }
    static void secondlargest(int[] a)
    {
        
    }
    public static void main(String[] args) {
        int a[]={1,5,2,4,3};
        for(int i:a)
            System.out.print(i+" ");
        largest(a);
        secondlargest(a);
    }

 
}
