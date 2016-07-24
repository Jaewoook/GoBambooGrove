package me.jaewook.bamboogrove.net.req;

import me.jaewook.bamboogrove.net.RetrofitFactory;
import me.jaewook.bamboogrove.net.res.Common;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Jaewook on 2016-07-23.
 */
public class PushService {

    private static Push instance;

    public static interface Push {

        @POST("/push/registration_id")
        @FormUrlEncoded
        Call<Common> registerToken(@Field("access_token") String accessToken,
                                   @Field("registration_id") String registrationId);

    }

    public static Push getInstance() {
        return instance != null ? instance : create();
    }

    static Push create() {
        instance = RetrofitFactory.getInstance().getRetrofit().create(Push.class);
        return instance;
    }
}
