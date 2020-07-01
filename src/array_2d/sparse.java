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
public class sparse {
    public static void main(String[] args) {
        int a[][]={{4,0,0},{0,5,0},{0,0,6}};
        int l=a.length;
        int t=l/2;
        System.out.println(l);
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i][j]==0)
                {
                    c++;
                }
            }
        }
        if(c>t)
        {
            System.out.println("ITS SPARSE");
        }
        else
        {
            System.out.println("ITS NOT");
        }
        
    }
}
