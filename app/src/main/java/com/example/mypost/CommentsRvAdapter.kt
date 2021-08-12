package com.example.mypost

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CommentsRvAdapter(var commentList:List<Comment>): RecyclerView.Adapter<CommentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.comment_list_item, parent, false)
        return  CommentViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        val currentComment = commentList.get(position)
        holder.tvName.text = currentComment.name
        holder.tvEmail.text = currentComment.email
        holder.tvCommentBody.text = currentComment.body
    }

    override fun getItemCount(): Int {
        return commentList.size
    }
}

class CommentViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvCommentBody = itemView.findViewById<TextView>(R.id.tvCommentBody)
}