/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Computer home
 */
public class frequency {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size");
        int size=s.nextInt();
        
        int a[]=new int[size];
        System.out.println("Entr elmnts");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("--------------------");
        System.out.println("Elemets are:");
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println("---------------------");
        for(int i=0;i<a.length;i++)
        {
            int c=0;
            int first=a[i];
            for(int j=0;j<a.length;j++)
            {
                if(j<i&&a[i]==a[j])
                {
                    break;
                }
                if(first==a[j])
                {
                    c++;
                }
                if(j==a.length-1)
                {
                    System.out.println(a[i]+" has frequency of "+c);
                }
            }
            
        }
    }
}
