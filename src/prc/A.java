/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prc;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Computer home
 */
interface Ab
{
    void a();
}
public class A{
      
  public static void main(String[] args) {
        
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
}

