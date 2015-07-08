package by.home.katushka.yogaapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import by.home.katushka.yogaapp.R;

/**
 * Created by Katushka on 08.07.2015.
 */
public class LoginFragment extends Fragment {
    public static final String TAG = LoginFragment.class.getSimpleName();

    private EditText loginEt;
    private TextInputLayout label;

    public static Fragment newInstance() {
        Fragment frg = new LoginFragment();
        return frg;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        label = (TextInputLayout) view.findViewById(R.id.user_name_label);
        loginEt = (EditText) label.findViewById(R.id.login_et);
        label.setHint(getString(R.string.enter_username));

        return view;
    }
}
