package by.home.katushka.yogaapp.core.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Katushka on 08.07.2015.
 */
public abstract class ApiActivity extends AppCompatActivity {
    private static final String TAG = ApiActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public abstract void showProgressDialog();
}
