package src.math.problems;

import org.junit.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.


        // Unit testing into each classes
        // Factorial Class
        try {
            Assert.assertNull(Factorial.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertNotNull(Factorial.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        // Fibonacci Class

        try {
            Assert.assertNull(Fibonacci.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertNotNull(Fibonacci.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        // FindLowestDifference Class
        try {
            Assert.assertNull(FindLowestDifference.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertNotNull(FindLowestDifference.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        // FindMissingNumber Class
        try {
            Assert.assertNull(FindMissingNumber.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertNotNull(FindMissingNumber.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        // LowestNumber Class
        try {
            Assert.assertNull(LowestNumber.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertNotNull(LowestNumber.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        // MakePyramid Class

        try {
            Assert.assertNull(MakePyramid.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertNotNull(MakePyramid.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        // Pattern Class
        try {
            Assert.assertNull(Pattern.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertNotNull(Pattern.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        // PrimeNumber Class
        try {
            Assert.assertNull(PrimeNumber.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertNotNull(PrimeNumber.class);
        }catch(Exception ex){
            ex.getMessage();
        }

        // Unit testing into each method

        try {
            Assert.assertEquals(1,Factorial.factRecursive(1));
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertEquals(6,Factorial.factRecursive(3));
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertEquals(6,Factorial.factIterative(3));
        }catch(Exception ex){
            ex.getMessage();
        }

        try {
            Assert.assertEquals(1,Factorial.factRecursive(1));
        }catch(Exception ex){
            ex.getMessage();
        }


        int maxNumber = 10;
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        try {
            Assert.assertEquals(9,FindMissingNumber.findMissingNumber(array,maxNumber));
        }catch(Exception ex){
            ex.getMessage();
        }





    }
}
