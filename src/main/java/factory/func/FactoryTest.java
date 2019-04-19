/*
 * @Project Name: design_pattern
 * @File Name: FactoryTest
 * @Package Name: java.mian.com.kipling.pattern.factory.func
 * @Date: 2019/4/19　 0:38
 * @Creator: Kipling
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.func;


/**
 * 工厂模式
 *
 * @author chenqiuping
 * @date 2019/4/19　 0:38
 * @see
 */
public class FactoryTest {
    public static void main(String[] args) {
        //找到相对应的工厂去造车
        // 需要知道什么工厂造什么车  可能会搞错
        CarFactory bmwFactory = new BMWFactory();
        CarFactory bydFactory = new BYDFactory();
        CarFactory hondaFactory = new HondaFactory();
        bmwFactory.productCar().carBrand();
        bydFactory.productCar().carBrand();
        hondaFactory.productCar().carBrand();
    }
}
