import java.util.Scanner;

public class sum_n_natural {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("The sum is-"+sum);
    }
}
