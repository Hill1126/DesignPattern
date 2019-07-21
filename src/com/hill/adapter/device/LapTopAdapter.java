package com.hill.adapter.device;

import com.hill.adapter.power.HousePower;

/**
 * @author HILL
 * @version V1.0
 * @date 2019/7/8
 **/
public class LapTopAdapter extends HousePower implements Adapter{


    /**
     * TODO
     * @Author: HILL
     * @date: 2019/7/9 14:06
     * @param: []
     * @return: int 输出适配器转换后的电压值
    **/
    @Override
    public int outConversionVoltage() {
        //进行电压转换
        System.out.println("电压为"+super.outPutPower()+"开始转换");
        return super.outPutPower()/11;
    }
}
