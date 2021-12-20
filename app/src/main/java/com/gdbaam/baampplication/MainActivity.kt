package com.gdbaam.baampplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, ContactListFragment.newInstance())
                .commit()
        }
    }

    fun navigateToDetails() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, ContactDetailsFragment.newInstance())
            .addToBackStack(null)
            .commit()
    }
}
