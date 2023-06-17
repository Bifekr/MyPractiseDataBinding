package ir.minicartoon.mypractisedatabinding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ir.minicartoon.mypractisedatabinding.mvvmsample2.MainMvvm2ViewModel


class MainViewModel2Factory(): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainMvvm2ViewModel::class.java)){
            return MainMvvm2ViewModel() as T
        }else{
            throw IllegalArgumentException("Unknown View Model Class")
        }
    }
}