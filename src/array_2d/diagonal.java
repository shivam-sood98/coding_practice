/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_2d;

/**
 *
 * @author Computer home
 * 00,11,22
 * 02,11,20
 */
public class diagonal {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
                };
        int sum=0;
        int s=0;
        int count=2;
        for(int i=0;i<a.length;i++)
        {
            
          sum=a[i][i]+sum; 
         if(count!=i){
          s=s+a[i][count--];
         }
         else{
             count--;
         }          
          
        }
        
        System.out.println(sum+" "+s);
    }
}
