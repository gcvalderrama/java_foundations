package Api;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class MoneyResponse {
    public String body;
    public Dictionary<String,String> headers;

    public MoneyResponse(){
        this.headers = new Hashtable<String, String>();
    }
}
