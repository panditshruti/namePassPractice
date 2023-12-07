package com.shrutipandit.myapplicationbysk

import android.content.Context
import android.renderscript.Sampler.Value
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class Apple () {

    fun myApple(context: Context, myarray: ArrayList<String>, mytext: TextView) {
        mytext.text = "Shruti"
        myarray.add("pandit")
        Toast.makeText(context, " this is function", Toast.LENGTH_SHORT).show()
    }

    fun password(password: String): String {
        return password.length.toString()
    }
    fun tableArray(number: Int): ArrayList<String> {
        val table = arrayListOf<String>()
        for (num in 1..10) {
            val result = num*number
            table.add(result.toString())
        }
      return table
    }

    fun  dataAddToFireBase(name:String,password: String){
        var db = FirebaseDatabase.getInstance().reference.child("User Details")
        db.push().setValue(UserDetails(name,password))
    }
    fun retriveDataFrebase(){

        var db = FirebaseDatabase.getInstance().reference.child("User Details")
        var arrayList = arrayListOf<UserDetails>()
//        db.addValueEventListener(object :ValueEventListener{
//            override fun onDataChange(snapshot: DataSnapshot) {
//               if (snapshot.exists()){
//                   for (data in snapshot.children){
//                       val name = data.child("name").value as String
//                       val password = data.child("password").value as String
//
//                       arrayList.add(UserDetails(name,password))
//
//                   }
//               }
            }

//            override fun onCancelled(error: DatabaseError) {
//                TODO("Not yet implemented")
//            }
//
//        })
//    }

}