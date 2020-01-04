package System.Request.Impl;

import System.Request.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * 许俊锋自定义的请求，请求字符串如redis一样
 */
public class XjfRedisRequest extends Request {


    Map<String,String> detail = new HashMap();

    public XjfRedisRequest(String request) {
        DecodeRequest(request);
    }

    @Override
    protected void DecodeRequest(String request) {
        String[] strs = request.split(" ");
        detail.put("command",strs[0]);
        detail.put("key",strs[1]);
        detail.put("value",strs[2]);

    }

    @Override
    public Map<String,String> GetDetail() {
        return this.detail;
    }
}
