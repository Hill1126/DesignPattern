package com.hill.adapter.device;

import com.hill.adapter.power.HousePower;

/**
 * @author HILL
 * @version V1.0
 * @date 2019/7/8
 **/
public class LapTopAdapter implements Device{

    private final HousePower power;

   public LapTopAdapter(HousePower power){
        this.power = power;
    }


    @Override
    public void startUse() {
        int housePower = power.outPutPower();
        int laptopPower = housePower / 11;
        System.out.println("电源适配器工作，电压转换为"+laptopPower+"V");
    }
}
