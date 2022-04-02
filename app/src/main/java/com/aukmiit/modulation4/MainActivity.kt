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
        initAdMob()                                 //Ads
        (application as AppMainState).showAdIfAvailable(this){      //Ads
                                                                            //Ads
        }                                                                   //Ads

    }

    private fun initAdMob() {                       //  Ads!
        MobileAds.initialize(this) {}        //  Ads!
                                                    //  Ads!
        val adRequest = AdRequest.Builder().build() //  Ads!
        binding.adView.loadAd(adRequest)            //  Ads!
    }                                               //  Ads!
}