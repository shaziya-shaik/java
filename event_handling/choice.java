import java.awt.*;
class Text
{
public static void main(String[] args)
{
Frame f=new Frame();
f.setVisible(true);
f.setSize(400,400);
f.setTitle("for display text on the screen");
f.setBackground(Color.orange);
Choice ch=new Choice();
ch.add("c");
ch.add("cpp");
ch.add("java");
ch.add(".net");
ch.remove(".net");
ch.remove(0);
ch.insert("python",0);
f.add(ch);
System.out.println(ch.getItem(0)); 
System.out.println(ch.getSelectedItem()); 
System.out.println(ch.getSelectedIndex());
}
}