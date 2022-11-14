import java.io.*;
class Demo
{
public static void main(String[] args)
{
File f=new File("begum");
System.out.println(f.exists());
f.mkdir();
System.out.println(f.exists());
}
}