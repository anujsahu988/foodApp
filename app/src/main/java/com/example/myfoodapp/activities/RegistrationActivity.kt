package com.example.myfoodapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfoodapp.MainActivity
import com.example.myfoodapp.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {

	private lateinit var bind : ActivityRegistrationBinding

	override fun onCreate(savedInstanceState : Bundle?) {
		super.onCreate(savedInstanceState)

		bind = ActivityRegistrationBinding.inflate(layoutInflater)
		setContentView(bind.root)


		bind.login.setOnClickListener {
			startActivity(Intent(this , LoginActivity::class.java))
		}

		bind.register.setOnClickListener {
			startActivity(Intent(this , MainActivity::class.java))
		}
	}
}