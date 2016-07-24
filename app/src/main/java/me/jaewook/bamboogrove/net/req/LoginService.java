package me.jaewook.bamboogrove.net.req;

import me.jaewook.bamboogrove.net.RetrofitFactory;
import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Jaewook on 2016-07-23.
 */
public class LoginService {


    private static Login instance;

    public static interface Login {

        @POST("/login/facebook")
        Call<me.jaewook.bamboogrove.net.res.Login> loginWithFacebook();

        @POST("/login/kakao")
        Call<me.jaewook.bamboogrove.net.res.Login> loginWithKakao();
    }

    public static Login getInstance() {
        return instance != null ? instance : create();
    }

    static Login create() {
        instance = RetrofitFactory.getInstance().getRetrofit().create(Login.class);
        return instance;
    }
}
