/*
 * @Project Name: KiplingRoad
 * @File Name: SimpleFactory
 * @Package Name: com.kip.pattern.java.mian.com.kipling.pattern.factory.simple
 * @Date: 2019/4/19　 0:00
 * @Creator: chenqiuping-516
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */
package factory.simple;


import factory.product.car.BMW;
import factory.product.car.BYD;
import factory.product.car.Car;
import factory.product.car.Honda;

/**
 * 简单工厂
 *
 * @author chenqiuping-516
 * @date 2019/4/19　 0:00
 * @see
 */
public class SimpleCarFactory {

    public Car createCar(String brand){
        if("BMW".equals(brand)){
            return new BMW();
        }if("BYD".equals(brand)){
            return new BYD();
        }if("Honda".equals(brand)){
            return new Honda();
        }else{
            System.out.printf("不能生产你所需要的车");
            return null;
        }
    }

    public Car createCarByClass(Class<? extends Car> clazz){
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
