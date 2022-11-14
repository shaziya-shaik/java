class threadB extends Thread
{
int total=0;
public void run()
{
synchronized(this)
{
System.out.println("child thread start calucalation");
for(int i=1;i<=100;i++)
{
total=total+i;
}
System.out.println("child threAD trying to give notification");
this.notify();
}
;;;;;;;//1 lakh code
}
}
class threadA
{
public static void main(String[] args)throws InterruptedException
{
threadB b=new threadB();
b.start();
Thread.sleep(10);
synchronized(b)
{
System.out.println("main thread trying to call wait() method");
b.wait(1000);
System.out.println("main thread got notifiaction");
System.out.println(b.total);
}
}
}
