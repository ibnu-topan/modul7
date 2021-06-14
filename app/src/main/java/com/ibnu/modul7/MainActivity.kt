package com.ibnu.modul7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) }
    fun ButtonOnClicked(view: View){
        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.setTitle("Judul Peringatan")
        alertDialog.setMessage("Ini pesan peringatan")
        alertDialog.setButton( AlertDialog.BUTTON_POSITIVE, "Yes"
        ) { dialog, i ->
            Toast.makeText(this, "Anda memilih tombol ya",
                Toast.LENGTH_LONG).show()
        }
        alertDialog.setButton( AlertDialog.BUTTON_NEGATIVE, "No"
        ) { dialog, i ->
            Toast.makeText(this, "Anda memilih tombol ya",
                Toast.LENGTH_LONG).show()
        }
        alertDialog.show()
    }
}
