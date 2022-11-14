import java.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.FlowLayout;
class ButtonFrame extends Frame
{
ButtonFrame(String s)
{
super(s);
this.setSize(500,600);
this.setLayout(new GridLayout(4,3));
for(int i=1;i<=12;i++)
{
add(new Button("Button"+i));
}
this.setVisible(true);
}
}
class Demo
{
public static void main(String[] args)
{
ButtonFrame b=new ButtonFrame("shaziya");
}
}
