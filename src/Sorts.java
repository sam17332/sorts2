import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
*
* @author Hector Valle
* @author Rodrigo Samayoa
* 
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
    
    public int partition(Integer arr[], int left, int right)
    {
          int i = left, j = right;
          int tmp;
          int pivot = arr[(left + right) / 2];
         
          while (i <= j) {
                while (arr[i].compareTo(pivot) < 0)
                      i++;
                while (arr[j].compareTo(pivot) < 0)
                      j--;
                if (i <= j) {
                      tmp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = tmp;
                      i++;
                      j--;
                }
          };
         
          return i;
    }
 
    public void insertionSort(int arr[], int n)
    {
       int i, key, j;
       for (i = 1; i < n; i++)
       {
           key = arr[i];
           j = i-1;
           while (j >= 0 && arr[j] > key)
           {
               arr[j+1] = arr[j];
               j = j-1;
           }
           arr[j+1] = key;
       }
    }    
    
    public void quickSort(Integer arr[], int left, int right) 
    {
        int index = partition(arr, left, right);
        if (left < index - 1)
              quickSort(arr, left, index - 1);
        if (index < right)
              quickSort(arr, index, right);
  }
    
    public void mergeSort(Integer[] num, int iz, int de){
        if (iz < de){
            int m = (iz+de)/2;
            mergeSort(num, iz, m);
            mergeSort(num, m+1, de);
            merge(num, iz, m, de);
        }
    }
    
    public int getMax(int num[]){
        int max = num[0];
        for (int i = 1; i< num.length; i++){
            if(num[i] > max)
                max = num[i];
        }
        return max;
    }
    
    public void countSort(int num[], int exp){
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
    
    public void radixSort(int num[]){
        int m = getMax(num);
        for(int exp = 1; m/exp > 0; exp *= 10)
            countSort(num, exp);
    }
   
}
