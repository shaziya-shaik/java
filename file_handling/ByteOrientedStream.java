import java.io.*;
class Demo
{
public static void main(String[] args)throws Exception
{
FileInputStream fis=new FileInputStream("abc.txt");
FileOutputStream fos=new FileOutputStream("xyz.txt");
int c;
while((c=fis.read())!=-1)
{
System.out.print((char)c);
fos.write(c);
}
System.out.println("read option and write options are completed");
fis.close();
fos.close();
}
}