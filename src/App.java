import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String nimi = "Jenna"; // Oikea vastaus on Jenna
        int arvaus = 0;

        System.out.println("Arvaa nimeni.");
        

        do // Toistorakenne
        {
        nimi = input.next();

        if (nimi.equals("Jenna")) // Jos vastaus on oikein
        {
            System.out.println("Oikein! Onneksi olkoon!");
            arvaus++;
        }
        if (!nimi.equals("Jenna")) // Jos vastaus on väärin
        {
            System.out.println("Väärin. Arvaa uudelleen. Tai kirjoita loppu päättääksesi pelin.");
            arvaus++;
        }
        if (nimi.equalsIgnoreCase("loppu"))
        {
            arvaus--;
            break;
        }
        } while (!nimi.equals("Jenna"));

        System.out.println("Arvasit " + arvaus + " kertaa.");
    }
}
