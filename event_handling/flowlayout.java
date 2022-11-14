import java.awt.*;
import java.awt.event.*;
class myframe extends Frame
{
myframe()
{
this.setVisible(true);
this.setBackground(Color.green);
this.setTitle("flow layout");
this.setSize(500,400);
Label l1=new Label("user name");
Label l2=new Label("pasword");
TextField tx1=new TextField(25);
TextField tx2=new TextField(25);
Button b=new Button("login");
tx2.setEchoChar('*');
this.setLayout(new FlowLayout());
this.add(l1);
this.add(l2);
this.add(tx1);
this.add(tx2);
this.add(b);
}
}
class Demo
{
public static void main(String[] args)
{
myframe f=new myframe();
}
}
