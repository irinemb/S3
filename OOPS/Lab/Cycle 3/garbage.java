import java.util.*;
class Test
{
 protected void finalize()
 {
  System.out.println("Object is garbage collected");
  }
  public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);
    Test s1=new Test();
    Test s2=new Test();
    s1=null;
    s2=null;
    System.gc();
    }}
