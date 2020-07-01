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
public class FLOAT_STRING {
    public static void main(String[] args) {
        float f=1.2f;
        String s="";
        s=s+f;
        System.out.println(s);
        
        ////ANOTHER METHOD//////
        System.out.println(String.valueOf(f));
    }
}
