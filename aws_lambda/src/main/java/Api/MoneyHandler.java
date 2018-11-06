package Api;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class MoneyHandler implements RequestStreamHandler {

    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        String result = "";
        try {
            result = IOUtils.toString(inputStream);
        } catch (IOException e) {
            throw e;
        }
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        MoneyRequest req = gson.fromJson(result, MoneyRequest.class);
        MoneyResponse response = new MoneyResponse();
        // response.body = gson.toJson(req);
        response.body = result;
        response.headers.put("test_header", "test");
        String ser = gson.toJson(response);
        IOUtils.write(ser, outputStream, "UTF-8");
    }
}
