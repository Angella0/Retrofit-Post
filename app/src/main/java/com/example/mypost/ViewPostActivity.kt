package com.example.mypost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mypost.databinding.ActivityViewPostBinding
import javax.security.auth.callback.Callback

class ViewPostActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewPostBinding
    var postId = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPostBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_view_post)
        postId =intent.getExtra("POST_ID", 0)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        getPost()
    }
fun getPost(){
    var retrofit = ApiClient.buildServices(ApiInterface::class.java)
    var request = retrofit.getPostById(postId)
    request.enqueue(object:Callback<Post>){


    }
}
}