package by.home.katushka.yogaapp.core.beans;

import android.graphics.Bitmap;

import by.home.katushka.yogaapp.core.base.BaseBean;
import by.home.katushka.yogaapp.core.base.Measure;

/**
 * Created by Katushka on 16.07.2015.
 */
public class AsanaBean extends BaseBean {
    public String name;
    public String description;
    public Bitmap pic;
    public long startQnty;
    public Measure measure;

    public AsanaBean(String name, String description, long startQnty, Measure measure) {
        this.name = name;
        this.description = description;
        this.startQnty = startQnty;
        this.measure = measure;
    }
}
