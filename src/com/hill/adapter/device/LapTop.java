package com.hill.adapter.device;


/**
 * @author HILL
 * @version V1.0
 * @date 2019/7/7
 *  TODO
 **/
public class LapTop implements Device{

    private Adapter adapter ;
    private int VOLTAGE = 20;

    public LapTop(Adapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void startUse() {
        if(adapter.outConversionVoltage()==VOLTAGE){
            System.out.println("电压为"+VOLTAGE+"-----笔记本启动");
        }else{
            System.out.println("电压输入不正确，启动失败。异常电压为："+adapter.outConversionVoltage());
        }
    }
}
