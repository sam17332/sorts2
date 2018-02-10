
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class Sorts {//implements Comparable<Integer> {
    
    //public int compareTo(Integer i){
        
    //}
    public Integer[] gnomeSort(Integer num[]){
        int c = 0;
        Integer temp = 0;
        while (c < num.length){
            if (c == 0){
                c = c +1;
            }
            if (num[c].compareTo(num[c-1]) >= 0){
                c = c +1;
            } else
            {
              temp = num[c];
              num[c] = num[c-1];
              num[c-1] = temp;
              c = c -1;
            }
        }
        return num;
    }
    
    public void merge(Integer num[], int iz, int me, int de){
        int t1 = me - iz + 1;
        int t2 = de - me;
        Integer L[] = new Integer [t1];
        Integer R[] = new Integer [t2];

        for (int i=0; i<t1; ++i)
            L[i] = num[iz + i];
        for (int j=0; j<t2; ++j)
            R[j] = num[me + 1+ j];

        int i = 0, j = 0;
 
        int k = iz;
        while (i < t1 && j < t2)
        {
            if (L[i].compareTo(R[j])<=0)
            {
                num[k] = L[i];
                i++;
            }
            else
            {
                num[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < t1)
        {
            num[k] = L[i];
            i++;
            k++;
        }
 
        while (j < t2)
        {
            num[k] = R[j];
            j++;
            k++;
        }
    }
    
    public Integer[] mergeSort(Integer[] num, int iz, int de){
        if (iz < de){
            int m = (iz+de)/2;
            mergeSort(num, iz, m);
            mergeSort(num, m+1, de);
            merge(num, iz, m, de);
        }
        return num;
    }
    
    public Integer getMax(Integer num[]){
        int max = num[0];
        for (int i = 1; i< num.length; i++){
            if(num[i] > max)
                max = num[i];
        }
        return max;
    }
    
    public void countSort(Integer num[], int exp){
        int out[] = new int[num.length];
        int i;
        int c[] = new int[10];
        Arrays.fill(c,0);
        
        for(i = 0; i < num.length; i++)
            c[(num[i]/exp)%10]++;
        
        for(i = 1; i< 10;i++)
            c[i] += c[i-1];
        for(i = num.length-1;i>=0;i--){
            out[c[(num[i]/exp)%10]-1]=num[i];
            c[(num[i]/exp)%10]--;
        }
        for(i = 0; i< num.length;i++)
            num[i] = out[i];
        
    }
    
    public Integer[] radixSort(Integer num[]){
        Integer m = getMax(num);
        for(int exp = 1; m/exp > 0; exp *= 10)
            countSort(num, exp);
        return num;
    }

 public int partition(Integer arr[], int left, int right)
    {
          int pivot = arr[right];
          int i = (left-1);
          for(int j = left; j< right; j++){
              if(arr[j] <= pivot){
                  i++;
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
          }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
         
          return i+1;
    }
    
    public Integer[] quickSort(Integer arr[], int left, int right) 
    {
        int index = partition(arr, left, right);
        if (left < index - 1)
              quickSort(arr, left, index - 1);
        if (index < right)
              quickSort(arr, index+1, right);
        return arr;
  }

 public Integer[] insertionSort(Integer arr[], int n)
    {
       int i, k, j;
       for (i = 1; i < n; i++)
       {
           k = arr[i];
           j = i-1;
           while (j >= 0 && arr[j] > k)
           {
               arr[j+1] = arr[j];
               j = j-1;
           }
           arr[j+1] = k;
       }
       return arr;
    }    
   
}
