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
public class even_words {
    public static void main(String[] args) {
        String nam="this is a java practice";
       // char c[]=nam.toCharArray();
        
        String s[]=nam.split(" ");
        for(int i=0;i<s.length;i++)
        {
            
           // System.out.println(s[i]);
            int n=s[i].length();
            if(n%2==0)
            {
                System.out.println(s[i]);
            }
        }
    
    /////////////THIS IS OTHER APPROACH/////////////    
        
        for(String wrd:nam.split(" "))
        {
            System.out.println(wrd);
        }
        }
    
}
