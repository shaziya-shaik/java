class mythread extends Thread
{
public void run()
{
int i;
for(i=0;i<10;i++)
{
System.out.println("child thread");
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{}
}
}
}
class threadjoinDemo
{
public  static void main(String[] args)throws InterruptedException
{
int i;
mythread t=new mythread();
t.start();
t.join();
for(i=0;i<10;i++)
{
System.out.println("main thread");
}
}
}