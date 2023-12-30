package com.example.transition

import android.os.Bundle
import android.view.animation.*
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var cardView: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardView = findViewById(R.id.cardView)

        val btnRotate: Button = findViewById(R.id.btnRotate)
        val btnScale: Button = findViewById(R.id.btnScale)
        val btnTranslate: Button = findViewById(R.id.btnTranslate)
        val btnAlpha: Button = findViewById(R.id.btnAlpha)
        val btnFadeIn: Button = findViewById(R.id.btnFadeIn)
        val btnFadeOut: Button = findViewById(R.id.btnFadeOut)
        val btnZoomIn: Button = findViewById(R.id.btnZoomIn)
        val btnZoomOut: Button = findViewById(R.id.btnZoomOut)
        val btnRotate2: Button = findViewById(R.id.btnRotate2)
        val btnSlideUp: Button = findViewById(R.id.btnSlideUp)
        val btnSlideDown: Button = findViewById(R.id.btnSlideDown)
        val btnSlideRight: Button = findViewById(R.id.btnSlideRight)
        val btnSlideLeft: Button = findViewById(R.id.btnSlideLeft)

        btnRotate.setOnClickListener { rotateCard() }
        btnScale.setOnClickListener { scaleCard() }
        btnTranslate.setOnClickListener { translateCard() }
        btnAlpha.setOnClickListener { alphaCard() }
        btnFadeIn.setOnClickListener { fadeInCard() }
        btnFadeOut.setOnClickListener { fadeOutCard() }
        btnZoomIn.setOnClickListener { zoomInCard() }
        btnZoomOut.setOnClickListener { zoomOutCard() }
        btnRotate2.setOnClickListener { rotateCard2() }
        btnSlideUp.setOnClickListener { slideUpCard() }
        btnSlideDown.setOnClickListener { slideDownCard() }
        btnSlideRight.setOnClickListener { slideRightCard() }
        btnSlideLeft.setOnClickListener { slideLeftCard() }
    }

    private fun rotateCard() {
        val rotateAnimation = RotateAnimation(
            0f, 360f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )
        rotateAnimation.duration = 1000
        cardView.startAnimation(rotateAnimation)
    }

    private fun scaleCard() {
        val scaleAnimation = ScaleAnimation(
            1f, 1.5f,
            1f, 1.5f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )
        scaleAnimation.duration = 1000
        scaleAnimation.fillAfter = true
        cardView.startAnimation(scaleAnimation)
    }

    private fun translateCard() {
        val translateAnimation = TranslateAnimation(
            0f, 200f,
            0f, 200f
        )
        translateAnimation.duration = 1000
        cardView.startAnimation(translateAnimation)
    }

    private fun alphaCard() {
        val alphaAnimation = AlphaAnimation(1.0f, 0.0f)
        alphaAnimation.duration = 1000
        cardView.startAnimation(alphaAnimation)
    }

    private fun fadeInCard() {
        val fadeInAnimation = AlphaAnimation(0f, 1f)
        fadeInAnimation.duration = 1000
        cardView.startAnimation(fadeInAnimation)
    }

    private fun fadeOutCard() {
        val fadeOutAnimation = AlphaAnimation(1f, 0f)
        fadeOutAnimation.duration = 1000
        cardView.startAnimation(fadeOutAnimation)
    }

    private fun zoomInCard() {
        val zoomInAnimation = ScaleAnimation(
            1f, 2f,
            1f, 2f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )
        zoomInAnimation.duration = 1000
        cardView.startAnimation(zoomInAnimation)
    }

    private fun zoomOutCard() {
        val zoomOutAnimation = ScaleAnimation(
            2f, 1f,
            2f, 1f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )
        zoomOutAnimation.duration = 1000
        cardView.startAnimation(zoomOutAnimation)
    }

    private fun rotateCard2() {
        val rotateAnimation = RotateAnimation(
            0f, -360f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )
        rotateAnimation.duration = 1000
        cardView.startAnimation(rotateAnimation)
    }

    private fun slideUpCard() {
        val slideUpAnimation = TranslateAnimation(
            Animation.RELATIVE_TO_SELF, 0f,
            Animation.RELATIVE_TO_SELF, 0f,
            Animation.RELATIVE_TO_SELF, 0f,
            Animation.RELATIVE_TO_SELF, -1f
        )
        slideUpAnimation.duration = 1000
        cardView.startAnimation(slideUpAnimation)
    }

    private fun slideDownCard() {
        val slideDownAnimation = TranslateAnimation(
            Animation.RELATIVE_TO_SELF, 0f,
            Animation.RELATIVE_TO_SELF, 0f,
            Animation.RELATIVE_TO_SELF, 0f,
            Animation.RELATIVE_TO_SELF, 1f
        )
        slideDownAnimation.duration = 1000
        cardView.startAnimation(slideDownAnimation)
    }

    private fun slideRightCard() {
        val slideRightAnimation = TranslateAnimation(
            Animation.RELATIVE_TO_SELF, 0f,
            Animation.RELATIVE_TO_SELF, 1f,
            Animation.RELATIVE_TO_SELF, 0f,
            Animation.RELATIVE_TO_SELF, 0f
        )
        slideRightAnimation.duration = 1000
        cardView.startAnimation(slideRightAnimation)
    }

    private fun slideLeftCard() {
        val slideLeftAnimation = TranslateAnimation(
            Animation.RELATIVE_TO_SELF, 0f,
            Animation.RELATIVE_TO_SELF, -1f,
            Animation.RELATIVE_TO_SELF, 0f,
            Animation.RELATIVE_TO_SELF, 0f
        )
        slideLeftAnimation.duration = 1000
        cardView.startAnimation(slideLeftAnimation)
    }
}
