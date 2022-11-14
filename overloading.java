class test{
public void m1(){
System.out.println("hi");
}
public void m1(int n){
System.out.println("n="+n);
}
public static void main(String[] args){
test s=new test();
s.m1();
s.m1(10);
}
}