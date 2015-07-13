package by.home.katushka.yogaapp.fragments;

import android.support.v4.app.Fragment;

/**
 * Created by Katushka on 13.07.2015.
 */
public class ExerciseListFragment extends Fragment {
    public static final String TAG = ExerciseListFragment.class.getSimpleName();

    public static Fragment newInstance() {
        Fragment frg = new ExerciseListFragment();
        return frg;
    }
}
