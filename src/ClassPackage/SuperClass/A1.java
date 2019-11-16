package ClassPackage.SuperClass;

/**
 * @ClassName A1
 * @Description: static 静态属性 只有一个某个对象修改后会影响别的
 * @Authot li
 * @Date 2019/10/11
 * @Version v1.0
 **/

public class A1 {

    static int x = 2;

    public void setx(int i){
        x = i;
    }

    void printa(){
        System.out.println(x);
    }
}
