package com.example.navgraph.Fragments

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.example.navgraph.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}