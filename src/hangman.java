import java.util.*;
public class hangman {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer();
        String wordGuess;
        int wordLenght;
        int livesLost = 0;
        int livesTotal = 7;
        int lettersLeft;
        boolean wordLetters;
        char latters;
        StringBuffer lettersErvoor;
        int positie;
        boolean active;


        
        String[] verlaten = new String[]{"exit"};
        String[] stringLijst = new String[]{"kill", "trump", "all", "day", "long", "depresie", "is", "leuk"};
        String input = "";

        System.out.println("welkom bij mijn hangman game");
        wordGuess = stringLijst[(int) (Math.random() * stringLijst.length)];
        wordLenght = wordGuess.length();

        System.out.println("your words has  " + wordLenght + " letters in it.");
        lettersLeft = wordLenght;

        for (positie = 0; positie < wordLenght; positie++) {
            buffer.append("_ ");
        }
        System.out.println(buffer.toString());
       
        active = false;

        System.out.println("if you whant to stop enter exit");
        System.out.println("If you wish to play enter enter.");
        input = myScanner.nextLine();
        if(input.equals(verlaten[0])){
            active = true;
        }

        while (!active) {


            while (lettersLeft > 0 && livesTotal <= 7) {
                System.out.println("Take a guess!");
                latters = myScanner.findWithinHorizon(".", 0).charAt(0);

                wordLetters = (wordGuess.indexOf(latters)) != -1;

                if (wordLetters == false) {
                    livesLost++;
                    System.out.println("you have lost a life.");
                    System.out.println(livesTotal - livesLost + " left");
                } else {
                    System.out.println("That was correct!");

                    for (positie = 0; positie < wordLenght; positie++) {
                        if (wordGuess.charAt(positie) == latters) {
                            System.out.println(latters);
                            lettersLeft--;
                        } else {
                            System.out.println("_ ");
                        }
                    }
                }
                lettersErvoor = buffer2.append(latters);
                System.out.println("Letters guessed before: ");
                System.out.println(lettersErvoor);
                System.out.println("Letters remaining: ");
                System.out.println(lettersLeft);

                if (livesLost == livesTotal) {
                    System.out.println("Sorry you have lost!");
                    System.exit(1);
                }
            }

            System.out.println("you won The word was: ");
            System.out.println(wordGuess);
            active = true;

        }
    }
}
