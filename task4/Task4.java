package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.*;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {
        int[] time = new int[720];
        Scanner scanner = new Scanner(new FileReader(new File(args[0])));
        while (scanner.hasNext()) {
            String[] s = scanner.next().split(":");
            int i1 = Integer.parseInt(s[0])*60 + Integer.parseInt(s[1]);
            s = scanner.next().split(":");
            int i2 = Integer.parseInt(s[0])*60 + Integer.parseInt(s[1]);
            for (int i = i1-480; i < i2-480; i++)
                time[i]++;
        }
        List<Integer> list = new ArrayList<>();
        int countStart = 0, countFinish = 0, max = time[0];
        for (int i = 1; i < time.length; i++) {
            if (time[i] > max && time[i] != time[i-1]) {
                max = time[i];
                countStart = i;
                countFinish = i;
            } else if (time[i] == max && time[i] == time[i-1]) {
                countFinish = i+1;
            } else if (time[i] == max && time[i] != time[i-1]) {
                list.add(countStart);
                list.add(countFinish);
                countStart = i;
                countFinish = i;
            }
        }
        for (int i = 0; i < list.size();i = i+2) {
            System.out.println((list.get(i) + 480) / 60 + ":" + (list.get(i) + 480) % 60 + " " +
                    (list.get(i+1) + 480) / 60 + ":" + (list.get(i+1) + 480) % 60);
        }
        System.out.println((countStart + 480) / 60 + ":" + (countStart + 480) % 60 + " " +
                (countFinish + 480) / 60 + ":" + (countFinish + 480) % 60);

    }
}

