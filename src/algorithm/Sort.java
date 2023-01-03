package src.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(array[j-1] > array[j]){
                    //swap elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    

    public int [] mergeSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        mergesort(array);
        System.out.println("array after sorting using mergesort algorithm");
        System.out.println(Arrays.toString(array));

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    

    public int [] quickSort(int [] array){

        final long startTime = System.currentTimeMillis();

        int [] list = array;
        int n = array.length;
        //implement here

        quick(array, 0, n - 1);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        hSort(array);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        binSort(array, 10);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    
    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int n = array.length;
        shell(array, n);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }



    public static void mergesort(int[] input) {
        mergesort(input, 0, input.length - 1);
    }

    private static void mergesort(int[] input, int start, int end) {
        // break problem into smaller structurally identical problems
         int mid = (start + end) / 2;
         if (start < end) {
             mergesort(input, start, mid);
             mergesort(input, mid + 1, end);
         }

        int i = 0, first = start, last = mid + 1;
         int[] tmp = new int[end - start + 1];

        while (first <= mid && last <= end)
        {
            tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }

        while (first <= mid) {
            tmp[i++] = input[first++];
        }

        while (last <= end) {
            tmp[i++] = input[last++];
        }

        i = 0;
        while (start <= end) {
            input[start++] = tmp[i++];
        }


    }

    public static void quick(int a[], int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */
    {
        if (start < end)
        {
            int p = partition(a, start, end);  //p is partitioning index
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }

   public static int partition (int a[], int start, int end)
    {
        int pivot = a[end]; // pivot element
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++)
        {
            // If current element is smaller than the pivot
            if (a[j] < pivot)
            {
                i++; // increment index of smaller element
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[end];
        a[end] = t;
        return (i + 1);
    }

    public void hSort(int arr[])
    {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    private static void binSort(int[] array, int bucketSize)
    {
        //creating a list of buckets for storing lists
        List<Integer>[] buckets = new List[bucketSize];
        // Linked list with each bucket array index
          // as there may be hash collision
        for(int i = 0; i < bucketSize; i++)
        {
            buckets[i] = new LinkedList<>();
        }
        //calculate the hash and assigns elements to the proper bucket
        for(int num : array)
        {
            buckets[hash(num, bucketSize)].add(num);
        }
        //iterate over the buckets and sorts the elements
        for(List<Integer> bucket : buckets)
        {
        //sorts the bucket
            Collections.sort(bucket);
        }
        int index = 0;
         //gethered the buckets after sorting
        for(List<Integer> bucket : buckets)
        {
            for(int num : bucket)
            {
                array[index++] = num;
            }
        }
    }
    //distributing elements
    private static int hash(int num, int bucketSize)
    {
        return num/bucketSize;
    }

    static void shell(int a[], int n)
    {
        /* Rearrange the array elements at n/2, n/4, ..., 1 intervals */
        for (int interval = n/2; interval > 0; interval /= 2)
        {
            for (int i = interval; i < n; i += 1)
            {
            /* store a[i] to the variable temp and make
            the ith position empty */
                int temp = a[i];
                int j;
                for (j = i; j >= interval && a[j - interval] >
                        temp; j -= interval)
                    a[j] = a[j - interval];

            /* put temp (the original a[i]) in its correct
            position */
                a[j] = temp;
            }
        }
    }

}
