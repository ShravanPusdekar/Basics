import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        int elements,steps;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        elements=sc.nextInt();
        int[] arr1=new int[elements];
        int[] arr2 =new int[elements];
        int[] arr3 =new int[elements];
        for (int i = 0; i <elements ; i++) {
            arr3[i]= sc.nextInt();
        }
        for (int i = 0; i < elements; i++) {
            arr2[i]=arr1[elements-i-]
        }
        System.out.println("Enter the number of steps");
        steps= sc.nextInt();


    }
}
