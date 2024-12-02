package com.shang.example2_2;

/**
 * @program: shang-design_mode
 * @description: 建造者模式
 * @author: Shang
 * @create: 2024-10-29 19:18
 * @version: 1.0
 **/
public class RabbitMQClient {
    public RabbitMQClient(Builder builder){

    }
    // Builder设置为静态内部类 权限为public 否则在外部无法使用set和builder方法
    public static class Builder{
        // 属性密闭 禁止外部类直接访问到
        private String host = "127.0.0.1";
        private int port = 5672;
        private int mode;
        private String exchange;
        private String queue;
        private boolean isDurable = true;
        int connectionTimeout = 1000;
        // 设置set方法 返回本身
        public Builder setHost(String host) {
            this.host = host;
            return this;
        }
        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public Builder setMode(int mode) {
            this.mode = mode;
            return this;
        }

        public Builder setExchange(String exchange) {
            this.exchange = exchange;
            return this;
        }

        public Builder setQueue(String queue) {
            this.queue = queue;
            return this;
        }

        public Builder setDurable(boolean durable) {
            isDurable = durable;
            return this;
        }

        public Builder setConnectionTimeout(int connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        // 实际上也可以看做director 就是一个结束并创建实例对象的方法 权限为public 都是要暴露给外部的
        public RabbitMQClient builder(){
            //在全部属性设置完成之后 在首先进行校验
            if(mode == 1){ //工作队列模式不需要设计交换机,但是队列名称一定要有
                if(exchange != null){
                    throw new RuntimeException("工作队列模式无需设计交换机");
                }
                if(queue == null || queue.trim().equals("")){
                    throw new RuntimeException("工作队列模式名称不能为空");
                }
                if(isDurable == false){
                    throw new RuntimeException("工作队列模式必须开启持久化");
                }
            }else if(mode == 2){ //路由模式必须设计交换机,但是不能设计队列
                if(exchange == null){
                    throw new RuntimeException("路由模式下必须设置交换机");
                }
                if(queue != null){
                    throw new RuntimeException("路由模式无须设计队列名称");
                }
            }else {
                throw new RuntimeException("未设置运行模式");
            }
            // 返回实例化对象 注意内部类可以使用外部类 外部类构造器传入的是自己的实例化对象 但是由于静态内部类的特性 所以在调用时无法通过外部类来直接创建静态内部类的实例化对象传入外部类的构造器
            return new RabbitMQClient(this);
        }
    }
    // 写自己本身的业务方法...
    public void sendMessage(String message){
        System.out.println("发送信息："+message);
    }
}
