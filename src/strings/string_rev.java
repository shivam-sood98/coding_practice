/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author Computer home
 */
public class string_rev {
    static void method1()
    {
         Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i=0;
        int j=A.length()-1;
        boolean flag=true;
        while(i<j)
        {
            if(A.charAt(i)==A.charAt(j))
            {   
                i++;
                j--;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag)
        {
           System.out.print("Yes"); 
        }
        else
        {
             System.out.print("No");
        }
    }    
    
    static void method2()
    {
         Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer one=new StringBuffer(A);
        StringBuffer B=one.reverse();
        if(one==B)
        {
            System.out.println("Yes");  
        }
        else{
            System.out.println("No");
        }
               
    }
    public static void main(String[] args) {
        method1();
        method2();
    }
   
}
