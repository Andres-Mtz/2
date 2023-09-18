import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListEx {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int randNo = rand.nextInt(9) + 1;
            list.add(randNo);
        }

        System.out.println("Liste: " + list);
        System.out.print("Geben Sie eine Suchzahl zwischen 1 und 9 ein: ");
        int inputNo = scanner.nextInt();
        int count = 0;

        ArrayList<Integer> indices = new ArrayList<>();
        for (Integer i : indices) {
            if (list.get(i) == inputNo) {
                count++;
                indices.add(i);
            }
        }

        System.out.println("Die Zahl " + inputNo + " kommt " + count + " Mal vor.");
        System.out.println("Indices, an denen die Zahl auftritt: " + indices);

        list.removeIf(num -> num == inputNo);

        System.out.println("Liste nach dem Löschen: " + list);

        for (Integer i : list) {
            if (list.get(i) == 5) {
                list.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("Liste nach dem Einfügen von 0: " + list);
    }
}
