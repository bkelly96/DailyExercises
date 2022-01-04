import java.util.*;


public class Areas {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        triangle(sc);
        rectangle(sc);
        circle(sc);

    }

    public static void triangle(Scanner sc){
        System.out.println("Please Enter the base of the Triangle");
        double base = sc.nextFloat();
        System.out.println("Please enter the height of the triangle");
        double height = sc.nextFloat();

        double area = (base* height) / 2;;
        System.out.println("Area of triangle = " + area);
    }

    public static void rectangle(Scanner sc){
        System.out.println("Enter Length");
        double length = sc.nextDouble();
        System.out.println("Enter Breadth");
        double breadth = sc.nextDouble();


        double area = (length * breadth);
        System.out.println("Perimeter of rectangle = " + area);
    }

    public static void circle(Scanner sc){

        final double PI = Math.PI;

        System.out.println("Enter the Radius of the Circle?");
        double rad = sc.nextFloat();

        double area = ((22 * rad * rad) / 7);
        System.out.println("area of triangle = " + area);
    }
}
