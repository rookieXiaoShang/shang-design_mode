package com.shang.example2_1;

/**
 * @program: shang-design_mode
 * @description: MQ连接客户端
 * @author: Shang
 * @create: 2024-10-29 19:14
 * @version: 1.0
 **/
public class RabbitMQClient1 {
    private String host = "127.0.0.1";

    private int port = 5672;

    private int mode;

    private String exchange;

    private String queue;

    private boolean isDurable = true;

    int connectionTimeout = 1000;

    //私有化构造方法
    private RabbitMQClient1() {

    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {

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
        }

        //其他验证方式,

        this.exchange = exchange;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {

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
        }

        this.mode = mode;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public boolean isDurable() {
        return isDurable;
    }

    public void setDurable(boolean durable) {
        isDurable = durable;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public void sendMessage(String msg){

        System.out.println("发送消息......");
    }

    /**
     * set方法的好处是参数的设计更加的灵活,但是通过set方式设置对象属性时,对象有可能存在中间状态(无效状态),
     * 并且进行属性校验时有前后顺序约束.
     * 怎么保证灵活设置参数又不会存在中间状态呢? 答案就是: 使用建造者模式
     */
    public static void main(String[] args) {

        RabbitMQClient1 client2 = new RabbitMQClient1();
        client2.setHost("192.168.52.123");
        client2.setQueue("queue");
        client2.setMode(1);
        client2.setDurable(true);
        client2.sendMessage("Test-MSG2");
    }
}
