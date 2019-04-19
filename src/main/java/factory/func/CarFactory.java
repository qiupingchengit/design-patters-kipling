/*
 * @Project Name: design_pattern
 * @File Name: CarFactory
 * @Package Name: java.mian.com.kipling.pattern.factory.func
 * @Date: 2019/4/19　 0:28
 * @Creator: chenqiuping-516
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.func;


import factory.product.car.Car;

/**
 * 车工厂
 *
 * @author chenqiuping
 * @date 2019/4/19　 0:28
 * @see
 */
public interface CarFactory {
    /**
     * 生产车
     * @author chenqiuping
     * @date 2019/4/19　 0:35
     * @since 1.0.0
     * @return
     */
    Car productCar();
}
