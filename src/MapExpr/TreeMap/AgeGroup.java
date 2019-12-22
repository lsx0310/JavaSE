package MapExpr.TreeMap;

/**
 * @ClassName AgeGroup
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/9
 * @Version v1.0
 **/

public enum AgeGroup {

    AGED(60),
    MIDAGE(45),
    YOUNGAGE(18),
    TEENAGE(12);





    private int age;

    AgeGroup(int age){
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

}
