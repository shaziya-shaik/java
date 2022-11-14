import java.awt.*;
import java.awt.event.*;
class MouseMotionAdapterExample extends MouseMotionAdapter
{
Frame f;
MouseMotionAdapterExample()
{
f=new Frame("Mouse  Motion Adapter");
f.addMouseMotionListener(this);
f.setSize(500,500);
f.setTitle("Event");
f.setLayout(null);
f.setVisible(true);
}
public void MouseDragged(MouseEvent e)
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
new MouseMotionAdapterExample();
}
}