import java.util.Scanner;
public class smallest_num_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in array");
        n= sc.nextInt();
        int[] arr= new int [n];


        System.out.println("Enter the array");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int smallest=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println("The  smallest number is  "+smallest);

    }


}
