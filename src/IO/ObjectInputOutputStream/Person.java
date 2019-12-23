package IO.ObjectInputOutputStream;

import java.io.Serializable;

/**
 * @ClassName Person
 * @Description: TODO
 * 对象要满足如下要求：
 * 1.实现接口：Serializable
 * 2.当前类提供一个全局常量：serialVersionUID  值是多少没有要求！
 * 3.除了当前Person类需要实现Serializable接口之外，他的所有属性必须保证可序列化
 * （默认情况下，基本数据类型皆可序列化）
 *
 * 补充：ObjectInputStream 和 ObjectOutputStream 不能序列化static和transient修饰的成员变量
 * @Authot li
 * @Date 2019/12/23
 * @Version v1.0
 **/

public class Person implements Serializable {

    private static final long serialVersionUID = -68412312354667710L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
