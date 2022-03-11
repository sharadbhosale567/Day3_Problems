package Practice;

import java.util.Scanner;

public class LineComparisonProblemUC2 {
    public static void main(String[] args) {
        Scanner pt = new Scanner(System.in);

        System.out.println("Enter x1,y1 Co-ordinate : - ");
        int x1 = pt.nextInt();
        int y1 = pt.nextInt();

        System.out.println("Enter x2,y2 Co-ordinate : - ");
        int x2 = pt.nextInt();
        int y2 = pt.nextInt();

        double LENGTH_OF_LINE1 = Math.sqrt((x2 - x1) * (x2 + x1) + (y2 - y1) * (y2 + y1));
        System.out.println("Using Cartesian System calculated Length1 of line is : - " +LENGTH_OF_LINE1);

        System.out.println("Enter x3,y3 Co-ordinate : - ");
        int x3 = pt.nextInt();
        int y3 = pt.nextInt();

        System.out.println("Enter x4,y4 Co-ordinate : - ");
        int x4 = pt.nextInt();
        int y4 = pt.nextInt();

        double LENGTH_OF_LINE2 = Math.sqrt((x4 - x3) * (x4 + x3) + (y4 - y3) * (y4 + y3));
        System.out.println("Using Cartesian System calculated Length2 of line is : - " +LENGTH_OF_LINE2);

           if(LENGTH_OF_LINE1 == LENGTH_OF_LINE2 ) {
               System.out.println("Two lines are equals");
           }
           else {
               System.out.println("Two lines are not equal");
           }
    }
}
