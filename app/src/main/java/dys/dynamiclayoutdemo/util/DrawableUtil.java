package dys.dynamiclayoutdemo.util;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;

/**
 * Created by dys on 2017/3/3 0003.
 */
public class DrawableUtil {

    /**
     * selector
     *
     * @param context
     * @param idNormal
     * @param idPressed
     * @return
     */
    public static StateListDrawable addStateListBgDrawable(Context context, int idNormal, int idPressed) {
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(new int[]{android.R.attr.state_selected}, context.getResources().getDrawable(idPressed));
        drawable.addState(new int[]{android.R.attr.state_pressed}, context.getResources().getDrawable(idPressed));
        drawable.addState(new int[]{android.R.attr.state_enabled}, context.getResources().getDrawable(idNormal));
        drawable.addState(new int[]{}, context.getResources().getDrawable(idNormal));

        return drawable;
    }

    /**
     * 渐变色
     * @param orientation
     * @param colors
     * @return
     */
    public static GradientDrawable addGradientBgDrawable(GradientDrawable.Orientation orientation, int[] colors) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setOrientation(orientation); //定义渐变的方向
        drawable.setColors(colors); //colors为int[]，支持2个以上的颜色

        return drawable;
    }

}
