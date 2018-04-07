import java.awt.*;

/**
 * Created by Lenovo on 2018/4/6.
 */
public class SelfFrame {
    public static void main(String[] args) {
        MyFrame mf=new MyFrame("test",500,400,600,400);
    }
}

 class MyFrame extends Frame{
    Panel p=new Panel(null);

     public MyFrame(String title, int x,int y,int w,int h) {
         super(title);
         setBounds(x,y,w,h);
         setLayout(null);
         setBackground(Color.pink);
         p.setBackground(Color.cyan);
         add(p);
         p.setBounds(w/4,h/4,w/2,h/2);
         setVisible(true);
     }


 }