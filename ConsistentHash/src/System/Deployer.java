package System;

import System.Service.Service;

public abstract class Deployer {

    public abstract void  Deploy(Service service);

    public abstract void  ShutDown(Service service);

    public abstract boolean  Update(Service service);


}
