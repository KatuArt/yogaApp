package by.home.katushka.yogaapp.core.utils;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import by.home.katushka.yogaapp.R;

/**
 * Created by Katushka on 08.07.2015.
 */
public class NavigateUtils {
    public static final String TAG = NavigateUtils.class.getSimpleName();

    private static FragmentTransaction createAnimateFragmentTransaction(FragmentManager fm) {
        final FragmentTransaction ft = fm.beginTransaction();
        ft.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left,
                android.R.anim.slide_in_left, android.R.anim.slide_out_right);

        return ft;
    }

    public static void to(FragmentManager fm,
                          @IdRes int placeHolderResId,
                          @NonNull Fragment fragment,
                          String backStackTag) {
        Log.i(TAG, "backStackTag = " + backStackTag);
        final FragmentTransaction ft = createAnimateFragmentTransaction(fm);
        ft.addToBackStack(backStackTag);
        ft.replace(placeHolderResId, fragment, backStackTag).commit();
    }

    public static void changeActivity(Activity fromActivity, Class<?> toActivity) {
        Intent intent = new Intent(fromActivity, toActivity);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

        fromActivity.startActivity(intent);
        fromActivity.finish();
    }
}
