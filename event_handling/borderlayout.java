import java.awt.*;
class myframe extends Frame
{
Button b1,b2,b3,b4,b5;
myframe()
{
this.setVisible(true);
this.setBackground(Color.green);
this.setTitle("flow layout");
this.setSize(500,600);
this.setLayout(new BorderLayout());
b1=new Button("Girls");
b2=new Button("Boys");
b3=new Button("Teacher staff");
b4=new Button("non_teaching staff");
b5=new Button("management");
this.add("North",b1);
this.add("Center",b2);
this.add("South",b3);
this.add("East",b4);
this.add("West",b5);
}
}
class Demo
{
public static void main(String[] args)
{
myframe f=new myframe();
}
}