import java.awt.*;
class check
{
public static void main(String[] args)
{
Frame f=new Frame();
f.setVisible(true);
f.setBackground(Color.orange);
f.setSize(400,500);
f.setTitle("check box contains");
Checkbox cb=new Checkbox("cse",true);
f.add(cb);
System.out.println(cb.getLabel());
System.out.println(cb.getState());
}
}