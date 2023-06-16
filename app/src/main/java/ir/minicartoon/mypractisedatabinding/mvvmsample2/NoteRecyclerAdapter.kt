package ir.minicartoon.mypractisedatabinding.mvvmsample2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView

import ir.minicartoon.mypractisedatabinding.R


class NoteRecyclerAdapter(
    val viewModel: Mvvm2ViewModel,
    val arrayList: ArrayList<Blog>,
    private var context: Context
) :
    RecyclerView.Adapter<NoteRecyclerAdapter.NotesViewHolder>() {

  inner  class NotesViewHolder(private val binding: View) : RecyclerView.ViewHolder(binding) {
        fun bind(blog: Blog) {
            val title = binding.findViewById<TextView>(R.id.title)
            val delete = binding.findViewById<ImageButton>(R.id.delete)
            title.text = blog.title.toString()
           delete.setOnClickListener {
               viewModel.remove(blog)
                notifyItemRemoved(arrayList.indexOf(blog))
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return NotesViewHolder(root)
    }

    override fun getItemCount(): Int {
        if(arrayList.size==0){
            Toast.makeText(context,"List is empty",Toast.LENGTH_LONG).show()
        }else{
            return arrayList.size
        }
        return arrayList.size
    }

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        holder.bind(arrayList[position])
    }
}