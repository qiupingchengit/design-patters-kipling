
package singleton.hungry;

/**
 * Created by Kipling on 2019/4/17.
 */
/**
 * @author kipling
 * @version 1.0
 * @ClassName: HungrySingleton
 * @Package java.mian.com.kipling.pattern.singleton
 * @Description: 饿汉式单例
 * @date 2019/4/17
 */
public class HungrySingleton {

	private static final HungrySingleton hungrySingleton = new HungrySingleton();

	private HungrySingleton() {
	}

	public HungrySingleton getHungrySingleton() {
		return this.hungrySingleton;
	}
}
