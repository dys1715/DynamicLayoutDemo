package dys.dynamiclayoutdemo;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import dys.dynamiclayoutdemo.util.DrawableUtil;

/**
 * Created by dys on 2017/3/3 0003.
 */
public class DrawableActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn_drawable);
        button.setText("selector");
        button.setBackground(DrawableUtil.addStateListBgDrawable(this, R.mipmap.ic_background_normal,
                R.mipmap.ic_background_selected));

        Button button2 = (Button) findViewById(R.id.btn_dynamic);
        button2.setText("渐变色");
        button2.setTextColor(Color.WHITE);
        button2.setBackground(DrawableUtil.addGradientBgDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
                new int[]{getResources().getColor(R.color.colorPrimary), getResources().getColor(R.color.colorAccent)}));
    }

}
