class mythread extends Thread
{
public void start()
{
System.out.println("start method");
}
public  void run()
{
System.out.println("run method");
}
}
class threadDemo
{
public static void main(String[] args)
{
mythread t= new mythread();
t.start();
System.out.println("main method");
}
}