import java.io.*;
class Demo
{
public static void main(String[] args)throws IOException
{
FileWriter fw=new FileWriter("xyz.txt",true);
fw.write(99);
fw.write("\n");
fw.write("shaziya\nsoftware");
fw.write("\n");
char ch[]={'a','b','c','d','e'};
fw.write(ch);
fw.flush();
fw.close();
}
}