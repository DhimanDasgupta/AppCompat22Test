package com.dhimandasgupta.appcompat22test;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.widget.AppCompatRatingBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragment extends Fragment {
    public static MainFragment newInstance() {
        final MainFragment mainFragment = new MainFragment();
        return mainFragment;
    }

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) view.findViewById(R.id.fragment_main_app_compat_rating_bar);
        if (appCompatRatingBar != null) {
            final Drawable drawable = appCompatRatingBar.getProgressDrawable();
            DrawableCompat.setTint(drawable, view.getContext().getResources().getColor(R.color.accent));
        }
    }
}
