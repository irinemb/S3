abstract class shape
{
 void numberOfSides()
 {
  
}}
class rectangle extends shape
{
  void numberOfSides()
  {
  System.out.println("The number of sides of a rectangle is 4");
  }}
class triangle extends shape
{
  void numberOfSides()
  {
  System.out.println("The number of sides of a triangle is 3");
  }}
    class hexagon extends shape
{
  void numberOfSides()
  {
  System.out.println("The number of sides of a hexagon is 6");
  }}
  
class trigonometry
{
public static void main(String ar[])
{
  rectangle r=new rectangle();
  triangle t=new triangle();
  hexagon h=new hexagon();
  r.numberOfSides();
  t.numberOfSides();
  h.numberOfSides();
  
  }
  }
  
  
