class mythread extends Thread
{
int i;
public void run()
{
for(i=0;i<10;i++)
{
System.out.println("I am lazy ");
}
System.out.println("I want to sleep");
try
{
Thread.sleep(2000);
}
catch(InterruptedException e)
{
System.out.println(" I got interrupted");
 }
}
}
class InterruptDemo
{
public static void main(String[] args)throws InterruptedException
{
mythread t=new mythread();
t.start();
t.interrupt();
System.out.println("main thread");
}
}