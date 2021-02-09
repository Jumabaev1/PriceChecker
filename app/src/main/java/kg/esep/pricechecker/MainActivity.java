package kg.esep.pricechecker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private  String[] imageUrls = new String[]{
            "https://i.pinimg.com/originals/c4/80/0b/c4800b4f593a2b8390988a73e2f59116.jpg",
            "https://i.pinimg.com/originals/62/86/31/62863197c4b229f2fef2974a9af7be03.jpg",
            "https://i.pinimg.com/originals/c4/80/0b/c4800b4f593a2b8390988a73e2f59116.jpg",
            "https://i.pinimg.com/originals/62/86/31/62863197c4b229f2fef2974a9af7be03.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, imageUrls);
        viewPager.setAdapter(adapter);
    }
}