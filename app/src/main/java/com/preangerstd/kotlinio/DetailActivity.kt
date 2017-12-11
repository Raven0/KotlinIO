package com.preangerstd.kotlinio

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val bundle = intent.extras

        outputNama.text = ("Nama : " + bundle.getCharSequence(MainActivity.nama))
        outputPassword.text = ("Password : " + bundle.getCharSequence(MainActivity.pass))
        outputEmail.text = ("Email : " + bundle.getCharSequence(MainActivity.email))
        outputJenisKelamin.text = ("Gender : " + bundle.getCharSequence(MainActivity.jk))
    }
}
