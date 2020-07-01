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
public class copy {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int len=a.length;
        int b[]=new int[len];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        for(int i:b)
        {
            System.out.print(i+" ");
        }
    }
}
