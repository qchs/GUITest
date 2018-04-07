import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lenovo on 2018/4/7.
 */
public class allLayout {
    public static void main(String[] args) {
        Frame f=new Frame("test");
        Button b1=new Button("butten1");
        Button b2=new Button("butten2");
        Button b3=new Button("butten");
        Button b4=new Button("butten");
        Button b5=new Button("butten");
        Button b6=new Button("butten");
        Button b7=new Button("butten");
        Button b8=new Button("butten");
        Button b9=new Button("butten");
        Button b10=new Button("butten");

        //在button上加载一个事件
        Monitor m=new Monitor();
        b1.addActionListener(m);
        b2.addActionListener(m);

        Panel p1=new Panel(new GridLayout(2,1));
        p1.add(b2);
        p1.add(b3);

        Panel p2=new Panel(new GridLayout(2,2));
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        f.setLayout(new GridLayout(2,3));

        f.add(b1);
        f.add(p1);
        f.add(b4);
        f.add(b5);
        f.add(p2);
        f.add(b10);
        f.setBounds(500,600,600,500);
        f.setVisible(true);
    }
}

 class Monitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ok"+e.getActionCommand());
    }
}