/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_chef;

import java.util.Scanner;

/**
 *
 * @author Computer home
 Chef owns an icecream shop in Chefland named scoORZ. There are only three types of coins in Chefland: Rs. 5, Rs. 10 and Rs. 15. An icecream costs Rs. 5.

There are N people (numbered 1 through N) standing in a queue to buy icecream from scoORZ. Each person wants to buy exactly one icecream. For each valid i, the i-th person has one coin with value ai. It is only possible for someone to buy an icecream when Chef can give them back their change exactly ― for example, if someone pays with a Rs. 10 coin, Chef needs to have a Rs. 5 coin that he gives to this person as change.

Initially, Chef has no money. He wants to know if he can sell icecream to everyone in the queue, in the given order. Since he is busy eating his own icecream, can you tell him if he can serve all these people
 
 */
public class chef_icecream {
    static void buy(int five,int ten,int fift)
    {
              
        int x=2;
        int bord=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coin number :");
        int coin=sc.nextInt();
      for(int i=0;i<1;i++)
      {
          if(coin==5)
          {
              five++;
          }
          else if(coin==10)
          {
              if(five>=1)
              {
                  five--;
                  ten++;
              }
              else{
                  bord++;
              }
          }
          else{
              if(coin==15){
                  if(five>=2)
                  {
                      five-=2;
                      fift++;
                  }
                  else if(ten>=1)
                  {
                      ten--;
                      fift++;
                  }
                  else{
                      bord++;
                  }
              }
          }
      }
      
      if(bord==0)
      {
          System.out.println("Yes");
          System.out.println("Five :"+five+" Ten :"+ten+" fift :"+fift);
      }
      else{
          System.out.println("No");
      }
      again(five,ten,fift);
    }
    static void again(int five,int ten,int fift)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("1 for Shop more?");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1: buy(five,ten,fift);
            
        }
    }
    public static void main(String[] args) {
        
        int five=0;int ten=0;int fift=0;
        buy(five,ten,fift);
        
        
    }
}
