package net.p45q.raspberrycontroller;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Created by pascal on 8/17/15.
 */
public class SendTurnOff extends AsyncTask<Integer, Void, Integer> {
    private static final String TAG = "SendTurnOff";
    Integer pinnr;
    Context context;
    @Override
    protected Integer doInBackground(Integer... params) {
        Log.d(TAG, "DoInBG");
        try {
            Log.d(TAG,"DoInBG");
            final String url = "http://192.168.42.1:8080/turnoff?pinnr="+pinnr;
           // final String url = "http://google.com";
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            restTemplate.getForEntity(url,getClass());
        } catch (Exception e) {
            Log.e(TAG, e.getMessage(), e);
        }
        return null;
    }

    public SendTurnOff(Integer pinnr, Context context)
    {
        this.pinnr = pinnr;
        this.context = context;
    }
    protected void onPostExecute(){
        Toast.makeText(context, "Turned On: " + pinnr,
                Toast.LENGTH_SHORT).show();
    }
}
