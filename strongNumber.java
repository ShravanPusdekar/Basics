import java.util.Scanner;

public  class strongNumber {
    public static int factorial(int a){
        int factorial=1;
        for (int i = 1; i <=a; i++) {
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt(),sum=0;
        int temp=a;
        while(a!=0) {
            sum+=factorial(a%10);
            a=a/10;
        }
        if (sum==temp) System.out.println(temp +" is Strong Number");
        else System.out.println(temp+" is not Strong number");
    }
}
