import java.util.*;



public class rsp_game {
    public static void main(String[] args) {
        Random random=new Random();
        /*
        1 for paper
        2 for scissor
        3 for stone
         */
        Scanner sc=new Scanner(System.in);
        System.out.println(
                "        1 for paper \n" +
                "        2 for scissor\n" +
                "        3 for stone\n"+"Enter your Choice-");

        int userInput=sc.nextInt();
        System.out.println("Your Choice is "+userInput);
        int comInput= random.nextInt(3);

        if(userInput==comInput)
        {
            System.out.println("Draw!");
        } else if (userInput == 1 && comInput == 3 || userInput==2&&comInput==1||userInput==3&&comInput==2) {
            System.out.println("You Win!");
            
        }
        else {
            System.out.println("Computer wins!");
        }
        System.out.println("Computer's Choice- "+comInput);

    }
}
