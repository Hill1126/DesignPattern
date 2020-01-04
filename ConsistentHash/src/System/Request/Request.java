package System.Request;


import java.util.Map;

public abstract class Request<K,V> {

    protected abstract void DecodeRequest(String request);

    public abstract Map<K,V> GetDetail();

}
