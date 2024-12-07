import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        int []arr1,arr2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        arr1=new int[n];
        arr2=new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr1[i]= sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[n - 1 - i];
        }
        System.out.println("The reversed array is-");
        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i]);
        }

    }
}
