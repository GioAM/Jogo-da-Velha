package com.example.user.jogodavelha

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var vez:String = "p1";
    var ganhador:String = ""
    var jogador1 = ArrayList<Int>()
    var jogador2 = ArrayList<Int>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startGame()
    }
    private fun startGame(){
        vez = "p1"
        iniciarQuadrados()
        habilitarBotoes()
        jogador1.clear()
        jogador2.clear()
    }
    fun jogada(view : View){
        var id : Int = 0
        var imageId = view.id
        view.setEnabled(false)
        var image = findViewById<ImageView>(imageId)
        if(vez.equals("p1")){
            id = resources.getIdentifier("xis","mipmap", packageName)
            jogador1.add(image.tag.toString().toInt())
            vez = "p2"

        }else if(vez.equals("p2")){
            id = resources.getIdentifier("circulo","mipmap", packageName)
            vez = "p1"
            jogador2.add(image.tag.toString().toInt())

        }
        image.setImageResource(id)
        veirificarGanhador()


    }
    fun veirificarGanhador() {
        if (jogador1.contains(1) && jogador1.contains(2) && jogador1.contains(3)) {
            Toast.makeText(this, "Jogador 1 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        } else if (jogador1.contains(4) && jogador1.contains(5) && jogador1.contains(6)) {
            Toast.makeText(this, "Jogador 1 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        } else if (jogador1.contains(7) && jogador1.contains(8) && jogador1.contains(9)) {
            Toast.makeText(this, "Jogador 1 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        } else if (jogador1.contains(1) && jogador1.contains(4) && jogador1.contains(7)) {
            Toast.makeText(this, "Jogador 1 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        } else if (jogador1.contains(2) && jogador1.contains(5) && jogador1.contains(8)) {
            Toast.makeText(this, "Jogador 1 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        } else if (jogador1.contains(3) && jogador1.contains(6) && jogador1.contains(9)) {
            Toast.makeText(this, "Jogador 1 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        }else if (jogador1.contains(1) && jogador1.contains(5) && jogador1.contains(9)) {
            Toast.makeText(this, "Jogador 1 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        }

        else if (jogador1.contains(3) && jogador1.contains(5) && jogador1.contains(7)) {
            Toast.makeText(this, "Jogador 1 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        }


        if (jogador2.contains(1) && jogador2.contains(2) && jogador2.contains(3)) {
            Toast.makeText(this, "Jogador 2 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        } else if (jogador2.contains(4) && jogador2.contains(5) && jogador2.contains(6)) {
            Toast.makeText(this, "Jogador 2 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        } else if (jogador2.contains(7) && jogador2.contains(8) && jogador2.contains(9)) {
            Toast.makeText(this, "Jogador 2 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        } else if (jogador2.contains(1) && jogador2.contains(4) && jogador2.contains(7)) {
            Toast.makeText(this, "Jogador 2 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        } else if (jogador2.contains(2) && jogador2.contains(5) && jogador2.contains(8)) {
            Toast.makeText(this, "Jogador 2 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        } else if (jogador2.contains(3) && jogador2.contains(6) && jogador2.contains(9)) {
            Toast.makeText(this, "Jogador 2 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        }else if (jogador2.contains(1) && jogador2.contains(5) && jogador2.contains(9)) {
            Toast.makeText(this, "Jogador 2 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        }
        else if (jogador2.contains(3) && jogador2.contains(5) && jogador2.contains(7)) {
            Toast.makeText(this, "Jogador 2 ganhou", Toast.LENGTH_LONG).show()
            startGame()
        }else if((jogador1.size + jogador2.size).equals(9) ){
            Toast.makeText(this, "Ninguém Ganhou", Toast.LENGTH_LONG).show()
            startGame()
        }

    }

    fun reiniciarJogo(view : View){
        startGame()

    }
    private fun iniciarQuadrados(){
        var image1 = findViewById<ImageView>(R.id.image1)
        var image2 = findViewById<ImageView>(R.id.image2)
        var image3 = findViewById<ImageView>(R.id.image3)
        var image4 = findViewById<ImageView>(R.id.image4)
        var image5 = findViewById<ImageView>(R.id.image5)
        var image6 = findViewById<ImageView>(R.id.image6)
        var image7 = findViewById<ImageView>(R.id.image7)
        var image8 = findViewById<ImageView>(R.id.image8)
        var image9 = findViewById<ImageView>(R.id.image9)
        val id = resources.getIdentifier("quadrado","mipmap", packageName)
        image1.setImageResource(id)
        image2.setImageResource(id)
        image3.setImageResource(id)
        image4.setImageResource(id)
        image5.setImageResource(id)
        image6.setImageResource(id)
        image7.setImageResource(id)
        image8.setImageResource(id)
        image9.setImageResource(id)
    }
    private fun habilitarBotoes(){
        var image1 = findViewById<ImageView>(R.id.image1)
        var image2 = findViewById<ImageView>(R.id.image2)
        var image3 = findViewById<ImageView>(R.id.image3)
        var image4 = findViewById<ImageView>(R.id.image4)
        var image5 = findViewById<ImageView>(R.id.image5)
        var image6 = findViewById<ImageView>(R.id.image6)
        var image7 = findViewById<ImageView>(R.id.image7)
        var image8 = findViewById<ImageView>(R.id.image8)
        var image9 = findViewById<ImageView>(R.id.image9)
        image1.setEnabled(true)
        image2.setEnabled(true)
        image3.setEnabled(true)
        image4.setEnabled(true)
        image5.setEnabled(true)
        image6.setEnabled(true)
        image7.setEnabled(true)
        image8.setEnabled(true)
        image9.setEnabled(true)
    }
}
