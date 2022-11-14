class mythread extends Thread//defining of a thread
{
public void run()
{
int i;
for( i=0;i<10;i++)//job of a thread
{
System.out.println("child class");
}
}
}
class threadDemo
{
public static void main(String[]  args)
{
int i;
mythread t=new mythread();//thread instantiation
t.run();//starting of a thread
for(i=0;i<10;i++)
{
System.out.println("main thread");
}
}
}