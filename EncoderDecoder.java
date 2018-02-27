package server;

import com.google.gson.Gson;

import models.requests.RegisterRequest;
import models.results.RegisterResult;

/**
 * Created by jasontd on 2/26/18.
 */

public class EncoderDecoder {

    public RegisterRequest JSONtoGSON(String reqData, RegisterRequest r){
        Gson gson = new Gson();
        r = gson.fromJson(reqData, RegisterRequest.class);
        return r;
    }

    public String GSONtoJSON(RegisterResult result){
        Gson gson = new Gson();
        String json = gson.toJson(result);
        return json;
    }
}
