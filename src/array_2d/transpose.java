/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_2d;

/**
 *
 * @author Computer home
 */
public class transpose {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int tr[][]=new int[3][3];
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                tr[i][j]=a[j][i];
            }
        }
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
         System.out.println();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(tr[i][j]);
            }
            System.out.println();
        }
    }
}
