package src.math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int smallest = Integer.MAX_VALUE;
        int smallest1 = Integer.MAX_VALUE;
        int index = 0;
        int index1 = 0;


        while (index < array1.length) {
            if (smallest > array1[index]) {
                smallest = array1[index];
            }
            index++;
        }

        while (index1 < array2.length) {
            if (smallest1 > array2[index1]) {
                smallest1 = array2[index1];
            }
            index1++;
        }

        if (smallest < smallest1) {
            System.out.println(smallest);
        } else {
            System.out.println(smallest1);
        }
    }
}
