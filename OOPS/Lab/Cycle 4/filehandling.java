import java.io.*;
class handling
{
public static void main(String ar[])
{
 try
 {
 FileReader reader=new FileReader("input.txt");
 FileWriter writer=new FileWriter("output.txt");
 int char;
 System.out.println("Reading from input file and writing to output file");
 while((character=reader.read())!=-1)
 {
 writer.write(character);
 System.out.println((char)character);
 }
 reader.close();
 writer.close();
 System.out.println("\nFile content written successfully to output file.");
 }
 catch(FileNotFoundException e)
 {
 System.out.prntln("Error:File not found -"+e.getMesssage());
