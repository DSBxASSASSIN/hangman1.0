import java.util.Scanner;
public class hell {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer leeftijd = 0;

        String keuze;
        boolean yn = false;
        System.out.println("Heb je een scooter rijbewijs?: Ja of Nee?");
        keuze = scanner.next();

        switch (keuze){
            case "Ja":
                yn = true;
                System.out.println("Gefeliciteerd met je scooterrijbewijs!");
                break;
            case "Nee":
                yn = false;
                System.out.println("Je geeft aan dat je geen rijbewijs hebt.");
                break;
            default:
                yn =  false;
                break;

        }

        System.out.println("Hoe oud ben jij?");
        leeftijd = scanner.nextInt();
        if (leeftijd < 16){
            System.out.println("Je bent helaas te jong voor een rijbewijs!");
        }
        if (leeftijd >= 16 && leeftijd < 17 && yn == false){
            System.out.println("Je bent bevoegd om een scooter rijbewijs te halen.");
        }
        if (leeftijd >= 17 && leeftijd <18) {
            System.out.println("Je mag auto- en scooterrijlessen nemen!");
        }
        if (leeftijd >= 18){
            System.out.println("Je bent bevoegd om zowel scooter als auto te rijden!");
        }
    }
}