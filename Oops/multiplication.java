import java.util.*;
class matrix
{
public static void main(String ar[])
{
 int i,j;
 int a[][]=new int[50][50];
 int b[][]=new int[50][50];
 int c[][]=new int[50][50];
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the rows and column");
  int row=sc.nextInt();
  int col=sc.nextInt();
 System.out.println("Enter the first matrix");
 for(i=0;i<row;i++)
 {
  for(j=0;j<col;j++)
  {
  a[i][j]=sc.nextInt();
  }
 } 
  System.out.println("Enter the second matrix");
 for(i=0;i<row;i++)
 {
  for(j=0;j<col;j++)
  {
  b[i][j]=sc.nextInt();
  }
 } 
 for(i=0;i<row;i++)
 {
  for(j=0;j<col;j++)
  {
  c[i][j]=a[i][j]*b[j][i];
  }
 } 
 System.out.println("The product of the given matrix is ");
 for(i=0;i<row;i++)
 {
  for(j=0;j<col;j++)
  {
 System.out.print(+c[i][j]);
 }
 System.out.println("\n");
  }
 }}
