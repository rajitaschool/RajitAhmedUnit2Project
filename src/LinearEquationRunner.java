import java.util.Locale;
import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        int indexLen1 = coord1.indexOf(",");
        String coordx1 = coord1.substring(1, indexLen1);
        String coordy1 = coord1.substring(indexLen1+2, coord1.length()-1);
        int intCordX1 = Integer.parseInt(coordx1);
        int intCordY1 = Integer.parseInt(coordy1);

        System.out.println("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        int indexLen2 = coord1.indexOf(",");
        String coordx2 = coord1.substring(1, indexLen1);
        String coordy2 = coord1.substring(indexLen1+2, coord1.length()-1);
        int intCordX2 = Integer.parseInt(coordx2);
        int intCordY2 = Integer.parseInt(coordy2);

    }
}
