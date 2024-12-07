import java.util.*;

class rectangle{
    float l,b,area,perimeter;
    Scanner sc=new Scanner(System.in);

    public rectangle() {
        this.l = l;
        this.b = b;
        System.out.println("Enter the length and breadth of rectangle respectively");
        l= sc.nextFloat();
        b= sc.nextFloat();
    }


    public void area(){
        System.out.println("The area of rectangle- " +(l*b)+ " m\u00B2");
    }
    public void perimeter(){
                System.out.println("The perimeter of rectangle - "+(2*l+2*b)+ " m\u00B2");

    }
}
public class rect_constructor {
    public static void main(String[] args) {
        rectangle rect=new rectangle();
        rect.area();
        rect.perimeter();

    }
}
