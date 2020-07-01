/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

import java.util.Scanner;

/**
 *
 * @author Computer home
 */
public class bubble_sort {
    
    static void bubble(int a[],int l)
    {
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println("-----------------------------------");
         choice();
    }
    
    static void select(int a[],int l)
    {
        for(int i=0;i<l;i++)
        {
            int min=i;
            for(int j=i+1;j<l;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                    
                    int temp=a[i];
                    a[i]=a[min];
                    a[min]=temp;
                }
            }
        }
        System.out.println();
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println("-----------------------------------");
        choice();
    }
    
    static void insert(int a[],int l)
    {
        int j,key;
        for(int i=1;i<l;i++)
        {
            j=i-1;
            key=a[i];
            
            while(j>=0&&a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(int i:a){
            System.out.print(i+" ");
        }
        choice();
    }
    static void choice()
    {
         Scanner s=new Scanner(System.in);
         int a[]={5,2,3,9,8,6};
        int l=a.length;
         System.out.println("Enter choice");
        System.out.println("1 for bubble");
        System.out.println("2 for select");
        System.out.println("3 for insert");
        int n=s.nextInt();
        switch(n){
            case 1: bubble(a,l);
                break;
            
            case 2: select(a,l);
            break;
            
            case 3: insert(a,l);
            default:
                
    }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       
       choice();
    }
}
