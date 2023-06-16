package ir.minicartoon.mypractisedatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import ir.minicartoon.mypractisedatabinding.databinding.ActivityMainBinding
import ir.minicartoon.mypractisedatabinding.mvvmsample1.MainMvvm1Activity
import ir.minicartoon.mypractisedatabinding.mvvmsample2.MainMvvm2Activity
import ir.minicartoon.mypractisedatabinding.sample1.Sample1Activity

class MainActivity : AppCompatActivity() {
    private lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.sample1.setOnClickListener{
            startActivity(Intent(this,Sample1Activity::class.java))
        }
        binding.button2.setOnClickListener{
            startActivity(Intent(this, MainMvvm2Activity::class.java))

        }
    }
}