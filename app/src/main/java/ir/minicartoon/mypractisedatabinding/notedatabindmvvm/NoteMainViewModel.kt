package ir.minicartoon.mypractisedatabinding.notedatabindmvvm

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel


class NoteMainViewModel():ViewModel() {
     val isStringEmpty= MutableLiveData<Boolean>()

    val inputTitle=MutableLiveData<String>()

    val inputDescription=MutableLiveData<String>()
    val list = MutableLiveData<ArrayList<NoteItem>>()
    private val arraylst = ArrayList<NoteItem>()
    init {
        isStringEmpty.value=false
    }

 fun addData() {
     val title = inputTitle.value!!
     val description = inputDescription.value!!

     if (title.isBlank() || description.isBlank()) {
         isStringEmpty.value = true
     } else {
         inputTitle.value =""
         inputDescription.value=""
         var noteItem=NoteItem(title, description)

         arraylst.add(noteItem)
         list.value=arraylst

     }
 }
    fun clearData(){
        arraylst.clear()
        list.value = arraylst
    }


}