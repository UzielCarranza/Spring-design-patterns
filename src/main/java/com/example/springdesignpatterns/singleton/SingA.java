package com.example.springdesignpatterns.singleton;

public class SingA {
    private static SingA instance;

    private SingA() {
    }

    public static SingA getInstance() {
        if (null == instance){
            synchronized (SingA.class){
                if (null == instance){
                    instance = new SingA();
                }
            }
        }
        return instance;
    }
}
