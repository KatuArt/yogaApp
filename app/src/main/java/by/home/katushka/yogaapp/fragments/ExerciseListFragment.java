package by.home.katushka.yogaapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import by.home.katushka.yogaapp.R;
import by.home.katushka.yogaapp.activities.MainActivity;

/**
 * Created by Katushka on 13.07.2015.
 */
public class ExerciseListFragment extends Fragment {
    public static final String TAG = ExerciseListFragment.class.getSimpleName();

    public static Fragment newInstance() {
        Fragment frg = new ExerciseListFragment();
        return frg;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_excercise_list, container, false);
        ((MainActivity)getActivity()).setTitle(getString(R.string.asanas));
        return view;
    }
}
