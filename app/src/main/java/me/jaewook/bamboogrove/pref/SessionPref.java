package me.jaewook.bamboogrove.pref;

import android.content.Context;
import android.content.SharedPreferences;

import me.jaewook.bamboogrove.net.res.Login;

/**
 * Created by Jaewook on 2016-07-23.
 */
public class SessionPref {


    private static final String SESSION_PREF = "session";
    private static final String ACCESS_TOKEN = "access_token";
    private static final String USER_ID = "user_id";

    private static SessionPref instance;

    private Context mContext;
    private SharedPreferences preferences;

    public static SessionPref getInstance(Context context) {
        return instance != null ? instance : new SessionPref(context);
    }

    private SessionPref(Context context) {
        mContext = context;
        instance = this;
        preferences = context.getSharedPreferences(SESSION_PREF, Context.MODE_PRIVATE);
    }

    public boolean saveUserSessionInformation(Login.Session sessionData) {
        SharedPreferences.Editor edit = preferences.edit();
        edit.putString(ACCESS_TOKEN, sessionData.access_token);
        edit.putString(USER_ID, sessionData.user_id);
        return edit.commit();
    }

    public String getAccessToken() {
        return preferences.getString(ACCESS_TOKEN, null);
    }

    public String getUserId() {
        return preferences.getString(USER_ID, null);
    }
}
