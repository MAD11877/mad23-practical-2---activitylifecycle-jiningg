package sg.edu.np.mad.madpractical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final String TITLE = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TITLE, "Create!");

        User myUser =  new User();
        myUser.getUserName();
        myUser.getUserDescription();

        myUser.userFollowed = false;
        myUser.isUserFollowed();

        TextView tv1 = findViewById(R.id.textView);
        tv1.setText("Lorem ipsum dolor sit amet consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");


    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TITLE, "Start!");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TITLE, "Resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TITLE, "Paused");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TITLE, "Stop!");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.v(TITLE, "Restart");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TITLE, "Destroy");
    }
}