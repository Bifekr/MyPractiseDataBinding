package ir.minicartoon.mypractisedatabinding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ir.minicartoon.mypractisedatabinding.mvvmsample1.MainMvvm1ViewModel


class MainViewModelFactory(private val startingCount:Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainMvvm1ViewModel::class.java)){
            return MainMvvm1ViewModel(startingCount) as T
        }else{
            throw IllegalArgumentException("Unknown View Model Class")
        }
    }
}