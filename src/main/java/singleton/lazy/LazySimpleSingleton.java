
package singleton.lazy;

/**
 * Created by Kipling on 2019/4/17.
 */
/**
 * @author kipling
 * @version 1.0
 * @ClassName: LazySimpleSingleton
 * @Package java.mian.com.kipling.pattern.singleton.lazy
 * @Description: 在外部需要使用的时候才进行实例化
 * @date 2019/4/17
 */
public class LazySimpleSingleton {

	private static LazySimpleSingleton lazySimpleSingleton;

	private LazySimpleSingleton() {
	}

	public static synchronized LazySimpleSingleton getInstance() {
		if (lazySimpleSingleton == null) {
			lazySimpleSingleton = new LazySimpleSingleton();
		}
		return lazySimpleSingleton;
	}
}
