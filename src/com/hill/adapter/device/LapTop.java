package com.hill.adapter.device;


/**
 * @author HILL
 * @version V1.0
 * @date 2019/7/7
 *  TODO
 **/
public class LapTop implements Device{

    private LapTopAdapter adapter ;

    public LapTop(LapTopAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void startUse() {
        adapter.startUse();
        System.out.println("笔记本启动");
    }
}
