class mythread extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("child Thread");
try
{
Thread.sleep(2000);
}
catch(InterruptedException e)
{}
}
}
}
class DaemonDemo
{
public static void main(String[] args)
{
mythread t=new mythread();
t.setDaemon(true);
t.start();
System.out.println("main Thread end");
}
}