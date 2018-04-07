import java.awt.*;

/**
 * Created by Lenovo on 2018/4/7.
 */
public class BorderFrame {
    public static void main(String[] args) {
        Frame f=new Frame("borderFrame");
        Button bn=new Button("north");
        Button bs=new Button("south");
        Button be=new Button("east");
        Button bw=new Button("west");
        Button bc=new Button("center");

        f.add(bn,BorderLayout.NORTH);
        f.add(bs,BorderLayout.SOUTH);
        f.add(be,BorderLayout.EAST);
        f.add(bw,BorderLayout.WEST);
        f.add(bc,BorderLayout.CENTER);
        f.setBounds(500,500,600,500);
        f.setVisible(true);
    }
}
