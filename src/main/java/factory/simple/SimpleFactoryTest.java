/*
 * @Project Name: KiplingRoad
 * @File Name: SimpleTest
 * @Package Name: com.kip.pattern.java.mian.com.kipling.pattern.factory.simple
 * @Date: 2019/4/19　23:59
 * @Creator: chenqiuping-516
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.simple;


import factory.product.car.Car;
import factory.product.car.Honda;

/**
 * 简单工厂造车
 *
 * @author chenqiuping
 * @date 2019/4/19　23:59
 * @see
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        // 开闭原则  修改服务端
        // 造车这个过程比较麻烦，用户不需要自己造
        Car car = new Honda();
        car.carBrand();

        //小作坊式的生产模式
        //用户本身不再关心制造的过程，而只需要关心这个结果
        //BMW,Honda,BYD 制造过程是不一样的

        // 通过简单的造车厂造车 我只要告诉工厂我要什么车，不需关心制造制造
        SimpleCarFactory simpleFactory = new SimpleCarFactory();
        simpleFactory.createCar("BMW").carBrand();

        simpleFactory.createCarByClass(Honda.class).carBrand();
    }
}
