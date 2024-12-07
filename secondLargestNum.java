import java.util.Scanner;

public class secondLargestNum {
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
        int largest=Integer.MIN_VALUE,secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];

            }
        }
        System.out.println("The second largest number is  "+secondLargest);
    }
}
