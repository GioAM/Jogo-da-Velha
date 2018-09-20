package com.example.user.jogodavelha

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var vez:String = "p1";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startGame()
    }
    private fun startGame(){
        vez = "p1"
        iniciarQuadrados()
        habilitarBotoes()
    }
    fun jogada(view : View){
        var id : Int = 0
        if(vez.equals("p1")){
            id = resources.getIdentifier("xis","mipmap", packageName)
            vez = "p2"
        }else if(vez.equals("p2")){
            id = resources.getIdentifier("circulo","mipmap", packageName
            )
            vez = "p1"
        }
        var imageId = view.id
        view.setEnabled(false)
        findViewById<ImageView>(imageId).setImageResource(id)
        veirificarGanhador()
    }
    fun veirificarGanhador(){

    }
    fun reiniciarJogo(view : View){
        startGame()
    }
    private fun iniciarQuadrados(){
        val id = resources.getIdentifier("quadrado","mipmap", packageName)
        findViewById<ImageView>(R.id.image1).setImageResource(id)
        findViewById<ImageView>(R.id.image2).setImageResource(id)
        findViewById<ImageView>(R.id.image3).setImageResource(id)
        findViewById<ImageView>(R.id.image4).setImageResource(id)
        findViewById<ImageView>(R.id.image5).setImageResource(id)
        findViewById<ImageView>(R.id.image6).setImageResource(id)
        findViewById<ImageView>(R.id.image7).setImageResource(id)
        findViewById<ImageView>(R.id.image8).setImageResource(id)
        findViewById<ImageView>(R.id.image9).setImageResource(id)
    }
    private fun habilitarBotoes(){
        findViewById<ImageView>(R.id.image1).setEnabled(true)
        findViewById<ImageView>(R.id.image2).setEnabled(true)
        findViewById<ImageView>(R.id.image3).setEnabled(true)
        findViewById<ImageView>(R.id.image4).setEnabled(true)
        findViewById<ImageView>(R.id.image5).setEnabled(true)
        findViewById<ImageView>(R.id.image6).setEnabled(true)
        findViewById<ImageView>(R.id.image7).setEnabled(true)
        findViewById<ImageView>(R.id.image8).setEnabled(true)
        findViewById<ImageView>(R.id.image9).setEnabled(true)
    }
}
