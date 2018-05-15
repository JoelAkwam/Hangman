import java.util.*;

public class Hangman{

    public static void main(String [] args){

    String storedWord;
    char[] charString;
    int length;
    char[] wordCensor; 

    Scanner typedWord = new Scanner(System.in);
    System.out.println("Enter your word to guess: ");
    storedWord = typedWord.nextLine();  
    storedWord = storedWord.toUpperCase();
    length = storedWord.length(); 

    charString = storedWord.toCharArray();


    wordCensor = storedWord.toCharArray(); 
    System.out.println("Your secret word is: ");

    for (int index = 0; index < length; index++){
        wordCensor[index] = '*';
    }

    while (String.valueOf(wordCensor).equals(storedWord)== false){

        char charGuess;
        String tempWord;
        boolean correct = false;
        boolean repeated = false;

        for(int a = 0; a < length; a++){
             System.out.print(wordCensor[a]);
        }
        System.out.println();

        Scanner wordGuess = new Scanner(System.in);
        System.out.println("Type your guess: ");
        tempWord = wordGuess.next();
        charGuess = tempWord.charAt(0);

        if (repeated == false){
            for (int index = 0; index < length; index++){

                 if(charString[index] == Character.toUpperCase(charGuess)) {

                     wordCensor[index] = Character.toUpperCase(charGuess);           
                     correct = true; 
                  }
            }
            if(correct == true){
                System.out.println("The letter " + charGuess + " is in the secret word!");
            }else{
                System.out.println("Sorry, the letter is not in the word!");
            }
            System.out.println();
        }
    }
    System.out.println("You guessed the entire word "+ storedWord.toUpperCase() + " correctly!");
    }
}
