package ClassPackage.equals;

/**
 * @ClassName Apple
 * @Description: TODO
 * @Authot li
 * @Date 2019/10/11
 * @Version v1.0
 **/

public class Apple {

    private String color;
    private boolean ripe;

    public void Apple(String color,boolean ripe){
        this.color = color;
        this.ripe = ripe;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRipe(boolean ripe) {
        this.ripe = ripe;
    }

    public String getColor() {
        return color;
    }

    public boolean isRipe() {
        return ripe;
    }

    public boolean equals(Object B){
        if (B instanceof Apple){
            Apple a = (Apple) B;
            return (this.color.equals(a.getColor()) && (this.ripe == a.isRipe()));
        }
        return false;
    }
}
