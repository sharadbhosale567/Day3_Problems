package Practice;

import java.util.Scanner;

public class LineComparisonProblemUc1 {
    public static void main(String[] args) {
        Scanner pt = new Scanner(System.in);

        System.out.println("Enter x1,y1 Co-ordinate : - ");
        int x1 = pt.nextInt();
        int y1 = pt.nextInt();

        System.out.println("Enter x2,y2 Co-ordinate : - ");
        int x2 = pt.nextInt();
        int y2 = pt.nextInt();

        double LENGTH_OF_LINE = Math.sqrt((x2 - x1) * (x2 + x1) + (y2 - y1) * (y2 + y1));
        System.out.println("Using Cartesian System calculated Length of line is : - " +LENGTH_OF_LINE);

    }
}
