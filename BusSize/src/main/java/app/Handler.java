package app;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import java.util.HashMap;
import java.util.Map;

/***
 * Class that acts as an AWS Lambda Request handler
 * It takes an input event as a parameter and returns a response event
 */
public class Handler {
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {

        // Taking in the user input and finding the value in the HTTP body response
        System.out.println(input.getBody());
        String[] bodyGetRequest = input.getBody().split(":");
        String size = BusSize.findChairSize(bodyGetRequest[1]);
        System.out.println(size);

        // Creating a new response Event
        APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();

        // Creating new HTTP body response and status code
        Map<String, String> body = new HashMap();
        body.put("sizes", size);
        responseEvent.setBody(body.toString());
        responseEvent.setStatusCode(200);

        // Adding a new custom HTTP Header for verification
        Map<String, String> headers = new HashMap();
        headers.put("X-Custom-Header", "Bus Chair Size combinations App!");
        responseEvent.setHeaders(headers);

        return responseEvent;
    }
}
