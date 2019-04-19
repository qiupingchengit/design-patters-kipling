package singleton.lazy;

/**
 * Created by Kipling on 2019/4/17.
 */

/**
 * @author kipling
 * @version 1.0
 * @ClassName: LazyDoubleCheckSingleton
 * @Package java.mian.com.kipling.pattern.singleton.lazy
 * @Description: 双重检验锁
 * @date 2019/4/17
 */
public class LazyDoubleCheckSingleton {
    // 可见性 防止指令重排序
    private volatile static LazyDoubleCheckSingleton doubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(doubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(doubleCheckSingleton == null){
                    doubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazy指向刚分配的内存地址
                    //4.初次访问对象
                }
            }
        }
        return doubleCheckSingleton;
    }
}
