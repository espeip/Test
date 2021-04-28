package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(new File("argument1.txt")));
        float[] x = new float[4];
        float[] y = new float[4];
        for (int i = 0; i < 4; i++) {
            x[i] = Float.parseFloat(scanner.next());
            y[i] = Float.parseFloat(scanner.next());
        }
        scanner = new Scanner(new FileReader(new File("argument2.txt")));
        while (scanner.hasNext()) {
            float x0 = Float.parseFloat(scanner.next());
            float y0 = Float.parseFloat(scanner.next());
            if (x0 == x[0] && y0 == y[0] || x0 == x[1] && y0 == y[1] ||
                    x0 == x[2] && y0 == y[2] || x0 == x[3] && y0 == y[3] ) {
                System.out.println(0);
            } else if ((x0 - x[0]) * (y[1] - y[0]) - (x[1]-x[0]) * (y0 - y[0]) < 0 ||
                        (x0 - x[1]) * (y[2] - y[1]) - (x[2]-x[1]) * (y0 - y[1]) < 0 ||
                        (x0 - x[2]) * (y[3] - y[2]) - (x[3]-x[2]) * (y0 - y[2]) < 0 ||
                        (x0 - x[3]) * (y[0] - y[3]) - (x[0]-x[3]) * (y0 - y[3]) < 0) {
                System.out.println(3);
            } else if ((x0 - x[0]) * (y[1] - y[0]) - (x[1]-x[0]) * (y0 - y[0]) > 0 &&
                    (x0 - x[1]) * (y[2] - y[1]) - (x[2]-x[1]) * (y0 - y[1]) > 0 &&
                    (x0 - x[2]) * (y[3] - y[2]) - (x[3]-x[2]) * (y0 - y[2]) > 0 &&
                    (x0 - x[3]) * (y[0] - y[3]) - (x[0]-x[3]) * (y0 - y[3]) > 0) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }
    }
}
