package server;

import java.io.*;
import java.net.*;
import com.sun.net.httpserver.*;

import models.requests.RegisterRequest;
import models.results.RegisterResult;
import services.RegisterService;

/**
 * Created by jasontd on 2/22/18.
 */

class FileDefaultHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {


        boolean success = false;

        try {
            if (exchange.getRequestMethod().toLowerCase().equals("get")) {
                Headers reqHeaders = exchange.getRequestHeaders();
                // Extract the JSON string from the HTTP request body

                // Get the request body input stream
                InputStream reqBody = exchange.getRequestBody();
                // Read JSON string from the input stream
                String reqData = readString(reqBody);

                System.out.println(reqData);

                //Convert JSON String to a RegisterRequest
                EncoderDecoder e = new EncoderDecoder();
                RegisterRequest register_request = new RegisterRequest(); //object type used to specify overloaded function
                register_request = e.JSONtoGSON(reqData, register_request);

                //Execute register service method using register_request
                RegisterService s = new RegisterService();
                RegisterResult register_result = s.register(register_request);

                //Convert register_result into JSON
                String response = e.GSONtoJSON(register_result);

                // Start sending the HTTP response to the client, starting with
                // the status code and any defined headers.
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);

                //Write to Response Body
                exchange.getResponseBody().write(response.getBytes());
                exchange.getResponseBody().close();
                success = true;
            }

            if (!success) {
                // The HTTP request was invalid somehow, so we return a "bad request"
                // status code to the client.
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_BAD_REQUEST, 0);
                exchange.getResponseBody().close();
            }
        }catch (IOException e) {
            exchange.sendResponseHeaders(HttpURLConnection.HTTP_SERVER_ERROR, 0);
            exchange.getResponseBody().close();
            e.printStackTrace();
        }
    }


    /*
    The readString method shows how to read a String from an InputStream.
    */
    private String readString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        InputStreamReader sr = new InputStreamReader(is);
        char[] buf = new char[1024];
        int len;
        while ((len = sr.read(buf)) > 0) {
            sb.append(buf, 0, len);
        }
        return sb.toString();
    }
}
