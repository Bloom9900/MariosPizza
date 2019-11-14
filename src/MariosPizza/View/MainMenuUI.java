package MariosPizza.View;

public class MainMenuUI {

    public static void showMainMenu() {
        System.out.println("************************************************");
        System.out.println("Velkommen til Marios Pizza");
        System.out.println("Muligheder:");
        System.out.println("1. Vis Menu");
        System.out.println("2. Rediger ordre");
        System.out.println("3. Statistik");
        System.out.println("4. Afslut");
        System.out.println("************************************************");
    }

    public static void viewSubMenu() {
        System.out.println("************************************************");
        System.out.println("Muligheder:");
        System.out.println("1. Lav ny ordre");
        System.out.println("2. Slet ordre");
        System.out.println("3. Vis aktuelle ordre");
        System.out.println("************************************************");
    }
}
