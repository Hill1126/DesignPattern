package System.Service.impl;

import System.Config.Config;
import System.Request.Request;
import System.Service.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RedisService extends Service {

    private Config config;

    private Map<String,String> redis = new HashMap();


    public Config getConfig() {
        return config;
    }

    RedisService(Config config){
        this.config = config;
    }

    @Override
    public void ProcessRequest(Request request) {
        Map<String,String> detail = request.GetDetail();
        if ("set".equals(detail.get("command").toLowerCase())){
            String key = detail.get("key");
            String value = detail.get("value");
            redis.put(key,value);
            System.out.println(1);
        }else {
            System.out.println( redis.get(detail.get("key")));
        }
    }


    @Override
    public int hashCode() {
        return Objects.hash(config.getName());
    }
}
