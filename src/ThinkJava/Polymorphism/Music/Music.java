package ThinkJava.Polymorphism.Music;

/**
 * @ClassName Music
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/18
 * @Version v1.0
 **/

public class Music {

    public static void tune(Instrument instrument){
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args){
        Wind wind = new Wind();
        tune(wind);
    }
}
