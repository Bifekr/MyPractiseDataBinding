package ir.minicartoon.mypractisedatabinding.notedatabindmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ir.minicartoon.mypractisedatabinding.R
import ir.minicartoon.mypractisedatabinding.databinding.ActivityNoteMainBinding

class NoteMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNoteMainBinding
    private lateinit var viewModel: NoteMainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_note_main)
        viewModel = ViewModelProvider(this)[NoteMainViewModel::class.java]

        binding.notesViewModel=viewModel
        viewModel.list.observe(this, Observer {
            binding.content.text=it.toString()
        })
        viewModel.isStringEmpty.observe(this, Observer{
            if(it==true){
                Toast.makeText(this, "No Notes Detected",Toast.LENGTH_SHORT).show();
            }
        })
    }
}