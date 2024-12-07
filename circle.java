import java.util.Scanner;

class Name {
    private float a;
    Scanner sc=new Scanner(System.in);
    public void getData(){
        System.out.println("Enter the radius of circle");
         a= sc.nextInt();
        System.out.println("The value of radius is "+a);

    }
    public void area(){
        System.out.println("The Area of circle is "+(3.14f*a*a));

    }


}
public class circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Name n1=new Name();
        n1.getData();
        n1.area();

    }
}
