package zacatek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prvniVec {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("vstup.txt");
        Scanner input = new Scanner(file);
        ArrayList<Integer> cisla = new ArrayList<>();
        int n;

        while (input.hasNext()) {
            cisla.add(input.nextInt());
        }

        input.close();

        Collections.sort(cisla);

        int median;
        int size = cisla.size();

        if (size % 2 == 1) {
            median = cisla.get(size / 2);
        }else  {
            median = (cisla.get(size / 2 - 1) + cisla.get(size / 2)) / 2;
        }

        System.out.println(median);
    }
}
