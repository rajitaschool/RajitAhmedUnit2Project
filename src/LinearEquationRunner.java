import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        LinearEquation.start();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        int indexLen1 = coord1.indexOf(","); //Both numbers separate at the comma so all I need to do is isolate them through finding the index of the comma.
        String coordx1 = coord1.substring(1, indexLen1);
        String coordy1 = coord1.substring(indexLen1+2, coord1.length()-1); // +2 for the space in between comma and y number
        int intCordX1 = Integer.parseInt(coordx1);
        int intCordY1 = Integer.parseInt(coordy1);

        System.out.println("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        int indexLen2 = coord2.indexOf(",");
        String coordx2 = coord2.substring(1, indexLen2);
        String coordy2 = coord2.substring(indexLen2+2, coord2.length()-1);
        int intCordX2 = Integer.parseInt(coordx2);
        int intCordY2 = Integer.parseInt(coordy2);

        if(intCordX1 == intCordX2) {
            System.out.println("These points are on a vertical line: x = " + intCordX1); // Run this first in case x1 x2 are equal, always print if meets this case.
        } else {
            LinearEquation point1 = new LinearEquation(intCordX1, intCordY1,intCordX2,intCordY2);
            System.out.println(point1.lineInfo());
            System.out.println("Enter a value for x: ");
            double newXPoint = scan.nextDouble();
            scan.nextLine();
            System.out.println(point1.coordinateForX(newXPoint));
        }

    }
}
