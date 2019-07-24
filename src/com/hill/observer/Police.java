package com.hill.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author HILL
 * @version V1.0
 * @date 2019/7/21
 **/
public class Police implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        //警察叔叔察觉到了罪犯的犯罪行为，实施相应措施
        Criminal criminal = (Criminal) o;
        System.out.println("警察对"+criminal.name+"进行追捕");
    }
}
