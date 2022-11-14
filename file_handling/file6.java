import java.io.*;
class Demo
{
public static void main(String[] args)throws IOException
{
int count=0;
File f=new File("E:\\data\\desktop\\java\\file_handling");
String[] s=f.list();
for(String s1:s)
{
File f1=new File(f,s1);
if(f1.isDirectory())
{
count++;
System.out.println(s1);
}
}
System.out.println("count="+count);
}
}