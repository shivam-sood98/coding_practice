/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_2d;

/**
 *
 * @author Computer home
 * 1 0 0
 * 0 1 0
 * 0 0 1
 */
public class identity {
    public static void main(String[] args) {
        boolean flag=true;
        int a[][]={
            
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i==j&&a[i][j]!=1)
                {
                   flag=false; 
                }
                
                if(i!=j&&a[i][j]!=0)
                {
                    flag=false;
                }
            }
        }
        
       if(flag)
       {
           System.out.println("ITS A IDENTITY MATRIX ");
       }
       else
       {
           System.out.println("ITS NOT");
       }
    }
}
