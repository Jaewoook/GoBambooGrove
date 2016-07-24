package me.jaewook.bamboogrove.net.req;

import me.jaewook.bamboogrove.net.RetrofitFactory;
import me.jaewook.bamboogrove.net.res.Common;
import me.jaewook.bamboogrove.net.res.Post;
import me.jaewook.bamboogrove.net.res.Posts;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by Jaewook on 2016-07-22.
 */
public class PostService {


    private static Post instance;

    public static interface Post {

        @GET("/post/{page_id}/{post_id}")
        Call<me.jaewook.bamboogrove.net.res.Post> getPost(@Path("page_id") String pageId,
                                                          @Path("post_id") String postId);

        @GET("/posts/{page_id}")
        Call<Posts> getPagePosts(@Path("page_id") String pageId);

        @POST("/post/{page_id}")
        @FormUrlEncoded
        Call<Common> uploadPost(@Path("page_id") String pageId,
                                @Field("access_token") String accessToken,
                                @Field("article") String article,
                                @Field("category") String category);

        @DELETE("/post/{page_id}/{post_id}")
        @FormUrlEncoded
        Call<Common> deletePost(@Path("page_id") String pageId,
                                @Path("post_id") String postId,
                                @Field("access_token") String accessToken);
    }

    public static Post getInstance() {
        return instance != null ? instance : create();
    }

    static Post create() {
        instance = RetrofitFactory.getInstance().getRetrofit().create(Post.class);
        return instance;
    }
}
