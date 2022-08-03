package com.example.flagtesting

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.flagtesting.ui.theme.FlagTestingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlagTestingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // Screen here
                        MainCountryPicker()
                }
            }
        }
    }
}

@Composable
fun MainCountryPicker() {
    val countryCode = CountryPicker()
    countryCode.CountryCodeDialog(
        pickedCountry = {
            Log.v("TAG", "country name is : ${it.countryName}")
        },
        defaultSelectedCountry = getListOfCountries().single { it.countryCode == "ir" },
        dialogSearch = true,
        dialogRounded = 22
    )
}
