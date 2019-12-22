package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Order
 * @Description: TODO  自定义的泛型类
 * @Authot li
 * @Date 2019/12/17
 * @Version v1.0
 **/

public class Order<T> {

    String orderName;
    int orderId;
    T orderT;


    public Order(){}


    //以下三个方法都不是泛型方法
    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }


    //泛型方法是指 在定义方法体时出现的泛型结构
    //换言之，一个方法是不是泛型方法与所在类是不是泛型类没有关系
    //泛型方法
    public <E> List<E> copyFromArrayToList(E[] arr){

        ArrayList<E> list = new ArrayList<>();


        for (E e : arr){
            list.add(e);
        }

        return list;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
}
