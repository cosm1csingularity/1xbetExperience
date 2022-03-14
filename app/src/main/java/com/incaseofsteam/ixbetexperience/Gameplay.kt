package com.incaseofsteam.ixbetexperience

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_gameplay.*

class Gameplay : AppCompatActivity() {

    var scoreCheck = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gameplay)
        drum.setOnClickListener {
            scoreCheck++
            score.setText(scoreCheck.toString())
            if (score.text!! == "5") {
                mainTxt.setText("Keep going, don't stop")
            }
            if (score.text!! == "10") {
                mainTxt.setText("Do it, dude!")

            }
            if (score.text!! == "15") {
                mainTxt.setText("Congratulations! You team won!")
                drum.isVisible = false
                fan.isVisible = false
                score.isVisible = false
                beerAnim.isVisible = true
            }
        }

    }

}