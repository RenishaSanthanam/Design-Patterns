package org.example;

import java.io.Serializable;

public class MultithreadSingleton {
    private static MultithreadSingleton instance = null;

    private MultithreadSingleton(){

    }

    public static MultithreadSingleton getInstance(){
        if(instance==null){
            synchronized (MultithreadSingleton.class){
                if(instance==null)
                    instance = new MultithreadSingleton();
            }
        }
        return instance;
    }
}
