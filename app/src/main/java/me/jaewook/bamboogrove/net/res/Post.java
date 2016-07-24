package me.jaewook.bamboogrove.net.res;

/**
 * Created by Jaewook on 2016-07-22.
 */
public class Post extends Common {

    public PostData data;

    public static class PostData {
        public String _id;
        public String upload_time;
        public String article;
    }
}
