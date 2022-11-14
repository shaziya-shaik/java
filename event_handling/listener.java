import java.awt.*;
import java.awt.event.*;
class myframe extends Frame
{
myframe()
{
this.setVisible(true);
this.setSize(500,500);
this.setTitle("Event");
this.setBackground(Color.green);
this.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
}
}
class Demo
{
public static void main(String[] args)
{
myframe f=new myframe();
}
}
