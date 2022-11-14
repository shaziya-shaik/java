class Demo
{
public static void main(String[] args)
{
try
{
for(int i=0;i<10;i++)
{
Thread.sleep(1000);
System.out.println("i="+i);
}
}
catch(InterruptedException e){}
}
}