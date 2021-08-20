package com.barbarapires.calculadoradenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var edtPrimeiraNota: EditText
    lateinit var edtSegundaNota: EditText
    lateinit var edtTerceiraNota: EditText
    lateinit var edtFalta: EditText
    lateinit var btnCalcular: Button
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtPrimeiraNota= findViewById(R.id.edtPrimeiraNota)
        edtSegundaNota=findViewById(R.id.edtSegundaraNota)
        edtTerceiraNota=findViewById(R.id.edtTerceiraNota)
        edtFalta= findViewById(R.id.edtFalta)
        btnCalcular= findViewById(R.id.btnCalcular)
        resultado= findViewById(R.id.resultado)

        btnCalcular.setOnClickListener {
            var nota1: Int = Integer.parseInt(edtPrimeiraNota.text.toString())
            var nota2: Int = Integer.parseInt(edtSegundaNota.text.toString())
            var nota3: Int = Integer.parseInt(edtTerceiraNota.text.toString())
            var faltas: Int = Integer.parseInt(edtFalta.text.toString())
            var media: Int = (nota1 + nota2 + nota3)/3

            if (media >= 6 && faltas <=10){
                resultado.setText("O aluno foi APROVADO")
            }else{
                resultado.setText("Aluno Reprovado")
            }

        }


    }
}