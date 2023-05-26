package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import layout.ContactsData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        class MainActivity : AppCompatActivity() {

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val contactList = listOf(
                    ContactsData("John Doe", "555-1234", "johndoe@example.com", R.drawable.placeholder_image),
                    ContactsData("Jane Smith", "555-5678", "janesmith@example.com", R.drawable.placeholder_image),
                    ContactsData("Bob Johnson", "555-9012", "bobjohnson@example.com", R.drawable.placeholder_image)
                )

                val recyclerView = findViewById<RecyclerView>(R.id.contact_list)
                recyclerView.layoutManager = LinearLayoutManager(this)
                recyclerView.adapter = ContactAdapter(contactList)
            }
        }

        )
    }
}