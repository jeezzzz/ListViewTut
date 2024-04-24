package com.jeezzzz.androidtut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    lateinit var UserArrayList:ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView=findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        val name= arrayOf("Ajeesh Rawal","Innogeeks","Shubh Agarwal","Ansh Singh","Parth Aggarwal","Kshitiz Aggarwal","Ajeesh Rawal","Innogeeks","Shubh Agarwal","Ansh Singh","Parth Aggarwal","Kshitiz Aggarwal")
        val lastMsg= arrayOf("hii","class @5","yes we'll go","ui check kar","done np","hello?","hii","class @5","yes we'll go","ui check kar","done np","hello?")
        val lastMsgTime= arrayOf("5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM")
        val imageId= intArrayOf(R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,)

        UserArrayList=ArrayList()


        for(i in name.indices)
        {
            val user=User(imageId[i],name[i],lastMsg[i],lastMsgTime[i])
            UserArrayList.add(user)
        }



        recyclerView.adapter=MyAdapter(this,UserArrayList)

    }
}












//
//        val listView=findViewById<ListView>(R.id.listView)
//
//        val tasks= arrayListOf<String>()
//        tasks.add("Go to innogeeks class")
//        tasks.add("Prepare for pre-ct")
//        tasks.add("Go to innogeeks class")
//        tasks.add("Go to innogeeks class")
//        tasks.add("Go to innogeeks class")
//
//        val myAdapter=ArrayAdapter(this, android.R.layout.simple_list_item_1,tasks)
//        listView.adapter=myAdapter
//
//        listView.setOnItemClickListener { parent, view, position, id ->
//
//            val text=(view as TextView).text.toString()
//            Toast.makeText(this,text,Toast.LENGTH_LONG).show()
//        }
//
//    }
//}