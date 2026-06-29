package com.wts.socialnetwork.login.view.register.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wts.socialnetwork.R
import androidx.fragment.app.Fragment

class RegisterNamePasswordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register_name_password, container, false)
    }
}