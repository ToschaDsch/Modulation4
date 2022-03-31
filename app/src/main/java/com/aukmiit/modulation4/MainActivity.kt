package com.aukmiit.modulation4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aukmiit.modulation4.databinding.ActivityMainBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.interstitial.InterstitialAd

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var interAd: InterstitialAd? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        (application as AppMainState).showAdIfAvailable(this){

        }

        initAdMob()
    }

    private fun initAdMob() {
        MobileAds.initialize(this) {}

        val adRequest = AdRequest.Builder().build()
        binding.adView.loadAd(adRequest)
    }
}