package dev.jianastrero.myawesomeresume;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BFragment extends Fragment {

    private String currentToolbarTitle = "";

    public BFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();

        FragmentActivity activity = getActivity();
        AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
        currentToolbarTitle = appCompatActivity.getSupportActionBar().getTitle().toString();
        appCompatActivity.getSupportActionBar().setTitle("Showing B Fragment");
        appCompatActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        appCompatActivity.getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public void onPause() {
        super.onPause();

        FragmentActivity activity = getActivity();
        AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
        appCompatActivity.getSupportActionBar().setTitle(currentToolbarTitle);
        appCompatActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        appCompatActivity.getSupportActionBar().setDisplayShowHomeEnabled(false);
    }
}
