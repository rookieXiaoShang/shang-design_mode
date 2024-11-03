package com.shang.example2_1;

import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 客户端
 * @author: Shang
 * @create: 2024-11-01 10:40
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
        List<Receipt> receiptList = ReceiptCreator.generateReceipts();

        //循环判断
        for (Receipt receipt : receiptList) {
            if (receipt.getType().equals("MT1011")) {
                System.out.println("接收到MT1011回执!");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑A" + "\n");
            } else if ("MT2101".equals(receipt.getType())) {
                System.out.println("接收到MT2101回执!");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑B" + "\n");
            } else if ("MT4101".equals(receipt.getType())) {
                System.out.println("接收到MT4101回执!");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑C" + "\n");
            } else if ("MT8104".equals(receipt.getType())) {
                System.out.println("接收到MT8104回执!");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑D");
            }
        }
    }
}
