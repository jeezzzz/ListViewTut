package com.jeezzzz.androidtut

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(val context: Activity, val arrayList: ArrayList<User>):
    ArrayAdapter<User>(context,R.layout.custom_user,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater=LayoutInflater.from(context)
        val view=inflater.inflate(R.layout.custom_user,null)
        val name=view.findViewById<TextView>(R.id.nameTxt)
        val lastMsg=view.findViewById<TextView>(R.id.lastMsgTxt)
        val lastMsgTime=view.findViewById<TextView>(R.id.lastMsgTimeTxt)
        val imageID=view.findViewById<CircleImageView>(R.id.profileImage)

        name.text=arrayList[position].name
        lastMsg.text=arrayList[position].lastMsg
        lastMsgTime.text=arrayList[position].lastMsgTime
        imageID.setImageResource(arrayList[position].imageID)

        return view
    }

}