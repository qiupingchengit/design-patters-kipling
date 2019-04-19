/*
 * @Project Name: design_pattern
 * @File Name: CarFactory
 * @Package Name: java.mian.com.kipling.pattern.factory.abstr
 * @Date: 2019/4/19　 1:01
 * @Creator: Kipling
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.abstr;


import factory.product.car.Car;
import factory.product.car.Honda;
import factory.product.parts.Engine;
import factory.product.parts.HondaEngine;

/**
 * TODO
 *
 * @author chenqiuping
 * @date 2019/4/19　 1:01
 * @see
 */
public class HondaCarFactory extends CarAbstractFactory {
    Car produceCar() {
        return new Honda();
    }

    Engine prroduceEngine() {
        return new HondaEngine();
    }
}
