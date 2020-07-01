/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author Computer home
 */


public class pading {
    static String right(String n,char c,int i)
    {
        String result=String.format("%" + (-i)+ "s", n).replace(' ', c);
        return result;
    }
    
    static String left(String n,char c,int i)
    {
        String result=String.format("%" + (i)+ "s" ,n).replace(' ',c);
        return result;
    }
  
    
    
    public static void main(String[] args) {
        String nam="shivam";
        char ch='-';
        int len=10;
        System.out.println(right(nam,ch,len));
        System.out.println(left(nam,ch,len));
    }
}



//Another Approach

/**
import java.lang.*;
import java.io.*;
class pading{
    
    static String left(String n,int l,char c)
    {
       String res=StringUtils.leftPad(n,l,c);
        return res;
    }
    public static void main(String[] args) {
        String nam="shivam";
        int l=10;
        char c=' ';
        
        
        System.out.println(left(nam,l,c));
    }
}
* */