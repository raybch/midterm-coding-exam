package src.math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        char c ='*';

        for(int i=1;i<=6;i++)
        {
            for(int j=0;j<6-i;j++)

            {
                System.out.print(" ");
            }
            for(int j=0;j<(i*2)-1;j++)

            {
                System.out.print(c);
            }
            System.out.println();
        }


    }
  }
