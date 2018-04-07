import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lenovo on 2018/4/7.
 */
public class TestFiled {
    public static void main(String[] args) {
        new TFrame();
        new TFrame();

    }

}

class   TFrame extends Frame{
    TextField tf,tf1,tf2;
    TFrame(){

         tf=new TextField(10);//num1
        Label b=new Label("+");
        Button b1=new Button("=");
        tf1=new TextField(10);//num2
        tf2=new TextField(15);//sum
        add(tf);
        add(b);
        add(tf1);
        add(b1);
        add(tf2);

        tf.addActionListener(new TFActionListener());
        tf1.addActionListener(new TFActionListener());
//        b1.addActionListener(new addActionListener(tf,tf1,tf2));
        b1.addActionListener(new addActionListener(this));
        setBounds(500,500,600,550);
        setLayout(new FlowLayout());
        pack();
        setVisible(true);

    }

}

class TFActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        //通过getSource拿到tf
        TextField tf=(TextField)e.getSource();
//        int a=tf.getText();
        System.out.println(tf.getText());
        //输入完后回车，显示到run，而之前输入的就清空
        tf.setText("");
    }
}

class addActionListener implements ActionListener{
//    TextField n1,n2,n3;
//    public addActionListener(TextField num1,TextField num2,TextField num3) {
//        n1=num1;
//        n2=num2;
//        n3=num3;
//
//    }

    //将TFrame作为成员变量，持有对方的引用
    TFrame tf=null;
    public addActionListener(TFrame tf) {
        this.tf=tf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //将两个输入框里的数据相加，然后显示到第三个文本框里
        //可是拿不到前两个输入框里的数据
        int sum=Integer.parseInt(tf.tf.getText())+Integer.parseInt(tf.tf1.getText());
       tf.tf2.setText(""+sum);
//        System.out.println("ok");

    }
}

