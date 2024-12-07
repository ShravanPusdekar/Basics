import java.util.Scanner;

public class count_evenodd_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int even=0,odd=0;
        System.out.println("Enter the number of inputs");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0){
                even++;
            }
            else {
                odd++;
            }

        }
        System.out.println("There are "+even+" even numbers and "+ odd +" odd numbers ");


    }
}
