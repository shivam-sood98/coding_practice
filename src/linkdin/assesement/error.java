/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkdin.assesement;

/**
 *
 * @author Computer home
 */
public class error {
    static void hil()
    {
        
        System.out.println("abc");
           print(1);
            System.out.println("d");
    
    }
    static void print(int i)
    {
     try{
         System.out.println("e");
         throw new Exception();
        
     }   
     catch(Exception e)
     {
         System.out.println("g");
    }
    }
    
    public static void main(String[] args) {
        System.out.println("A");
        hil();
    }
}
