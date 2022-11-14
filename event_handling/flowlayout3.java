import java.awt.*;
class myframe extends Frame
{
myframe()
{
this.setVisible(true);
this.setSize(400,400);
this.setTitle("Event");
this.setBackground(Color.green);
}
public void paint(Graphics g)
{
Font f=new Font("arial",Font.BOLD,20);
g.setFont(f);
this.setForeground(Color.green);
g.drawString("HI BTECH",100,100);
g.drawString("good girls&",300,300);
g.drawString("good boys",200,200);
}
}
class Demo
{
public static void main(String[] args)
{
myframe f=new myframe();
}
}