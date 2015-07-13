package by.home.katushka.yogaapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import by.home.katushka.yogaapp.R;
import by.home.katushka.yogaapp.activities.MainActivity;
import by.home.katushka.yogaapp.core.utils.NavigateUtils;

/**
 * Created by Katushka on 08.07.2015.
 */
public class LoginFragment extends Fragment implements View.OnClickListener{
    public static final String TAG = LoginFragment.class.getSimpleName();

    private EditText loginEt;
    private TextInputLayout label;
    private Button signInButton;

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

        signInButton = (Button)view.findViewById(R.id.sign_in_button);
        signInButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sign_in_button:
                NavigateUtils.changeActivity(getActivity(), MainActivity.class);
                break;
        }
    }
}
