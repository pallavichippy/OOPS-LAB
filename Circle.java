import java.util.*;
class Circle
{
   int r;
   double area;
   Circle(int rad)
   {
       r =rad;
   }
   void calcArea()
   {
      area = 3.14 * r * r;
      System.out.println("Area is : "+area);
   }

  public static void main(String[] args)
  {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the radius : ");
      int r = in.nextInt();
      Circle c = new Circle(r);
      c.calcArea();
   }
}
      
