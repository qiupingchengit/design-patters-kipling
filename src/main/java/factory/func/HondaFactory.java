/*
 * @Project Name: design_pattern
 * @File Name: BMWFactory
 * @Package Name: java.mian.com.kipling.pattern.factory.func
 * @Date: 2019/4/19　 0:27
 * @Creator: chenqiuping-516
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.func;


import factory.product.car.Car;
import factory.product.car.Honda;

/**
 * 宝马车工厂
 *
 * @author chenqiuping
 * @date 2019/4/19　 0:27
 * @see
 */
public class HondaFactory implements CarFactory{
    public Car productCar() {
        return new Honda();
    }
}
