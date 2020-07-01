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
public class white_space {
    static boolean trueOrFalse(String one)
    {
        if(one.trim().isEmpty())
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String one="hi this";
        String two="    ";
        System.out.println("Only whitespaces? "+trueOrFalse(one));
        System.out.println("Only whitespaces? "+trueOrFalse(two));
        
       String h=one.replaceAll(" ", "");
        System.out.println(h);
    }
}
