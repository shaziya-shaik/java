import java.awt.*;
class myframe extends Frame
{
Button b1,b2,b3,b4,b5;
myframe()
{
this.setBackground(Color.orange);
this.setVisible(true);
this.setSize(400,400);
this.setLayout(new BorderLayout());
add(new Button("Girls"),BorderLayout.NORTH);
add(new Button("Boys"),BorderLayout.CENTER);
add(new Button("Teacher staff"),BorderLayout.EAST);
add(new Button("non_teaching staff"),BorderLayout.WEST);
add(new Button("management"),BorderLayout.SOUTH);
}
}
class Demo
{
public static void main(String[] args)
{
myframe f=new myframe();
}
}