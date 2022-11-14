import java.awt.*;
import java.awt.event.*;
class myframe extends Frame
{
String label="";
MenuBar mb;
Menu m1,m2,m3;
MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9;
myframe()
{
this.setVisible(true);
this.setTitle("Menu");
this.setSize(400,400);
this.setBackground(Color.orange);
mb=new MenuBar();
this.setMenuBar(mb);
m1=new Menu("new");
m2=new Menu("option");
m3=new Menu("edit");
mb.add(m1);
mb.add(m2);
mb.add(m3);
 mi1=new MenuItem("create new");
 mi2=new MenuItem("update");
 mi3=new MenuItem("remove");
 mi4=new MenuItem("open");
 mi5=new MenuItem("save");
 mi6=new MenuItem("saveas");
 mi7=new MenuItem("font change");
 mi8=new MenuItem("font size");
 mi9=new MenuItem("color change");

m1.add(mi1);
m1.add(mi2);
m1.add(mi3);
m2.add(mi4);
m2.add(mi5);
m2.add(mi6);
m3.add(mi7);
m3.add(mi8);
m3.add(mi9);
}
public void actionPerformed(ActionEvent ae)
{
label=ae.getActionCommand();
repaint();
}
public void paint(Graphics g)
{
Font f=new Font("arial",Font.BOLD,25);
g.setFont(f);
g.drawString("selectedItem:"+label,50,200);
}
}
class Demo
{
public static void main(String[] args)
{
myframe f=new myframe();
}
}
