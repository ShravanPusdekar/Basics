import java.util.Scanner;
public static void swap(int a, int b)
{
    int temp=a;
    a=b;
    b=temp;

}
public class secondLargestArray {
    public static void main(String[] args){
        int[] arr;
        arr=new int[5];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the five numbers");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            int largestNumber=0,secLargestNumber=0;
            if(arr[i]>largestNumber)
            {
                swap(arr[i],largestNumber);
            }

        }

    }
}

public void main() {
}
