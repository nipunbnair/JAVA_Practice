//import java.util.Arrays;
//import java.util.Collections;

public class Sorting {
    public static void bubblesort(int a[])
    {   int n = a.length;
        int temp;
        int swaps = 0;
        for(int i = 0; i<n-1;i++)
        {
            for(int j = 0; j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                { 
                  temp = a[j];
                  a[j] = a[j+1];
                  a[j+1] = temp;
                  swaps++; 
                }
            }   
        }
        System.out.println("The no of swaps are "+swaps);

    }
    public static void selectionsort(int a[])
    {   int n = a.length;
        int temp,minpos;
        int swaps = 0;
        for(int i = 0; i<n-2;i++)
        {   minpos = i;
            for(int j = i+1; j<n-1;j++)
            {
                if(a[minpos]>a[j])
                { minpos = j;
                  temp = a[j];
                  a[j] = a[minpos];
                  a[minpos] = temp;
                  swaps++; 
                }
            }   
        }
        System.out.println("The no of swaps are "+swaps);

    }
    public static void insertionsort(int a[])
    {   int n = a.length;
        int curr,prev;
        int swaps = 0;
        for(int i = 1; i<n;i++)
        {   curr = i;
            prev = i-1;
            while(prev>=0 && a[prev]>a[curr])
            {
                a[prev+1] = a[prev];
                prev--;
                swaps++;
            } 
            a[prev+1] = a[curr];  
        }
        System.out.println("The no of swaps are "+swaps);

    }
    public static void countingSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // No need to sort
        }
        
        int max = findMax(arr);
        int min = findMin(arr);
        int range = max - min + 1;
        
        int[] countArray = new int[range];
        int[] outputArray = new int[arr.length];
        
        // Count the occurrences of each element
        for (int value : arr) {
            countArray[value - min]++;
        }
        
        // Calculate cumulative counts
        for (int i = 1; i < range; i++) {
            countArray[i] += countArray[i - 1];
        }
        
        // Build the output array
        for (int i = arr.length - 1; i >= 0; i--) {
            outputArray[countArray[arr[i] - min] - 1] = arr[i];
            countArray[arr[i] - min]--;
        }
        
        // Copy the sorted elements back to the original array
        System.arraycopy(outputArray, 0, arr, 0, arr.length);
    }
    
    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    
    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = { 81, 30, 49, 8, 90, 83, 22}; // static integer array  
         //int* arr = new int[3]; // dynamic integer array 
        //bubblesort(arr); 
        //selectionsort(arr);
        //insertionsort(arr);
        //Arrays.sort(arr);
        //Integer Arr[] = { 81, 30, 49, 8, 90, 83, 22}; 
         //Arrays.sort(Arr,Collections.reverseOrder());
        //for(int i = 0; i<arr.length; i++)
            //System.out.println(arr[i]);

        countingSort(arr);
    


    }
}
