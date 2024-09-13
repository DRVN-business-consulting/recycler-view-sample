package dev.jianastrero.myawesomeresume;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class AFragment extends Fragment {

    private ImageView myImageView;

    public AFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        myImageView = view.findViewById(R.id.myImageView);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Glide.with(this)
                .load("https://placedog.net/10000/10000")
                .centerCrop()
//                .placeholder(R.drawable.loading)
                .thumbnail(Glide.with(this).load(R.drawable.loading))
                .into(myImageView);
    }
}
