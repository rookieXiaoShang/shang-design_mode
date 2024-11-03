package com.shang.example2_2;
import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-01 10:55
 * @version: 1.0
 **/
public class Client {
    /*
    目标：如何用设计模式消除代码中的if-else

    业务逻辑：物流行业中，通常会涉及到EDI报文(XML格式文件)传输和回执接收，
            每发送一份EDI报文，后续都会收到与之关联的回执（标识该数据在第三方系统中的流转状态）。

            这里列举几种回执类型：MT1101、MT2101、MT4101、MT8104，系统在收到不同的回执报文后，会执行对应的业务逻辑处理。
     */
    public static void main(String[] args) {
        // 创建回执集合
        List<Receipt> receiptList = ReceiptCreator.generateReceipts();
        // 使用context上下文来设置并调用策略
        ReceiptContext context;
        // 将集合中的所有回执都进行解析
        for(Receipt receipt : receiptList) {
            System.out.println("===== 开始解析 =====");
            // 使用init来初始化工厂
            ReceiptFactory.init();
            // 使用策略工厂生产策略
            IReceiptStrategy strategy = ReceiptFactory.getStrategy(receipt.getType());
            // 使用上下文设置要使用的策略
            context = new ReceiptContext(strategy);
            // 使用上下文调用策略方法
            context.executeStrategy(receipt);
        }

    }
}
