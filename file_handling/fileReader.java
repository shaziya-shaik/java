import java.io.*;
class Demo
{
public static void main(String[] args)throws IOException
{
FileReader fr=new FileReader("abc.txt");
int i= fr.read();
while(i!=-1)
{
System.out.print((char)i);
i=fr.read();
}
}
}
