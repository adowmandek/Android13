package com.example.assignment_fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NumberRVAdapter(var numberList:List<String>): RecyclerView.Adapter<NumbersViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):NumbersViewHolder{
            var itemView= LayoutInflater.from(parent.context)
                .inflate(R.layout.numbers_list_item,parent,false)
            return NumbersViewHolder(itemView)
        }

        override fun onBindViewHolder(holder:NumbersViewHolder, position: Int) {
            holder.tvNumber.text=numberList.get(position)

        }

        override fun getItemCount(): Int {
            return numberList.size
        }
    }
    class NumbersViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView){
        var tvNumber=itemView.findViewById<TextView>(R.id.tvnNumber   )

    }
