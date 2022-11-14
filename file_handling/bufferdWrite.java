import java.io.*;
class Demo
{
public static void main(String[] args)throws IOException
{
FileWriter fw=new FileWriter("def.txt");
BufferedWriter bw=new BufferedWriter(fw);
bw.write(99);
bw.newLine();
bw.write("shaziya solution");
bw.newLine();
char ch[]={'a','b','c','d'};
bw.write(ch);
bw.newLine();
bw.flush();
bw.close();
}
}