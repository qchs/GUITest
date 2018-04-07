import java.awt.*;

/**
 * Created by Lenovo on 2018/4/6.
 */
public class FrameTest {
    public static void main(String[] args) {
        Frame   f=new Frame("hello");
//        f.setLayout(null);
//        f.setLayout(new FlowLayout());
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setBackground(Color.pink);
        f.setSize(350,300);
//        f.setResizable(false);
        //出现在屏幕中的位置
        f.setLocation(500,500);
        f.setVisible(true);

        Panel p=new Panel(null);
        p.setBounds(50,50,150,100);
        p.setBackground(new Color(1,2,223));
        f.add(p);

    }
}
