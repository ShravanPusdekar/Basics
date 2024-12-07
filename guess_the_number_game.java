import java.util.*;

class Game{
    int userInput,a;
    int trails;
    Random random=new Random();
    Scanner sc=new Scanner(System.in);
    public  Game(){

         a=random.nextInt(100)+1;

    }



    public void isCorrectNumber() {
        System.out.println("Enter your Number-");
        while(true){


                userInput =sc.nextInt();

            trails++;
            if (userInput == a) {
                System.out.println("Congrats! You have guessed the number correctly.");
                System.out.println("Your Score was "+(100-trails));
                break;
            }
            else if (userInput > a) {
                System.out.println("The number is lower than " + userInput);
            }
            else {
                System.out.println("The number is greater than " + userInput);
            }
        }




    }
}
public class guess_the_number_game {
    public static void main(String[] args) {
        Game g1=new Game();
        g1.isCorrectNumber();
    }
}
