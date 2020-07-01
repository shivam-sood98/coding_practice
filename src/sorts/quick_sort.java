/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

/**
 *
 * @author Computer home
 */
public class quick_sort {
    

    public static void main(String args[]) 
    { 
        int a[] = {4, 10, 8, 9, 1, 5};   
        int n = a.length; 
        quicksort(a,0,n-1);
        System.out.println("sorted array"); 
        print(a);
    } 
    static int partition(int a[],int low,int high)
    {
        int pivot=a[(low+high)/2];
        
        while(low<=high)
        {
            while((a[low]<pivot))
            {
                low++;
            }
            while(a[high]>pivot)
            {
                high--;
            }
            
            if(low<=high)
            {
                int temp=a[low];
                a[low]=a[high];
                a[high]=temp;
                
                low++;
                high--;
            }
        }
        return low;
    }
    
    static void quicksort(int a[],int low,int high)
    {
        int pi=partition(a,low,high);
        if(low<pi-1)
        {
           quicksort(a,low,pi-1);
           
        }
        if(pi<high)
        {
             quicksort(a,pi,high);
        }
    }
    
    static void print(int a[])
    {
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}

