package ir.minicartoon.mypractisedatabinding.mvvmsample2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Mvvm2ViewModel: ViewModel() {
    var lst=MutableLiveData<ArrayList<Blog>>()
    private var newList=arrayListOf<Blog>()

    fun add(blog: Blog){
        newList.add(blog)
        lst.value=newList
    }
    fun remove(blog: Blog){
        newList.remove(blog)
        lst.value=newList
    }
}