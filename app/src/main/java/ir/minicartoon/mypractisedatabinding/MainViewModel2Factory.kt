package ir.minicartoon.mypractisedatabinding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ir.minicartoon.mypractisedatabinding.mvvmsample1.MainMvvm1ViewModel
import ir.minicartoon.mypractisedatabinding.mvvmsample2.Mvvm2ViewModel


class MainViewModel2Factory(): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(Mvvm2ViewModel::class.java)){
            return Mvvm2ViewModel() as T
        }else{
            throw IllegalArgumentException("Unknown View Model Class")
        }
    }
}