import java.util.Arrays;

public class AlgorithmExamples {

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei)
            return;
        
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int [] temp = new int[ei - si +1];
        int i = si;
        int j = mid +1;
        int k = 0;
        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k] = arr[i];
                i++;
                k++;
               
            }
            else
            {
                temp[k] = arr[j];
                j++;
                k++;
            }

        }
        while(i<=mid){temp[k++] = arr[i++];}
        while(j<= ei){temp[k++] = arr[j++];}
        for(k = 0, i = si; k<temp.length;k++,i++)
        {
            arr[i] = temp[k];
        }

 
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;
        return i + 1;
    }

    public static void quickSort(int[] arr, int si, int ei) {
        if (si < ei) {
            int pidx = partition(arr, si, ei);
            quickSort(arr, si, pidx - 1);
            quickSort(arr, pidx + 1, ei);
        }
    }

    public static int searchInSortedRotatedArray(int[] arr, int target, int si, int ei) {
        if (si > ei)
            return -1;

        int mid = si + (ei - si) / 2;
        if (arr[mid] == target)
            return mid;

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target < arr[mid])
                return searchInSortedRotatedArray(arr, target, si, mid - 1);
            else
                return searchInSortedRotatedArray(arr, target, mid + 1, ei);
        } else {
            if (arr[mid] <= target && target <= arr[ei])
                return searchInSortedRotatedArray(arr, target, mid + 1, ei);
            else
                return searchInSortedRotatedArray(arr, target, si, mid - 1);
        }
    }

    public static void changeArray(int[] arr, int i, int val) {
        if (i == arr.length)
            return;
        
        arr[i] = val;
        changeArray(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void findSubsets(String str, int i, String ans) {
        if (i == str.length()) {
            if (ans.length() > 0)
                System.out.println(ans);
            return;
        }
        
        findSubsets(str, i + 1, ans);
        findSubsets(str, i + 1, ans + str.charAt(i));
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 5};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array after merge sort: " + Arrays.toString(arr));
    
        int[] quickSortArr = {8, 5, 2, 9, 5, 6, 3};
        quickSort(quickSortArr, 0, quickSortArr.length - 1);
        System.out.println("Sorted array after quick sort: " + Arrays.toString(quickSortArr));
    
        int[] sortedRotatedArray = {6, 7, 1, 2, 3, 4, 5};
        int target = 3;
        int result = searchInSortedRotatedArray(sortedRotatedArray, target, 0, sortedRotatedArray.length - 1);
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    
        int[] arrayToChange = new int[5];
        changeArray(arrayToChange, 0, 1);
        System.out.println("Array after changing: " + Arrays.toString(arrayToChange));
    
        String inputString = "abc";
        System.out.println("Subsets of string '" + inputString + "':");
        findSubsets(inputString, 0, "");
    }
    
}
