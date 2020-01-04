package System.impl;

import System.Deployer;
import System.Service.Service;

public class RedisClusterDeployer extends Deployer {


    @Override
    public void Deploy(Service service) {

    }

    @Override
    public void ShutDown(Service service) {

    }

    @Override
    public boolean Update(Service service) {
        return false;
    }
}
