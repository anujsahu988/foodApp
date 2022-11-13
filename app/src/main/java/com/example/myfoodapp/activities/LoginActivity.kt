package com.example.myfoodapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfoodapp.MainActivity
import com.example.myfoodapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

	private lateinit var bind : ActivityLoginBinding

	override fun onCreate(savedInstanceState : Bundle?) {
		super.onCreate(savedInstanceState)
		bind = ActivityLoginBinding.inflate(layoutInflater)
		setContentView(bind.root)

		bind.register.setOnClickListener {
			startActivity(Intent(this , RegistrationActivity::class.java))
		}

		bind.login.setOnClickListener {
			startActivity(Intent(this , MainActivity::class.java))
		}

	}
}