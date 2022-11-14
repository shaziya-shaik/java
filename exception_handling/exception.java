class Demo
{
public static void main(String[] args)
{
try
{
System.out.println("this is try block:");

System.out.println(10/0);
}
catch(ArithmeticException e)
{
System.out.println("this is catch block:");
}
finally
{
System.out.println("this is finally block:");
}
}
}