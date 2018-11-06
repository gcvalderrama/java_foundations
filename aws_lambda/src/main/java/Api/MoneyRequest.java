package Api;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

public class MoneyRequest {
    String Kind;
    public Map<String,String> headers;
    public void setKind(String kind){
        this.Kind = kind;
    }
    public String getKind(){
        return this.Kind;
    }
    public MoneyRequest(){
        this.headers = new Hashtable<String, String>();
    }
}
