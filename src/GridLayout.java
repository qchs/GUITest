import java.awt.*;

/**
 * Created by Lenovo on 2018/4/7.
 */
public class GridLayout {
    public static void main(String[] args) {
        Frame f=new Frame("Grid");
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");

        f.setLayout(new java.awt.GridLayout(3,2));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
//        f.setBounds(500,500,600,500);
        f.pack();
        f.setVisible(true);
    }
}
