package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.contactsapp.databinding.ActivityNewcontactBinding
import android.widget.Toast

class Newcontact : AppCompatActivity() {
    lateinit var binding:ActivityNewcontactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityNewcontactBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        clearErrorOnType()
        validateRegisterContacts()

    }
    fun clearErrorOnType(){
        binding.etName.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilName.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )
        binding.etPhone.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilPhone.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )
        binding.etEmail.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilEmail.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )
    }


    fun validateRegisterContacts(){
        val name =binding. etName.text.toString()
        val contacts = binding.etPhone.text.toString()
        val email =binding. etEmail.text.toString()

        var error = false
        if (name.isBlank()){
            binding. tilName.error = "name is required"
            error = true
        }

        if (contacts.isBlank()){
            binding.    tilPhone.error = "contacts is required"
            error = true
        }

        if (email.isBlank()){
            binding.     tilEmail.error = "Email is required"
            error = true
        }


        if (!error){
            Toast.makeText(this,"$name,$contacts, $email", Toast.LENGTH_LONG).show()
        }

    }
}