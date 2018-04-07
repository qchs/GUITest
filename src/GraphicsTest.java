import java.awt.*;

/**
 * Created by Lenovo on 2018/4/7.
 */
public class GraphicsTest {
    public static void main(String[] args) {
        new GFrame().lanuchFrame();
    }
}

class   GFrame extends Frame{
    public void lanuchFrame(){
        setBounds(500,500,600,550);
        setVisible(true);
    }

    public void paint(Graphics g){
        Color c=g.getColor();
        g.setColor(Color.cyan);
        g.fillOval(100,200,110,120);
        //还原现场，原来画笔的颜色
        g.drawLine(100,200,50,70);
        g.setColor(c);
    }
}
