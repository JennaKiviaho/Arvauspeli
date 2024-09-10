import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String nimi = "Jenna"; // Oikea vastaus on Jenna

        System.out.println("Arvaa nimeni.");
        nimi = input.nextLine();
        
        if (nimi.equals("Jenna"))
        {
            System.out.println("Oikein! Onneksi olkoon!");
        }
        else
        {
            System.out.println("Väärin. Arvaa uudelleen.");
        }
    }
}
