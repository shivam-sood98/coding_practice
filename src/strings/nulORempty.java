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
public class nulORempty {
    
    public static void main(String[] args) {
        String hi="";
       
        if(hi==null)
        {
            System.out.println("null");
        }
        else{
            System.out.println("not");
        }
        
        if(hi.isEmpty())
        {
            System.out.println("empty");
        }
        else{
            System.out.println("not empty");
        }
    }
}
