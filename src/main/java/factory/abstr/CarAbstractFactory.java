/*
 * @Project Name: design_pattern
 * @File Name: AbstractCarFactory
 * @Package Name: java.mian.com.kipling.pattern.factory.abstr
 * @Date: 2019/4/19　 0:56
 * @Creator: Kipling
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.abstr;


import factory.product.car.Car;
import factory.product.parts.Engine;

/**
 * 抽象工厂
 *
 * @author chenqiuping
 * @date 2019/4/19　 0:56
 * @see
 */
public abstract class CarAbstractFactory {
    //公共的逻辑
    //方便于统一管理
    abstract Car produceCar();

    abstract Engine prroduceEngine();
}
