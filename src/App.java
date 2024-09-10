import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String nimi = "Jenna"; // Oikea vastaus on Jenna

        System.out.println("Arvaa nimeni.");
        

        do
        {
        nimi = input.next();
        if (nimi.equals("Jenna"))
        {
            System.out.println("Oikein! Onneksi olkoon!");
        }
        else
        {
            System.out.println("Väärin. Arvaa uudelleen.");
        }
    } while (!nimi.equals("Jenna"));
    }
}
