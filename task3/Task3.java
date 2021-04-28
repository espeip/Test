package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new FileReader(new File(args[0] + "Cash1.txt")));
        Scanner scanner2 = new Scanner(new FileReader(new File(args[0] + "Cash2.txt")));
        Scanner scanner3 = new Scanner(new FileReader(new File(args[0] + "Cash3.txt")));
        Scanner scanner4 = new Scanner(new FileReader(new File(args[0] + "Cash4.txt")));
        Scanner scanner5 = new Scanner(new FileReader(new File(args[0] + "Cash5.txt")));
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            list.add(Double.parseDouble(scanner1.nextLine()) +
                    Double.parseDouble(scanner2.nextLine()) +
                    Double.parseDouble(scanner3.nextLine()) +
                    Double.parseDouble(scanner4.nextLine()) +
                    Double.parseDouble(scanner5.nextLine()));
        }
        double max = list.get(0);
        int index = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                index = i + 1;
            }
        }
        System.out.println(index);
    }
}
