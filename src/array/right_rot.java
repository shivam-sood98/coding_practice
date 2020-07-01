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
public class right_rot {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int l=a.length;
        
         for(int i:a)
        {
            System.out.print(i+" ");
        }
         System.out.println();
         System.out.println("----------------");
         
         for(int i=0;i<=0;i++)
         {
             int grab=a[l-1];
             for(int j=l-2;j>=0;j--)
             {
                 a[j+1]=a[j];
             }
             a[0]=grab;
         }
         
          for(int i:a)
        {
            System.out.print(i+" ");
        }
         
}
}

