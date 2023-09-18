import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, String> telefonbuch = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        handleTelefonbuch(telefonbuch, scanner);
    }

    private static void handleTelefonbuch(Map<String, String> telefonbuch, Scanner scanner) {
        while (true) {
            System.out.println("Telefonbuch-Menü:");
            System.out.println("a) Telefonnummer hinzufügen");
            System.out.println("b) Telefonnummer löschen");
            System.out.println("c) Telefonnummer überschreiben");
            System.out.println("d) Telefonnummer abfragen");
            System.out.println("e) Alle Einträge auslesen");
            System.out.println("f) Alle Einträge löschen");
            System.out.println("x) Ende");
            System.out.println("--------------------");
            System.out.println(" ");
            System.out.print("Bitte wählen Sie eine Option: ");
            String option = scanner.next();

            switch (option.toLowerCase()) {
                case "a":
                    System.out.print("Name: ");
                    String name = scanner.next();
                    System.out.print("Telefonnummer: ");
                    String telefonnummer = scanner.next();
                    telefonbuch.put(name, telefonnummer);
                    System.out.println("Telefonnummer hinzugefügt.");
                    System.out.println(" ");
                    break;

                case "b":
                    System.out.print("Name zum Löschen: ");
                    String nameToDelete = scanner.next();
                    if (telefonbuch.containsKey(nameToDelete)) {
                        telefonbuch.remove(nameToDelete);
                        System.out.println("Telefonnummer gelöscht.");
                        System.out.println(" ");
                    } else {
                        System.out.println("Name nicht gefunden.");
                        System.out.println(" ");

                    }
                    break;

                case "c":
                    System.out.print("Name zum Überschreiben: ");
                    String nameToOverride = scanner.next();
                    if (telefonbuch.containsKey(nameToOverride)) {
                        System.out.print("Neue Telefonnummer: ");
                        String newTelefonnummer = scanner.next();
                        telefonbuch.put(nameToOverride, newTelefonnummer);
                        System.out.println("Telefonnummer überschrieben.");
                        System.out.println(" ");
                    } else {
                        System.out.println("Name nicht gefunden.");
                        System.out.println(" ");
                    }
                    break;

                case "d":
                    System.out.print("Name zum Abfragen: ");
                    String nameToQuery = scanner.next();
                    if (telefonbuch.containsKey(nameToQuery)) {
                        String queriedTelefonnummer = telefonbuch.get(nameToQuery);
                        System.out.println("Telefonnummer: " + queriedTelefonnummer);
                        System.out.println(" ");
                    } else {
                        System.out.println("Name nicht gefunden.");
                        System.out.println(" ");
                    }
                    break;

                case "e":
                    for (Map.Entry<String, String> entry : telefonbuch.entrySet()) {
                        System.out.println("Name: " + entry.getKey() + ", Telefonnummer: " + entry.getValue());
                        System.out.println(" ");
                    }
                    break;

                case "f":
                    telefonbuch.clear();
                    System.out.println("Alle Einträge gelöscht.");
                    System.out.println(" ");
                    break;

                case "x":
                    System.out.println("Programm beendet.");
                    System.out.println(" ");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ungültige Option. Bitte erneut wählen.");
                    System.out.println(" ");
                    break;
            }
        }
    }
}
