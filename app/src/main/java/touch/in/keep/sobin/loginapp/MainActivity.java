package touch.in.keep.sobin.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void collapse(View view){

        Intent intent = new Intent(MainActivity.this,CollapsingToolbarActivity.class);
        startActivity(intent);

    }

    public void round(View view){

        Intent intent = new Intent(MainActivity.this,RoundButtonActivity.class);
        startActivity(intent);

    }

    public void navDrawer(View view){

        Intent intent = new Intent(MainActivity.this,HomeActivity.class);
        startActivity(intent);

    }

    public void viewPager(View view){

        Intent intent = new Intent(MainActivity.this,ViewpagerActivity.class);
        startActivity(intent);

    }
}
