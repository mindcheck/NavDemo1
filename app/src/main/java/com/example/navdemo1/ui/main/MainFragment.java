package com.example.navdemo1.ui.main;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.navdemo1.R;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    private  Button btnSecondFragment;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.main_fragment, container, false);

        btnSecondFragment = (Button) view.findViewById(R.id.btn_second_fragment);

        final EditText  editTextUserName = (EditText) view.findViewById(R.id.editText);



        btnSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(MainFragmentDirections.actionMainToSecond().setUserName(editTextUserName.getText().toString()));
            }
        });


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel

    }

}
