package net.p45q.raspberrycontroller;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    private static final String TAG = "Main";
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        buttonListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void buttonListeners(){
        Log.d(TAG, "ButtonAction");
        Button btnForward= (Button) findViewById(R.id.buttonForward);
        btnForward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                    new SendTurnOn(2, context).execute();
//                    new SendTurnOn(4, context).execute();
                    new SendStartAction(0, context).execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
//                    new SendTurnOff(2, context).execute();
//                    new SendTurnOff(4, context).execute();
                    new SendStopAction(0, context).execute();
                }
                return false;
            }
        });
        Button btnReverse= (Button) findViewById(R.id.buttonReverse);
        btnReverse.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                    new SendTurnOn(3, context).execute();
//                    new SendTurnOn(5, context).execute();
                    new SendStartAction(1, context).execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
//                    new SendTurnOff(3, context).execute();
//                    new SendTurnOff(5, context).execute();
                    new SendStopAction(1, context).execute();
                }
                return false;
            }
        });
        Button btnLeft= (Button) findViewById(R.id.buttonLeft);
        btnLeft.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                    new SendTurnOn(2, context).execute();
//                    new SendTurnOn(5, context).execute();
                    new SendStartAction(2, context).execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
//                    new SendTurnOff(2, context).execute();
//                    new SendTurnOff(5, context).execute();
                    new SendStopAction(2, context).execute();
                }
                return false;
            }
        });
        Button btnRight= (Button) findViewById(R.id.buttonRight);
        btnRight.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                    new SendTurnOn(3, context).execute();
//                    new SendTurnOn(4, context).execute();
                    new SendStartAction(3, context).execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
//                    new SendTurnOff(3, context).execute();
//                    new SendTurnOff(4, context).execute();
                    new SendStopAction(3, context).execute();
                }
                return false;
            }
        });
        Button btnTurLeft= (Button) findViewById(R.id.buttonTurLeft);
        btnTurLeft.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                    new SendTurnOn(1, context).execute();
                    new SendStartAction(4, context).execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
//                    new SendTurnOff(1, context).execute();
                    new SendStopAction(4, context).execute();
                }
                return false;
            }
        });
        Button btnTurRight= (Button) findViewById(R.id.buttonTurRight);
        btnTurRight.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                    new SendTurnOn(0, context).execute();
                    new SendStartAction(5, context).execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
//                    new SendTurnOff(0, context).execute();
                    new SendStopAction(5, context).execute();
                }
                return false;
            }
        });
        Button btnTurElevation= (Button) findViewById(R.id.buttonTurElevation);
        btnTurElevation.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                    new SendTurnOn(6, context).execute();
                    new SendStartAction(6, context).execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
//                    new SendTurnOff(6, context).execute();
                    new SendStopAction(6, context).execute();
                }
                return false;
            }
        });
        Button btnFire= (Button) findViewById(R.id.buttonFire);
        btnFire.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                    new SendTurnOn(27, context).execute();
                    new SendStartAction(7, context).execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
//                    new SendTurnOff(27, context).execute();
                    new SendStartAction(7, context).execute();
                }
                return false;
            }
        });
        Button btnsEmergency= (Button) findViewById(R.id.buttonEmergency);
        btnsEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                new SendTurnOff(0, context).execute();
//                new SendTurnOff(1, context).execute();
//                new SendTurnOff(2, context).execute();
//                new SendTurnOff(3, context).execute();
//                new SendTurnOff(4, context).execute();
//                new SendTurnOff(5, context).execute();
//                new SendTurnOff(6, context).execute();
//                new SendTurnOff(27, context).execute();
                new SendStopAction(8, context).execute();
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            launchActivity(SettingsActivity.class);
        }

        return super.onOptionsItemSelected(item);
    }
    private void launchActivity(Class clazz)
    {
        Intent intent = new Intent(MainActivity.this, clazz);
        startActivity(intent);
        finish();
    }
}
