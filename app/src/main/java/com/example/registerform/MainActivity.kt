package com.example.registerform

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.PendingIntent.getActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import javax.xml.datatype.DatatypeConstants.MONTHS


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstname = findViewById<EditText>(R.id.firstName)
        var lastname = findViewById<EditText>(R.id.lastname)

        var radiogroup = findViewById<RadioGroup>(R.id.radioGroup)
        var male = findViewById<RadioButton>(R.id.male)
        var female = findViewById<RadioButton>(R.id.female)

        var birthDay = findViewById<EditText>(R.id.birthday)
        var selectDate = findViewById<Button>(R.id.select)


        var address = findViewById<EditText>(R.id.address)

        var email = findViewById<EditText>(R.id.email)
        var term = findViewById<CheckBox>(R.id.checkBox)

        var register = findViewById<Button>(R.id.register)



        register.setOnClickListener {
            if(firstname.text.isEmpty()||lastname.text.isEmpty()||birthDay.text.isEmpty()||address.text.isEmpty()||email.text.isEmpty()||!term.isChecked || radiogroup.checkedRadioButtonId == -1){
                val text = "Please fill in all fields!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(this, text, duration) // in Activity
                toast.show()
            }else{
                val text = "Success!!!!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(this, text, duration) // in Activity
                toast.show()
            }
        }
    }
}