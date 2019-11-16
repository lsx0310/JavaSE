package ClassPackage.Timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
import javax.swing.Timer;

/**
 * @ClassName TimerTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class TimerTest {

    public static void main(String[] args){
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                System.out.println("At the tone,the time is" + now);
                Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer t = new Timer(1000,listener);
        t.start();

        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);
    }
}

//class TimePrinter implements ActionListener{
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Date now = new Date();
//        System.out.println("At the tone,the time is" + now);
//        Toolkit.getDefaultToolkit().beep();
//    }
//}
