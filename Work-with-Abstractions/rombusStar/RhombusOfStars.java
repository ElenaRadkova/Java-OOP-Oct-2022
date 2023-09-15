package rombusStar;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());


        printTopSide(size);
        printBottomSide(size);
    }

    private static void printTopSide(int size) {
        for (int starCount = 1; starCount <= size; starCount++) {
            printStars(size, starCount);
            System.out.println("*");
        }
    }

    private static void printBottomSide(int size) {
        for (int starCount = size - 1; starCount > 0; starCount--) {
            printStars(size, starCount);
            System.out.println("*");
        }
    }

    private static void printStars(int size, int starCount) {
        for (int i = 0; i < size - starCount; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < starCount - 1; i++) {
            System.out.print("* ");
        }
    }
}
