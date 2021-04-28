package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(new FileReader(new File(args[0])));
        while (scanner.hasNext()) {
            list.add(Integer.parseInt(scanner.next()));
        }
        Collections.sort(list);
        double d = 0.9 * (list.size() - 1) + 1;
        int idx = (int) d;
        double presentil90 = list.get(idx-1) + (d - (double)idx) * (list.get(idx) - list.get(idx-1));

        double sum = list.get(0);

        int count = 1, countResult = 1;
        double median = 0.0;
        for (int i = 1; i < list.size(); i++) {
            sum += list.get(i);
            if (list.get(i) == list.get(i-1)) {
                count++;
            } else {
                if(count > countResult) {
                    countResult = count;
                    median = list.get(i-1);
                }
                count = 1;
            }
        }
        if(count > countResult) {
            median = list.get(list.size()-1);
        }
        double srednee = sum / list.size();
        double min = list.get(0);
        double max = list.get(list.size()-1);
        System.out.printf("%.2f\n", presentil90);
        System.out.printf("%.2f\n", median);
        System.out.printf("%.2f\n", max);
        System.out.printf("%.2f\n", min);
        System.out.printf("%.2f\n", srednee);
    }
}
