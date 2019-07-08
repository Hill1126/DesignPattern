package com.hill.adapter.power;

/**
 * @author HILL
 * @version V1.0
 * @date 2019/7/8
 **/
public class HousePower implements Power{

    /**
     * 中国家庭用电电压为220伏
     * @Author: HILL
     * @date: 2019/7/8 15:07
    **/
    private static final int VOLTAGE = 220;

    /**
     * TODO
     * @Author: HILL
     * @date: 2019/7/8 15:08
     * @param: []
     * @return: int 中国家庭用电电压
    **/
    @Override
    public int outPutPower() {
        return VOLTAGE;
    }
}
