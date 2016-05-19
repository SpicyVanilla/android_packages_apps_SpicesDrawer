/*
 * Copyright (C) 2017 Spicy Vanilla
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.spicyvanilla.settings.fragments;

import android.os.Bundle;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceCategory;
import android.support.v7.preference.PreferenceScreen;

import com.android.internal.logging.MetricsProto.MetricsEvent;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class LedSettings extends SettingsPreferenceFragment {

    private static final String KEY_NOTIFICATION_LIGHT = "notification_light";
    private static final String KEY_BATTERY_LIGHT = "battery_light";

    private Preference mNotifLedFrag;
    private Preference mBattLedFrag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.led_settings);
        PreferenceScreen prefScreen = getPreferenceScreen();

        mNotifLedFrag = findPreference(KEY_NOTIFICATION_LIGHT);

        mBattLedFrag = findPreference(KEY_BATTERY_LIGHT);
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.SPICESDRAWER;
    }
}
