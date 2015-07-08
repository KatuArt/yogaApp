package by.home.katushka.yogaapp.activities;

import android.os.Bundle;
import android.util.Log;

import by.home.katushka.yogaapp.R;
import by.home.katushka.yogaapp.core.base.ApiActivity;
import by.home.katushka.yogaapp.fragments.LoginFragment;

public class LoginActivity extends ApiActivity {
    public static final String TAG = LoginActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if (savedInstanceState == null) {
            Log.v(TAG, "MainActivity onCreate");

            getSupportFragmentManager().beginTransaction().replace(R.id.content,
                    LoginFragment.newInstance(), LoginFragment.TAG).commit();
        }
    }

    @Override
    public void showProgressDialog() {
        //@TODO
    }
}
