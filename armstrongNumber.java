import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp= num;
        int digits= String.valueOf(Math.abs(num)).length();

        while(num!=0){
            sum+=Math.pow((num%10),digits);
            num=num/10;
        }
        if(sum==temp) System.out.println(temp+" is Armstrong number");
        else System.out.println(temp+" is not a Armstrong number");

    }
}
