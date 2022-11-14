class myRunnable implements Runnable
{
public void run()
{
int i;
for(i=0;i<10;i++)
{
System.out.println("child thread");//executed by child thread
}
}
}
class threadDemo
{
public static void main(String[] args)
{
myRunnable r=new myRunnable();
Thread t=new Thread();
Thread t1=new Thread(r);//target runnable
t.start();

t1.start();

t.run();

t1.run();
int i;
for(i=0;i<10;i++)//executed by main thread
{
System.out.println("main thread");
}
}
}