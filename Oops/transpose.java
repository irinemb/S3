import java.util.*;
class matrix
{
public static void main(String ar[])
{
 int i,j;
 int a[][]=new int[50][50];
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the rows and column");
  int row=sc.nextInt();
  int col=sc.nextInt();
 System.out.println("Enter the matrix");
 for(i=0;i<row;i++)
 {
  for(j=0;j<col;j++)
  {
  a[i][j]=sc.nextInt();
  }
 } 
 System.out.println("The transpose of the matrix is ");
  for(i=0;i<row;i++)
 {
  for(j=0;j<col;j++)
  {
  System.out.print(a[j][i] + "\t");
  }
  System.out.println();
 } 
 } 
}
