package com.example.weatherapp02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp02.ui.theme.WeatherApp02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherApp02Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Home() {
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "M. FAHRI HIDAYAT",
            fontSize = 40.sp)
        BoxHeader()
        Spacer(modifier = Modifier.padding(20.dp))
        Middle()
        Spacer(modifier = Modifier.padding(20.dp))
        BoxLower()
    }
}

@Composable
fun BoxHeader () {
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan)) {
        Column (horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription ="",
                modifier = Modifier.size(200.dp))
            Text(
                text = "Rain",
                fontSize = 25.sp,
                modifier = Modifier.padding(10.dp))
        }
    }
}

@Composable
fun Middle () {
    Text(
        text = "26` C",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
        )
    Row {
        Image(painter = painterResource(id = R.drawable.location),
            contentDescription = "",
            modifier = Modifier.size(50.dp),
            )

        Spacer(modifier = Modifier.padding(7.dp))
        Text(
            text = "YOGYAKARTA",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            )
    }
    Text(
        text = "Kasihan,Kabupaten Bantul Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        color = Color.Gray
    )
}

@Composable
fun BoxLower () {
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Green)) {
        Column (horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Humidity",
                fontSize = 20.sp
                )

        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherApp02Theme {
        Home()
    }
}