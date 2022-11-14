class parent{
public void m1(){//overriden
System.out.println("Hi");
}
}
class child extends parent {//overriding
public void m1(){
System.out.println("hi shaziya");
}
}
class test{
public static void main(String[] args){
parent p=new parent();
p.m1();
child c=new child();
c.m1();
parent p1=new child();
p1.m1();
}
}
