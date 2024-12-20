package com.shang.example2_2;

import com.shang.example2_1.AdvTemplate;

/**
 * @program: shang-design_mode
 * @description: 邮件类
 * @author: Shang
 * @create: 2024-10-29 20:43
 * @version: 1.0
 **/
public class Mail1 implements Cloneable{
    //收件人
    private String receiver;
    //邮件名称
    private String subject;
    //称谓
    private String appellation;
    //邮件内容
    private String context;
    //邮件尾部, 一般是"xxx版权所有"等信息
    private String tail;


    //构造函数
    public Mail1(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    // 重写克隆方法
    @Override
    protected Mail1 clone() throws CloneNotSupportedException {
        Mail1 mail1 = null;
        try {
            mail1 = (Mail1)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail1;
    }
}
