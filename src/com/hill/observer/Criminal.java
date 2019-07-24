package com.hill.observer;

import java.util.Observable;

/**
 * @author HILL
 * @version V1.0
 * @date 2019/7/21
 * 一个罪犯，每个罪犯都会被警察叔叔暗中观察，一旦罪犯出现做出违法犯罪的事情，
 * 就会被发现，最终被抓捕。
 **/
public class Criminal extends Observable {

    public String name;

    public Criminal(String name) {
        this.name = name;
    }

    public void rob(){
        System.out.println(name+"准备进行抢劫");
        //父类Observable的方法，标记该对象已更改状态
        setChanged();
        //通知所有警察叔叔，可以进行抓捕。
        notifyObservers();
    }

}
