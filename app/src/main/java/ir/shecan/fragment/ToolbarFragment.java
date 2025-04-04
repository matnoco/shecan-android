package ir.shecan.fragment;

import android.app.Fragment;
import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.View;

import ir.shecan.R;

/**
 * Shecan Project
 *
 * @author iTX Technologies
 * @link https://itxtech.org
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */
abstract public class ToolbarFragment extends Fragment {
    protected Toolbar toolbar;
    protected Menu menu;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        menu = ((NavigationView) getActivity().findViewById(R.id.nav_view)).getMenu();
        toolbar = getActivity().findViewById(R.id.toolbar);
        toolbar.getMenu().clear();
        checkStatus();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        toolbar = null;
        menu = null;
    }

    public abstract void checkStatus();
}
