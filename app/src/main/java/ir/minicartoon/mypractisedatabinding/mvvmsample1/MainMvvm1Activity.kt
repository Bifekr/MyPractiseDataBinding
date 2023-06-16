package ir.minicartoon.mypractisedatabinding.mvvmsample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import ir.minicartoon.mypractisedatabinding.MainViewModelFactory
import ir.minicartoon.mypractisedatabinding.R
import ir.minicartoon.mypractisedatabinding.databinding.ActivityMainMvvm1Binding

class MainMvvm1Activity : AppCompatActivity() {
    private lateinit var viewModel: MainMvvm1ViewModel
    private lateinit var binding: ActivityMainMvvm1Binding
    private lateinit var viewModelFactory: MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_mvvm1)

        viewModelFactory= MainViewModelFactory(125)
        viewModel = ViewModelProvider(this,viewModelFactory)[MainMvvm1ViewModel::class.java]
        binding.apply {
            countText.text = viewModel.getCurrentCount().toString()
            button.setOnClickListener {
                countText.text = viewModel.getUpdateCount().toString()
            }
        }

    }
}