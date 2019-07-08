package com.hill.adapter;

import com.hill.adapter.device.LapTopAdapter;
import com.hill.adapter.device.LapTop;
import com.hill.adapter.power.HousePower;

/**
 * @author HILL
 * @version V1.0
 * @date 2019/7/7
 **/
public class Demo {

    public static void main(String[] args) {
        HousePower power = new HousePower();
        LapTopAdapter adapter = new LapTopAdapter(power);
        LapTop laptop = new LapTop(adapter);
        laptop.startUse();

    }
}
