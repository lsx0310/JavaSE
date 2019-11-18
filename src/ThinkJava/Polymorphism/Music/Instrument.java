package ThinkJava.Polymorphism.Music;

/**
 * @ClassName Instrument
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/18
 * @Version v1.0
 **/

public class Instrument {

    public void play(Note note){
        System.out.println("Instrument.play()");
    }
}


class Wind extends Instrument{

    @Override
    public void play(Note note) {
        System.out.println("Wind.play()" + note);
    }
}

