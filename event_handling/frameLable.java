import java.awt.*;
class Demo
{
public static void main(String[] args)
{
Frame f=new Frame();
f.setVisible(true);
f.setSize(400,400);
f.setTitle("for display text on the screen");
f.setBackground(Color.orange);
Label l=new Label("user name");
f.add(l);
}
}