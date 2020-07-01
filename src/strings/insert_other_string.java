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
public class insert_other_string {
    
    static void one()
    {
        String orig="geeksgeeks";
        String insert="for";
        int index=4;
        String news="";
        
        for(int i=0;i<orig.length();i++)
        {
            news+=orig.charAt(i);
            
            if(i==index)
            {
                news+=insert;
            }
        }
        System.out.println(news);
    }
    
    public static void main(String[] args) {
        one();
        
    }
}
