package com.shang.example2_1;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program: shang-design_mode
 * @description: 抽奖玩家
 * @author: Shang
 * @create: 2024-10-23 20:30
 * @version: 1.0
 **/
public class Player {
    private Integer money; // 玩家金钱
    private List<String> fruits = new CopyOnWriteArrayList<String>(); // 玩家水果
    private static String[] fruitsName = {"香蕉","葡萄","橘子","火龙果","苹果","香梨"}; // 随机水果数组
    private Random random = new Random(); // 骰子

    // 初始化玩家金币
    public Player(Integer money) {
        this.money = money;
    }

    public Integer getMoney() {
        return money;
    }

    // 获取随机水果
    public String getFruitName() {
        String prefix = "";
        if(random.nextBoolean()){
            prefix = "好吃的";
        }
        String f = fruitsName[random.nextInt(fruitsName.length)];
        return prefix+f;
    }

    // 掷骰子游戏
    public void randomGame(){
        // 掷骰子
        Integer number = random.nextInt(6)+1;
        // 游戏逻辑
        if(number.equals(1)){
            this.money += 100;
            System.out.println("玩家金钱数量增加！！！");
        }else if(number.equals(3)){
            this.money /= 2;
            System.out.println("玩家金钱数量减少！！！");
        }else if(number.equals(6)){
            String fruitName = getFruitName();
            System.out.println("增加水果"+fruitName);
            this.fruits.add(fruitName);
        }else {
            System.out.println("无效数字继续投掷");
        }
    }
    // 拍摄快照
    public Memento createMemento(){
        Memento memento = new Memento(this.money);
        // 加入水果
        for(String fruit : this.fruits){
            if(fruit.startsWith("好吃的")){
                memento.addFruit(fruit);
            }
        }
        return memento;
    }
    // 恢复快照
    public void restoreMemento(Memento memento){
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Player{");
        sb.append("money=").append(money);
        sb.append(", fruits=").append(fruits);
        sb.append('}');
        return sb.toString();
    }
}
