package com.hill.observer;

/**
 * @author HILL
 * @version V1.0
 * @date 2019/7/21
 **/
public class ObserverDemo {

    public static void main(String[] args) {
        Criminal criminal1 = new Criminal("罪犯1");
        Criminal criminal2 = new Criminal("罪犯2");
        Police police = new Police();
        //罪犯被警察监视
        criminal1.addObserver(police);
        criminal2.addObserver(police);
        
        criminal1.rob();
        criminal2.rob();

    }
}
