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
public class replace_char {
    public static void main(String[] args) {
        String str="Geeks for Geeks";
        int index=3;
        char c='l';
        str=str.substring(0, index)+c+str.substring(index+1);
        System.out.println(str);
    }
}
