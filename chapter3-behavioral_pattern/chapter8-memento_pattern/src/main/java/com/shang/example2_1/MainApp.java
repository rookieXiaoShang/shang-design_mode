package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: 游戏调用
 * @author: Shang
 * @create: 2024-10-23 20:50
 * @version: 1.0
 **/
public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        // 创建玩家 设置初始金币
        Player player = new Player(100);
        // 备份玩家初始状态
        Memento memento = player.createMemento();

        // 玩游戏
        for (int i = 0; i < 100; i++) {
            System.out.println("===========第"+(i+1)+"次游戏开始");
            // 显示玩家当前状态
            System.out.println(player);

            // 开启游戏
            System.out.println("玩家游戏前余额："+player.getMoney());
            player.randomGame();
            System.out.println("玩家游戏后余额："+player.getMoney());

            // 玩家赚钱了开始重置初始状态 玩家快没钱了返回初始状态
            if(memento.getMoney() < player.getMoney()){
                System.out.println("赚到金币,保存当前状态,继续游戏!");
                memento = player.createMemento();
            }else if(player.getMoney() < memento.getMoney() / 2){
                System.out.println("所持金币不多了,将游戏恢复到初始状态!");
                player.restoreMemento(memento);
            }

            Thread.sleep(100);
            System.out.println("");
        }
    }
}
