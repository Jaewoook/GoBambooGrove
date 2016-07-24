package me.jaewook.bamboogrove.net.req;

import me.jaewook.bamboogrove.net.RetrofitFactory;
import me.jaewook.bamboogrove.net.res.Common;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Jaewook on 2016-07-24.
 */
public class PageService {


    private static Page instance;

    public static interface Page {

        @POST("/page")
        @FormUrlEncoded
        Call<Common> createPage(@Field("page_name") String pageName,
                                @Field("page_description") String pageDescription);
    }

    public static Page getInstance() {
        return instance != null ? instance : create();
    }

    static Page create() {
        instance = RetrofitFactory.getInstance().getRetrofit().create(Page.class);
        return instance;
    }
}
