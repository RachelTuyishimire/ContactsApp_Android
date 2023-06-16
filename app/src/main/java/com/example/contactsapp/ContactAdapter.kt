package com.example.contactsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsapp.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactAdapter (var contactList: List<ContactsData>): RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact = contactList[position]
        val binding = holder.binding
//        binding.ivAvatar.text = currentContact.avatar
        binding.tvNameDisplay.text = currentContact.name
        binding.tvNum.text = currentContact.phoneNumber
        binding.tvEmail.text = currentContact.email
        Picasso
            .get()
            .load(currentContact.avatar)
            .resize(80, 80)
            .transform(CropCircleTransformation())
            .centerCrop()
//            .placeholder(R.drawable.ivAvatar)
            .into(binding.ivAvatar)

    }
        }
class ContactViewHolder(val binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root)

