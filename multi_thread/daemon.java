class mythread extends Thread
{}
class test
{
public static void main(String[] args)
{
System.out.println(Thread.currentThread().isDaemon());
mythread t=new mythread();
System.out.println(t.isDaemon());
t.setDaemon(true);
System.out.println(t.isDaemon());

}
}