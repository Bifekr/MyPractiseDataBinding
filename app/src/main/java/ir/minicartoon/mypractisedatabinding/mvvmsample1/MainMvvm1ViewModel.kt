package ir.minicartoon.mypractisedatabinding.mvvmsample1

import androidx.lifecycle.ViewModel

class MainMvvm1ViewModel(startingCount:Int): ViewModel() {
    private var count=startingCount
    fun getUpdateCount():Int{
        return ++count
    }
    fun getCurrentCount():Int{
        return count
    }
}