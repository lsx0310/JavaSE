package ClassPackage.DynamicProxy;

/**
 * @ClassName AdminServicelmp
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class AdminServicelmp implements AdminService {

    @Override
    public void update() {
        System.out.println("修改管理系统数据");
    }

    @Override
    public Object find() {
        System.out.println("查看管理系统数据");
        return new Object();
    }
}
