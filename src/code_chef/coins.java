/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_chef;

/**
 *
 * @author Computer home
 */
public class coins {
    public static void main(String[] args) {
        int max=2;
        int total=2;
        int counter=0;
        
        while(total>0)
        {
            if(total%2==1){
            counter++;
            total--;
        }
            counter=counter+total/max;    //9
            max=total%max;                //2
            total=max;                    //2                      
        }
        System.out.println("Coins are"+counter);
    }
}
