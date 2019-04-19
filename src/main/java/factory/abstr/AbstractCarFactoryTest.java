/*
 * @Project Name: design_pattern
 * @File Name: AbstractCarFactoryTest
 * @Package Name: java.mian.com.kipling.pattern.factory.abstr
 * @Date: 2019/4/19　 1:06
 * @Creator: Kipling
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.abstr;



/**
 * TODO
 *
 * @author chenqiuping
 * @date 2019/4/19　 1:06
 * @see
 */
public class AbstractCarFactoryTest {

    public static void main(String[] args) {
        // 只要找到造车厂就可以了，就可以得到我要的车
        //对于用户而言，更加简单了
        //用户只有选择的权利了，保证了程序的健壮性

        CarAbstractFactory carFactory = new HondaCarFactory();
        carFactory.produceCar().carBrand();
        carFactory.prroduceEngine().run();

    }
}
