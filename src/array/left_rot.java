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
public class left_rot {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int l=a.length;
        
         for(int i:a)
        {
            System.out.print(i+" ");
        }
         System.out.print("----------------");
        for(int i=0;i<=1;i++)
        {
            int grab=a[0];
            for(int j=1;j<a.length;j++)
            {
                a[j-1]=a[j];
            }
            a[l-1]=grab;
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
