package me.jaewook.bamboogrove.net.res;

/**
 * Created by Jaewook on 2016-07-23.
 */
public class Login extends Common {

    public Session data;

    public static class Session {
        public String user_id;
        public String access_token;
    }
}
