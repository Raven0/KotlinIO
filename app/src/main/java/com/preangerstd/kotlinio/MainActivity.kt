package com.preangerstd.kotlinio

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val nama: String? = "nama"
        val pass: String? = "password"
        val email: String? = "email"
        val jk: String? = "jk"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = ("Registeration Page")
        supportActionBar?.subtitle = ("Kotlin Start Here!")

        btnReg.setOnClickListener{

            if (inputNama.text.isEmpty() || inputPassword.text.isEmpty() || inputEmail.text.isEmpty() || jenisKelaminGroup.checkedRadioButtonId == -1){

                Toast.makeText(this,"Semua Field Harus Diisi!",Toast.LENGTH_LONG).show()

            } else {

                Toast.makeText(this,"Registeration Succeed!",Toast.LENGTH_LONG).show()

                val intent = Intent(this, DetailActivity::class.java)
                val bundle = Bundle()

                bundle.putString(nama, inputNama.text.toString())
                bundle.putString(pass, inputPassword.text.toString())
                bundle.putString(email, inputEmail.text.toString())

                val id = jenisKelaminGroup.checkedRadioButtonId
                val radio = findViewById<RadioButton>(id) as RadioButton
                bundle.putString(jk, radio.text.toString())

                intent.putExtras(bundle)
                startActivity(intent)

            }
        }
    }
}
