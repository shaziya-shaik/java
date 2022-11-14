import java.awt.*;
class A
{
public static void main(String[] args)
{
Frame f=new Frame();
f.setVisible(true);
f.setTitle("shaziya");
f.setBackground(Color.orange);
f.setSize(400,400);
f.setLayout(new FlowLayout());
List l=new List(4,true);
l.add("c");
l.add("cpp");
l.add("java");
l.add(".net");
l.remove(".net");
l.remove(0);
l.add("python",0);
f.add(l);
System.out.println(l.getSelectedItem());
}
}