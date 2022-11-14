import java.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.FlowLayout;
class ButtonFrame extends Frame
{
ButtonFrame(String s)
{
super(s);
this.setSize(200,100);
this.setLayout(new FlowLayout());
for(int i=1;i<=6;i++)
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
