package dys.dynamiclayoutdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;

/**
 * Created by dys on 2017/3/3 0003.
 */
public class DynamicLayoutActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //添加父布局
        RelativeLayout root = new RelativeLayout(this);
        root.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        root.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        setContentView(root);
        //添加一个在页面中间的btn
        Button button = new Button(this);
        button.setId(View.generateViewId());
        button.setText("Hello");
        RelativeLayout.LayoutParams btnParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        btnParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        button.setLayoutParams(btnParams);
        root.addView(button);
        //添加一个list在右下方
        ListView listView = new ListView(this);
        listView.setId(View.generateViewId());
        listView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                new String[]{"one", "two", "three"}));
        RelativeLayout.LayoutParams listParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        listParams.addRule(RelativeLayout.BELOW, button.getId());
        listParams.addRule(RelativeLayout.RIGHT_OF, button.getId());
        listView.setLayoutParams(listParams);
        root.addView(listView);
    }
}
