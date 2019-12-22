package Generic.GenClassExpr;

import java.util.List;

/**
 * @ClassName BaseDAO
 * @Description: TODO  定义了操作数据库中的表的通过操作
 *               ORM思想（数据库中的表和Java中的类的对应）
 * @Authot li
 * @Date 2019/12/17
 * @Version v1.0
 **/

public class BaseDAO<T> {//表的共性操作的DAO

    //根据下标返回一个对象
    public T getIndex(int index){
        return null;
    }

    //查询多条记录
    public List<T> getForList(int index){
        return null;
    }


    //泛型方法
    //举例：返回员工的个数？返回员工最久的工作时间?
    public <E> E getInfo(){
        return null;
    }
}
