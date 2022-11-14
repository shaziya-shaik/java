import java.awt.*;
import java.awt.event.*;
class MouseAdapterExample extends MouseAdapter
{
Frame f;
MouseAdapterExample()
{
f=new Frame("Mouse Adapter");
f.addMouseListener(this);
f.setVisible(true);
f.setSize(500,500);
f.setTitle("Event");
f.setLayout(null);
}
public void MouseClicked(MouseEvent e)
{
Graphics g=f.getGraphics();
g.setColor(Color.BLUE);
g.fillOval(e.getX(),e.getY(),30,30);
}
}
class Demo
{
public static void main(String[] args)
{
new MouseAdapterExample();
}
}