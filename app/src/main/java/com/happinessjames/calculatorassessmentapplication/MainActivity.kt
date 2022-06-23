package com.happinessjames.calculatorassessmentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.happinessjames.calculatorassessmentapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickviews()
    }
    fun clickviews(){
        binding.btnAdd.setOnClickListener {
           addition(obtainInputs())
        }
        binding.btnSubtract.setOnClickListener {
           subtraction(obtainInputs())
        }
        binding.btnDivision.setOnClickListener {
           divide(obtainInputs())
        }
        binding.btnModulus.setOnClickListener {
           modulus(obtainInputs())
        }
    }

 data class Inputs(var input1:Double,var input2:Double)
    fun obtainInputs():Inputs?{
        binding.tillInput1.error = null
        binding.tilInput2.error = null
        var input1 = binding.etInput1.text.toString()
        var input2 = binding.etInput2.text.toString()
        var error = false
        if (input1.isBlank()) {
            binding.tillInput1.error = "Number 1 is required"
            error = true
        }
        if (input2.isBlank()) {
            binding.tilInput2.error = "Number 2 is required"
            error = true
        }
        if (!error) {
            return Inputs(input1.toDouble(), input2.toDouble())
        }
        return null
    }

    fun addition(inputs: Inputs?){
        if (inputs!=null){
            displayResult(inputs.input1 + inputs.input2)
        }
    }
    fun subtraction(inputs:Inputs?){
        if (inputs!=null){
            displayResult(inputs.input1 - inputs.input2)
        }
    }
    fun modulus(inputs:Inputs?){
        if (inputs!=null){
            displayResult(inputs.input1 % inputs.input2)
        }
    }
    fun divide(inputs:Inputs?){
        if (inputs!=null){
            displayResult(inputs.input1 / inputs.input2)
        }
    }
    fun displayResult(result:Double){
        binding.tvResult.text = result.toString()
    }
}