package com.example.my

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.my.Constance.Constance
import com.example.my.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    override fun onResume() {
        super.onResume()
        bindingClass.button1.setOnClickListener {
         val result = bindingClass.edValue.text.toString().toUpperCase()
            when (result){
                Constance.RABOCHIU -> {
                    val tempText = "Получите ваши ${Constance.RABOCHIU_SALARY}"
                    bindingClass.tvResult.text = if (bindingClass.editPasport.text.toString().toInt() == Constance.RABOCHIU_PASSWORD){
                     tempText }
                    else {
                        "Неверный пароль"
                    }
                }

                Constance.INGINER -> {
                    val tempText = "Получите ваши ${Constance.INGINER_SALARY}"
                    bindingClass.tvResult.text = if (bindingClass.editPasport.text.toString().toInt() == Constance.INGENER_PASSWORD){
                     tempText }
                    else{
                        "Неверный пароль"
                    }
                }

                Constance.DIRECTOR -> {
                    val tempText = "Получите ваши ${Constance.DIRECTOR_SALARY}"
                    bindingClass.tvResult.text = if (bindingClass.editPasport.text.toString().toInt() == Constance.DIRECTOR_PASSWORD){
                     tempText }
                    else{
                        "Неверный пароль"
                    }
                }

                else -> bindingClass.tvResult.text = "Вашего имя: ${result.toLowerCase()}. " +
                        "Нет в базе,проверьте правильность ввода"
            }
            bindingClass.tvResult.visibility = View.VISIBLE


        }

    }
}