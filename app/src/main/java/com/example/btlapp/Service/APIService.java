package com.example.btlapp.Service;

public class APIService {
    private static String base_url = "https://nguyencanhhieu.000webhostapp.com/Server/";
    public static Dataservice getService(){
        return APIRetrofitClient.getClient(base_url).create(Dataservice.class);
    }
}
