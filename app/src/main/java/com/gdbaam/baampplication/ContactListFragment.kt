package com.gdbaam.baampplication

import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class ContactListFragment : Fragment(R.layout.fragment_contact_list) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<CardView>(R.id.conatct).setOnClickListener {
            (requireActivity() as MainActivity).navigateToDetails()
        }
    }

    companion object {
        fun newInstance() = ContactListFragment()
    }
}
