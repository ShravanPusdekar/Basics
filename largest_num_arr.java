import java.util.Scanner;

class isLargest
{
    public void islargest() {
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
        int largest=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("The largest number is  "+largest);

    }
}
public class largest_num_arr {
    public static void main(String[] args) {
        isLargest s =new isLargest();
        s.islargest();
    }
}
