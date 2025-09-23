import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    /* Circle c1 = new Circle(10.1);
    Circle c2 = new Circle (14.0);
    Circle c3 = new Circle (20.5);

    System.out.println(c1.toString());

    String output = c2.toString();
    System.out.println(output);
    
    System.out.printf("%s%n" , c3.toString());

    System.out.println("The area of c1 is " + c1.getArea()); */

    /* Rectangle r1 = new Rectangle(2.6);
    Rectangle r2 = new Rectangle(4.5,6.5);

  

  
    System.out.println(r1.toString());

    System.out.println(r2.toString()); */

    RegularPolygon p1 = new RegularPolygon(7.5);
    RegularPolygon p2 = new RegularPolygon(4,7.5);

    System.out.printf("The side length is: %n" + 7.5);
    System.out.printf("%n", p1.toString());
    System.out.printf("%n", p2.toString());


    
  }
}
