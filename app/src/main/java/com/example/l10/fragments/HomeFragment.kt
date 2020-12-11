package com.example.l10.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.l10.R


class HomeFragment: Fragment(R.layout.fragment_home) {

    private lateinit var navController: NavController

    private lateinit var editText: EditText

    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        editText = view.findViewById(R.id.editTextNumber)

        button = view.findViewById(R.id.button4)
        button.setOnClickListener {
            val amount = editText.text.toString().toInt()

            //ამას მიწითლებს და ის ფუნქცია ვეღარ დავამატე რაც ლექციაზე ქენიტ ბოლომდე ვერც გავიგე რა უნდა ხოდა რავი დავალება
            //შევასრულე ახალი ფრაგმენტი დავამატე ;)
            val action =  HomeFragmentDirections.actionNavigationHomeToNavigationNotification(amount)

            navController.navigate

        }

    }
}