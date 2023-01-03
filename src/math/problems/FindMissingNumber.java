package src.math.problems;

public class FindMissingNumber {

        //public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         //int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        static void print(String value) {
            System.out.print(value);}
        static void findMissingNumber(int[] arr, int max){

            int sumOfAllNumbers = 0;
            int currentSum = 0;
            sumOfAllNumbers = (max * (max + 1))/2;
            for (int i =0;i<arr.length;i++){
                currentSum += arr[i];
            }
            print("Missing number "+ (sumOfAllNumbers - currentSum));
        }
        public static void main(String[] args) {
            int maxNumber = 10;
            int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
            findMissingNumber(array, maxNumber);
        }
    }


