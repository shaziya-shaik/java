class mythread extends Thread
{
public void run()
{
System.out.println("no arg");
}
public  void run(int i)
{
System.out.println("int arg1");
}
}
class threadDemo
{
public static void main(String[] args)
{
mythread t= new mythread();
t.start();
t.run();//explicit call
}
}