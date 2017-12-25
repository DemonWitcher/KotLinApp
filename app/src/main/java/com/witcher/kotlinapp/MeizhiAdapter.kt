package com.witcher.kotlinapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by witcher on 2017/12/14.
 */
class MeizhiAdapter(
        private var mData:List<String>,
        private var mLayoutInflater : LayoutInflater)
    : RecyclerView.Adapter<MeizhiAdapter.ViewHolder>(){


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.itemView?.findViewById<TextView>(R.id.tv_name)?.text = mData[position]
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MeizhiAdapter.ViewHolder {
        return ViewHolder(mLayoutInflater.inflate(R.layout.item_meizhi,parent,false))
    }


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
}