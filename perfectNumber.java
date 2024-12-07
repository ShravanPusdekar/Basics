import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        int sum=0,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  number");
        num= sc.nextInt();
        for (int i = 1; i < num; i++) {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        if(sum==num) System.out.println(num+" is perfect number");
        else System.out.println(num+" is not a perfect number");

    }
}
