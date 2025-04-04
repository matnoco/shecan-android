package ir.shecan.fragment;

import android.content.Intent;
import android.preference.PreferenceFragment;
import androidx.appcompat.widget.Toolbar;

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
abstract public class ConfigFragment extends PreferenceFragment implements Toolbar.OnMenuItemClickListener {
    protected Intent intent = null;

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        intent = null;
    }
}
