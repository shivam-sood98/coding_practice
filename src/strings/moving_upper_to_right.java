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
public class moving_upper_to_right {
    static void one()
    {
         String s="ShivamSood is Best";
        char c;
        String u="";
        String l="";
        for(int i=0;i<s.length();i++)
        {
           c=s.charAt(i);
           if(c>='A'&&c<='Z')
           {
               u+=c;
           }
           
           
           else{
               l+=c;
           }
        }
        System.out.println(l+u);
    }
    
    
    static void two()
    {
         String s="ShivamSood is Best";
        char c;
        String k=s.replaceAll("[A-Z+]","" )+s.replaceAll("[^A-Z]+", "");
        System.out.println(k);
    }
    public static void main(String[] args) {
        
       one();
       two();
    }
}
