/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Computer home
 */
/*
public class count_occurence {
    public static void main(String[] args) {
        String hi="hi m shivam";
        
        int co=0;
        char c[]=hi.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='m')
            {
                co++;
            }
        }
        System.out.println(co);
    }
}
*/

public class count_occurence
{
    static long count(String h,char c)
    {
        Matcher match=Pattern.compile(String.valueOf(c)).matcher(h);
        
        int res=0;
        
        while(match.find())
        {
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        String hi="geeksforgeeks";
        char c='e';
        
        
        
        System.out.println(count(hi,c));
    }
}

