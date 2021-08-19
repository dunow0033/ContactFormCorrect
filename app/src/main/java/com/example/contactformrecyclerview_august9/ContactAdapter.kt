package com.example.contactformrecyclerview_august9

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactformrecyclerview_august9.databinding.ItemContactBinding

class ContactAdapter(
    private val contactList: List<Contact>,
    private val listener: (contact: Contact) -> Unit
) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemContactBinding.inflate(inflater, parent, false)
        return ContactViewHolder(binding).also { holder ->
            holder.itemView.setOnClickListener {
                listener.invoke(contactList[holder.adapterPosition])
            }
        }
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(contactList[position])
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class ContactViewHolder(private val binding: ItemContactBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(contact: Contact) {
            with(binding) {
                nameTv.text = contact.name
                numberTv.text = contact.number
                companyTv.text = contact.company
            }
        }
    }
}