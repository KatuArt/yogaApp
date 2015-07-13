package by.home.katushka.yogaapp.fragments;

import android.support.v4.app.Fragment;

/**
 * Created by Katushka on 13.07.2015.
 */
public class UserInfoFragment extends Fragment {
    public static final String TAG = UserInfoFragment.class.getSimpleName();

    public static Fragment newInstance() {
        Fragment frg = new UserInfoFragment();
        return frg;
    }
}
