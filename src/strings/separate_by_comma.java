/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Computer home
 */
public class separate_by_comma {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("shivam","sood"));
        System.out.println(list);
        String st=String.join(",", list);
        System.out.println(st);
    }
}
