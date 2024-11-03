package com.shang.example1_1;

import java.time.LocalDate;

/**
 * @program: shang-design_mode
 * @description: 酒
 * @author: Shang
 * @create: 2024-11-03 15:17
 * @version: 1.0
 **/
public class Wine extends IProduct{
    public Wine(String name, LocalDate produce, Double price) {
        super(name, produce, price);
    }
}
