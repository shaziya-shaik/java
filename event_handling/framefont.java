import java.awt.*;
class myframe extends Frame
{
public void paint(Graphics g)
{
Font f=new Font("arial",Font.ITALIC,25);
g.setFont(f);
g.drawString("hi shaziya how r u",100,100);
}
}
class Demo
{
public static void main(String[] args)
{
myframe fm=new myframe();
fm.setVisible(true);
fm.setSize(400,400);
fm.setTitle("for display text on the screen");
fm.setBackground(Color.orange);
}
}