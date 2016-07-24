package me.jaewook.bamboogrove.push;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

import java.io.IOException;

import me.jaewook.bamboogrove.R;
import me.jaewook.bamboogrove.net.req.PushService;
import me.jaewook.bamboogrove.net.res.Common;
import me.jaewook.bamboogrove.pref.SessionPref;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Jaewook on 2016-07-23.
 */
public class RegistrationIntentService extends IntentService {


    private PushService.Push pushService;

    public RegistrationIntentService(String name) {
        super(name);
        pushService = PushService.getInstance();
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        InstanceID instanceID = InstanceID.getInstance(this);
        try {
            String token = instanceID.getToken(getString(R.string.gcm_defaultSenderId),
                    GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);
            pushService.registerToken(token,
                    SessionPref.getInstance(RegistrationIntentService.this).getAccessToken())
                    .enqueue(new Callback<Common>() {
                        @Override
                        public void onResponse(Call<Common> call, Response<Common> response) {
                            if(response.isSuccessful()) {

                            } else {
                                onFailure(call, new Throwable());
                            }
                        }

                        @Override
                        public void onFailure(Call<Common> call, Throwable t) {
                            Toast.makeText(RegistrationIntentService.this, "푸시 서비스를 사용하실 수 없습니다.", Toast.LENGTH_SHORT).show();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
