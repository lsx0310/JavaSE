package ThinkJava.This.StaticFields;

/**
 * @ClassName Spiciness
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public enum Spiciness {
    NOT,MILD,MEDIUM,HOT,FLAMING
}

class Burrito{
    Spiciness spiciness;
    Burrito (Spiciness spiciness){
        this.spiciness = spiciness;
    }

    public void describe(){
        System.out.println("This burrite is ");
        switch (this.spiciness){
            case HOT:System.out.println("not spicy at all");
            break;
            case MILD:
            case MEDIUM:System.out.println("a little hot");
            break;
            case NOT:
            case FLAMING:
            default:System.out.println(
                    "Maybe too hot"
            );
        }
    }
    public static void main(String[] args){
        Burrito plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
