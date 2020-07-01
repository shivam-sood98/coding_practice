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
public class duplicate {
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
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[j]);
                }
            }
        }
    }
}
