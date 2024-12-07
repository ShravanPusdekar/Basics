import java.util.Scanner;

class employees
{
     Scanner sc = new Scanner(System.in);
        public void getId() {
            System.out.println("Please enter your Employee ID");
        int a = sc.nextInt();
        System.out.println("Employee Id-" + a);
    }

    /*

    public void setName(){
            System.out.println("Please enter your Name");
            String name=sc.nextLine();
    System.out.println("Name-"+name);
    }

    */

public void getName(){
    System.out.println("Please enter your Name");
    String name=sc.nextLine();
    System.out.println("Name-"+name);
}



}
public class employee {
    public static void main(String[] args) {
        employees e1=new employees();
        e1.getId();
        e1.getName();
    }
}
