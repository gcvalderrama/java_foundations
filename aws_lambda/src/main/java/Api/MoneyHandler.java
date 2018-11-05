package Api;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;

public class MoneyHandler implements RequestHandler<MoneyRequest, MoneyResponse> {

    public MoneyResponse handleRequest(MoneyRequest moneyRequest, Context context) {
        MoneyResponse response = new MoneyResponse();
        response.setKind(moneyRequest.getKind());
        return response;
    }
}
