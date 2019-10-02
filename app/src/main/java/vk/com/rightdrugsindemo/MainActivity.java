package vk.com.rightdrugsindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.my_anim);
        textView.startAnimation(anim);
        final Intent intent = new Intent(this, HomeActivity.class);
        Thread timer = new Thread(){
            public void run()
            {
                try
                {
                    sleep(5000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                }
            }
        };
        timer.start();
    }
}
