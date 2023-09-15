package rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] coordinatesOfRectangle = Arrays.stream((scanner.nextLine()
                .split(" ")))
                .mapToInt(Integer::parseInt)
                .toArray();
      // вариант 1 за създаване на точка
        Point pointLeft = new Point(coordinatesOfRectangle[0], coordinatesOfRectangle[1]);

        // вариант 2 за създаване на точка
        int xTopRight = coordinatesOfRectangle[2];
        int yTopRight = coordinatesOfRectangle[3];
        Point pointRight = new Point(xTopRight, yTopRight);

        Rectangle rectangle = new Rectangle(pointLeft, pointRight);

        int count = Integer.parseInt(scanner.nextLine());
        System.out.println();

        for (int i = 0; i < count; i++) {
            int[] pointCoordinates = Arrays.stream((scanner.nextLine()
                            .split(" ")))
                            .mapToInt(Integer::parseInt)
                            .toArray();

            Point current = new Point(pointCoordinates[0], pointCoordinates[1]);


            System.out.println(rectangle.contains(current));

        }
    }
}
