class mythread extends Thread
{
public void run()
{
System.out.println("executed by thread"+Thread.currentThread().getName());
}
}
class test
{
public static void main(String[] args)
{
mythread t=new mythread();
t.start();
System.out.println("excuted by thread"+Thread.currentThread().getName());
}
}
