package ClassPackage.InnerClass;

import sun.util.resources.TimeZoneNames_zh_TW;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
import javax.swing.Timer;

/**
 * @ClassName InnerClassTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/18
 * @Version v1.0
 **/

public class InnerClassTest {

    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);
    }
}


class TalkingClock{

    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){
        ActionListener listener = new TimerPrinter();
        Timer t = new Timer(interval,listener);
        t.start();
    }

    public class TimerPrinter implements ActionListener{

        public void actionPerformed(ActionEvent event){
            Date now = new Date();
            System.out.println("At the tone,the time is" + now);
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
