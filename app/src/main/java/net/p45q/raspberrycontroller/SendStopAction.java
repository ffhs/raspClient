package net.p45q.raspberrycontroller;

/**
 * SendStopAction
 *
 * Pascal Bieri, Thierry Baumann
 * 9/13/15
 */

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class SendStopAction extends AsyncTask<Integer, Void, Integer> {
    private static final String TAG = "SendStopAction";
    Integer actionnr;
    Context context;

    @Override
    protected Integer doInBackground(Integer... params) {
        Log.d(TAG, "DoInBG");
        try {
            Log.d(TAG, "DoInBG");
            final String url = "http://192.168.42.1:8080/stopaction?pinnr=" + actionnr;
            //final String url = "http://google.com";
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            restTemplate.getForEntity(url, getClass());
        } catch (Exception e) {
            Log.e(TAG, e.getMessage(), e);
        }
        return null;
    }

    public SendStopAction(Integer actionnr, Context context) {
        this.actionnr = actionnr;
        this.context = context;
    }
}
