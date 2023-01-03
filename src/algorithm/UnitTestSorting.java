package src.algorithm;

import org.junit.Assert;
import src.algorithm.Sort;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();


        //apply unsorted array to Selection Sort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }


        //apply unsorted array to Insertion Sort.
        sort.insertionSort(unSortedArray);
        //verify if the unsorted array is sorted by the Insertion sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }

        //apply unsorted array to Bubble Sort.
        sort.bubbleSort(unSortedArray);
        //verify if the unsorted array is sorted by the Bubble sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }


        //apply unsorted array to Merge Sort.
        sort.mergeSort(unSortedArray);
        //verify if the unsorted array is sorted by the Merge sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }


        //apply unsorted array to Quick Sort.
        sort.quickSort(unSortedArray);
        //verify if the unsorted array is sorted by the Quick sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }



        //apply unsorted array to Heap Sort.
        sort.heapSort(unSortedArray);
        //verify if the unsorted array is sorted by the Heap sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }


        //apply unsorted array to Bucket Sort.
        sort.bucketSort(unSortedArray);
        //verify if the unsorted array is sorted by the Bucket sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }

        //apply unsorted array to Shell Sort.
        sort.shellSort(unSortedArray);
        //verify if the unsorted array is sorted by the Shell sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }

    }
}
