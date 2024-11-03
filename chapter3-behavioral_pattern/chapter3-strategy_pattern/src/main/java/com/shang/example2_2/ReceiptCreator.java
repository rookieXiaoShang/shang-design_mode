package com.shang.example2_2;

import com.shang.example2_1.ReceiptType;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: shang-design_mode
 * @description: 回执构建器 服务于业务创建多个回执集合
 * @author: Shang
 * @create: 2024-11-01 10:38
 * @version: 1.0
 **/
public class ReceiptCreator {
    private ReceiptCreator(){
        throw new RuntimeException("No Instances for you!");
    }
    public static List<Receipt> generateReceipts() {
        List<Receipt> receiptList = new ArrayList<>();
        receiptList.add(new Receipt("MT1101回执", ReceiptType.MT1101));
        receiptList.add(new Receipt("MT2101回执",ReceiptType.MT2101));
        receiptList.add(new Receipt("MT4101回执",ReceiptType.MT4101));
        receiptList.add(new Receipt("MT8104回执",ReceiptType.MT8104));
        return receiptList;
    }
}
