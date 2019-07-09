package com.hill.adapter;

import com.hill.adapter.device.Adapter;
import com.hill.adapter.device.Device;
import com.hill.adapter.device.LapTop;
import com.hill.adapter.device.LapTopAdapter;

/**
 * @author HILL
 * @version V1.0
 * @date 2019/7/7
 **/
public class Demo {

    public static void main(String[] args) {
        Adapter adapter = new LapTopAdapter();
        Device laptop = new LapTop(adapter);
        laptop.startUse();

    }
}
