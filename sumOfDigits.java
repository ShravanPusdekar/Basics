import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum =0;
        System.out.println("Enter a number");
        int num= sc.nextInt();
        if(num<0)
        {
            num=Math.abs(num);
        }
        if(num>0)
        {
            while(num!=0)
            {
                sum+=(num%10);
                num=num/10;
            }
        }

        System.out.println("The sum of digits of number is "+sum);


    }
}
