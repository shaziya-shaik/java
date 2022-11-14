class mythread  extends Thread
{
static Thread empty;
public void run()
{
try
{
empty.join();
}
catch(InterruptedException e)
{}
int i;
for(i=0;i<10;i++)
{
System.out.println("child thread");
}
}
}
class ThreadjoinDemo
{
public static void main(String[] args) throws InterruptedException
{
mythread.empty=Thread.currentThread();
mythread t=new mythread();
t.start();
int i;
for(i=0;i<10;i++)
{
System.out.println("main thread");
Thread.sleep(2000);
}
}
}