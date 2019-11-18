package ClassPackage.InnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


/**
 * @ClassName anonymouseInnerClass
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/18
 * @Version v1.0
 **/

public class anonymousInnerClass {

    public static void main(String[] args){
        TalkingClock2 clock = new TalkingClock2();
        clock.start(1000,true);

        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);
    }
}


class TalkingClock2{
    public void start(int interval,final boolean beep){

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                System.out.println("At the tone,the time is" + now);
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer t = new Timer(interval,listener);
        t.start();

    }
}
