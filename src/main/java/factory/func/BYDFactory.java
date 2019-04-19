/*
 * @Project Name: design_pattern
 * @File Name: BYDFactory
 * @Package Name: java.mian.com.kipling.pattern.factory.func
 * @Date: 2019/4/19　 8:36
 * @Creator: Kipling
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.func;


import factory.product.car.BYD;
import factory.product.car.Car;

/**
 * TODO
 *
 * @author chenqiuping
 * @date 2019/4/19　 8:36
 * @see
 */
public class BYDFactory implements CarFactory {
    public Car productCar() {
        return new BYD();
    }
}
