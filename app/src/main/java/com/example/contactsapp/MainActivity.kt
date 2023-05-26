package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactsapp.databinding.ActivityMainBinding
import layout.ContactsData

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        displayContact()
    }

    fun displayContact() {

        val contact1 = ContactsData("John Doe", "Rebecca", "078798645", "rebecca@gmail.com")
        val contact2 = ContactsData("Jane Smith", "Bridget", "23498732", "bridget@gmail.com")
        val contact3 = ContactsData("Bob Johnson", "Milcah", "982734716", "milcah@gmail.com")

        val contactList = listOf(contact1, contact2, contact3)
        val contAdapter = ContactAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contAdapter
    }
}

