package me.jaewook.bamboogrove.push;

import me.jaewook.bamboogrove.net.req.PushService;

/**
 * Created by Jaewook on 2016-07-23.
 */
public class InstanceIDListenerService extends com.google.android.gms.iid.InstanceIDListenerService {


    private PushService.Push pushService;



    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

    }
}
