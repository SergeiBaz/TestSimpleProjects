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
            val result = bindingClass.edValue.text.toString().uppercase()
            bindingClass.imphoto.visibility = View.VISIBLE
            when (result){
                Constance.RABOCHIU -> {
                    val tempText = "Получите ваши ${Constance.RABOCHIU_SALARY}"
                    if (bindingClass.editPasport.text.toString().toInt() == Constance.RABOCHIU_PASSWORD){
                        bindingClass.tvResult.text = tempText
                        bindingClass.imphoto.setImageResource(R.drawable.raboch)
                    }
                    else {
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.imphoto.setImageResource(R.drawable.dula)
                    }
                }

                Constance.INGINER -> {
                    val tempText = "Получите ваши ${Constance.INGINER_SALARY}"
                   if (bindingClass.editPasport.text.toString().toInt() == Constance.INGENER_PASSWORD){
                       bindingClass.tvResult.text = tempText
                       bindingClass.imphoto.setImageResource(R.drawable.injener)
                   }
                    else{
                       bindingClass.tvResult.text = "Неверный пароль"
                       bindingClass.imphoto.setImageResource(R.drawable.dula)
                    }
                }

                Constance.DIRECTOR -> {
                    val tempText = "Получите ваши ${Constance.DIRECTOR_SALARY}"
                    if (bindingClass.editPasport.text.toString().toInt() == Constance.DIRECTOR_PASSWORD){
                        bindingClass.tvResult.text = tempText
                        bindingClass.imphoto.setImageResource(R.drawable.direkt)
                    }
                    else{
                        bindingClass.tvResult.text = "Неверный пароль"
                        bindingClass.imphoto.setImageResource(R.drawable.dula)
                    }
                }
                else -> {
                    bindingClass.tvResult.text =
                        "Вашего имя: ${result.lowercase()}. " + "Нет в базе,проверьте правильность ввода"
                    bindingClass.imphoto.setImageResource(R.drawable.dula)
                }
            }
            bindingClass.tvResult.visibility = View.VISIBLE


        }

    }
}