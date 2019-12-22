package Generic.GenExpr2;

import sun.plugin.javascript.navig.AnchorArray;

import java.util.*;

/**
 * @ClassName DAO
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/18
 * @Version v1.0
 **/

public class DAO<T> {

    private T entity;
    private String id;
    private Map<String,T> map = new HashMap<>();

    public void save(String id,T entity){
        map.put(id,entity);
        System.out.println("保存成功");
    }

    public T get(String id){
        System.out.println("获取数据");
        return map.get(id);
    }

    public void update(String id,T entity){
        map.put(id,entity);
        System.out.println("更新成功");
    }

    public List<T> list(){
        List<T> list = new ArrayList<>();

        Collection<T> collection = map.values();
        for (T t : collection){
            list.add(t);
        }

        return list;
    }

    public void delete(String id){
        map.remove(id);
        System.out.println("删除成功");
    }
}
