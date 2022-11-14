import java.awt.*; 
class Test
{
public static void main(String[] args)
{
Frame f=new Frame(); 
f.setVisible(true); 
f.setTitle("shaziya"); 
f.setBackground(Color.red); 
f.setSize(400,500);
Label l1=new Label("user name:"); 
TextField tx1=new TextField(); 
Label l2=new Label("password:"); 
TextField tx2=new TextField(); 
Button b=new Button("login"); 
f.add(l1);
f.add(tx1);
f.add(l2);
f.add(tx1);
f.add(b);
}
}