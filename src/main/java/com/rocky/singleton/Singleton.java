package com.rocky.singleton;

public class Singleton {

    private static Singleton singleton;

    // 构造方法让其private，这就堵死了外界利用 new 创建此类的可能
    private Singleton() {
    }

    // 获取本类方法的唯一全局访问点
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
