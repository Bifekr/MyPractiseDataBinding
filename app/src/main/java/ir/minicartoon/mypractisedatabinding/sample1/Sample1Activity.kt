package ir.minicartoon.mypractisedatabinding.sample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import ir.minicartoon.mypractisedatabinding.R
import ir.minicartoon.mypractisedatabinding.databinding.ActivitySample1Binding

class Sample1Activity : AppCompatActivity() {
    private lateinit var binding:ActivitySample1Binding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_sample1)

        binding.submitButton.setOnClickListener{
            displayGreeting()
        }

        binding.company=getCompany()

    }

    private fun getCompany():Company{
        return Company(1,"name ABC","email@company.com")
    }
    private fun displayGreeting() {
    binding.apply {
        greetingTextView.text="Hello" + nameEditText.text
    }
    }

}