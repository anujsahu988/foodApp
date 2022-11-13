package com.example.myfoodapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.myfoodapp.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

	private lateinit var bind : ActivityWelcomeBinding

	override fun onCreate(savedInstanceState : Bundle?) {
		super.onCreate(savedInstanceState)

		requestWindowFeature(Window.FEATURE_NO_TITLE)
		this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN)

		bind = ActivityWelcomeBinding.inflate(layoutInflater)
		setContentView(bind.root)

		bind.register.setOnClickListener {
			startActivity(Intent(this , RegistrationActivity::class.java))
		}


	}
}