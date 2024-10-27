package com.example.uygulama_3_alert_dialoges

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uygulama_3_alert_dialoges.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        //context
        // aktivite context :: app context

        //Toast message (oncreate'nin icinde yaz




        }
    Toast.makeText(this@MainActivity,"hosgeldiniz",Toast.LENGTH_LONG).show()
                   //mesajin nerede cikacagi, mesaj mesajin ekranda durma suresi show() fonksiyonu ile bitir
    }

    fun kaydet(view:View){
        val alert =AlertDialog.Builder(this@MainActivity)        //alert dialog gonderme
        alert.setTitle("kayit et") //alertin basligi
        alert.setMessage("kayit etmek istediginize emin misiniz !!") //ekranda yazacak uyari mesaji

        alert.setPositiveButton("Evet"){dialog,which->//evet cevabini vermek icin
            Toast.makeText(this@MainActivity,"Kayit gerceklesti",Toast.LENGTH_LONG).show()
            }

        alert.setNegativeButton("Hayir",object:DialogInterface.OnClickListener{//hayir cevabini vermek icin
            override fun onClick(p0: DialogInterface?, p1: Int) {
                Toast.makeText(this@MainActivity,"kayit gerceklestirilemedi",Toast.LENGTH_LONG).show()

            }
        })


        alert.show() //ekranda gosterme fonksiyonu

        }


    }
