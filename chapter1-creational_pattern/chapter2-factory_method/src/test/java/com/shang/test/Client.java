package com.shang.test;

import com.shang.example1_1.controller.FreeGoodsController;
import com.shang.example1_1.pojo.RequestAwardInfo;
import com.shang.example2_1.controller.AbstractFactoryController;
import com.shang.example3_1.CarFactory;
import com.shang.example3_1.CarFactoryMap;
import com.shang.example3_1.IBus;
import com.shang.example3_1.ICar;
import org.junit.Test;

import javax.naming.Context;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: shang-design_mode
 * @description: 测试工厂方法
 * @author: Shang
 * @create: 2024-10-29 11:04
 * @version: 1.0
 **/
public class Client {
    // 测试简单工厂方法 将创建逻辑封装到了工厂类中 随之产品的增加要不断修改工厂类
    @Test
    public void test1_1(){
        RequestAwardInfo awardInfo = new RequestAwardInfo("茶杯","尚永波");
        Map<String,String> exr = new HashMap<>();
        exr.put("orderId","hiq719236");
        exr.put("consigneeUserAddress","甘肃省");
        exr.put("consigneeUserPhone","17393608499");
        exr.put("userName","百度网盘");
        exr.put("userPhone","4613");
        awardInfo.setExrInfo(exr);

        FreeGoodsController controller = new FreeGoodsController();
        /*
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        System.out.println("选择商品类型：");
        */
        controller.sendGoods(awardInfo,"3");
    }
    // 测试工厂方法 只创建单个产品
    @Test
    public void test2_1(){
        RequestAwardInfo awardInfo = new RequestAwardInfo("年卡","尚永波");
        AbstractFactoryController controller = new AbstractFactoryController();
        controller.sendGoods(awardInfo,"1");
    }
    // 测试抽象工厂方法 创建一个产品族群
    @Test
    public void test3_1(){
        System.out.println("1 表示比亚迪工厂，2 表示特斯拉工厂，其他数字会报错：");
        CarFactory factory = CarFactoryMap.createFactory(2);
        IBus iBus = factory.makeBus();
        ICar iCar = factory.makeCar();
        iBus.driver();
        iCar.run();
    }

}
