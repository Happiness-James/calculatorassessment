package com.happinessjames.calculatorassessmentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tillInput1:TextInputLayout
    lateinit var etInput1:TextInputEditText
    lateinit var tilInput2:TextInputLayout
    lateinit var etInput2:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnModulus:Button
    lateinit var btnDivision:Button
    lateinit var tvResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickView()
        clicklistner()
    }
    fun clickView(){
        tillInput1=findViewById(R.id.tillInput1)
        tilInput2=findViewById(R.id.tilInput2)
        etInput1=findViewById(R.id.etInput1)
        etInput2=findViewById(R.id.etInput2)
        btnAdd=findViewById(R.id.btnAdd)
        btnDivision=findViewById(R.id.btnDivision)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnModulus=findViewById(R.id.btnModulus)
        tvResult=findViewById(R.id.tvResult)
    }

    fun clicklistner(){
        btnAdd.setOnClickListener {

            var error=false
            tillInput1.error=null
            tilInput2.error=null
            var input1=etInput1.text.toString()
            if (input1.isBlank()){
                tillInput1.error="Input is required"
                error=true


            }
            var input2=etInput2.text.toString()
            if(input2.isBlank()){
                tilInput2.error="Input is required"
                error=true
            }
            if (!error)
            addition(input1.toDouble(),input2.toDouble())
        }


        btnSubtract.setOnClickListener {

            var error=false
            tillInput1.error=null
            tilInput2.error=null
            var input1=etInput1.text.toString()
            if (input1.isBlank()){
                tillInput1.error="Input is required"
                error=true


            }
            var input2=etInput2.text.toString()
            if(input2.isBlank()){
                tilInput2.error="Input is required"
                error=true
            }
            if (!error)
                subtraction(input1.toDouble(),input2.toDouble())

        }
        btnModulus.setOnClickListener {

            var error=false
            tillInput1.error=null
            tilInput2.error=null
            var input1=etInput1.text.toString()
            if (input1.isBlank()){
                tillInput1.error="Input is required"
                error=true


            }
            var input2=etInput2.text.toString()
            if(input2.isBlank()){
                tilInput2.error="Input is required"
                error=true
            }
            if (!error)
                modulus(input1.toDouble(),input2.toDouble())

        }
        btnDivision.setOnClickListener {

            var error=false
            tillInput1.error=null
            tilInput2.error=null
            var input1=etInput1.text.toString()
            if (input1.isBlank()){
                tillInput1.error="Input is required"
                error=true


            }
            var input2=etInput2.text.toString()
            if(input2.isBlank()){
                tilInput2.error="Input is required"
                error=true
            }
            if (!error)
                divide(input1.toDouble(),input2.toDouble())


        }
    }
    fun addition(input1:Double, input2: Double){
        var addition = input1 + input2
        tvResult.text = addition.toString()

    }
    fun subtraction(input1: Double, input2: Double){
        var sub = input1 - input2
        tvResult.text = sub.toString()
    }
    fun modulus(input1: Double, input2: Double){
        var mod = input1 % input2
        tvResult.text = mod.toString()
    }
    fun divide(input1: Double, input2: Double){
        var division = input1 / input2
        tvResult.text = division.toString()
    }
}