package com.example.cuaca

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cuaca.ui.theme.CuacaTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuacaTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home(){
    Column ( modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Mahfudz Siddiq",
            fontSize = 40.sp
        )
        BoxHeader()
        Spacer(modifier = Modifier.padding(10.dp))
        Lokasi()
        Boxinformasi()
             }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuacaTheme {
        Home()
    }
}
@Composable
fun BoxHeader() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan))
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.wth_org),
            contentDescription = "",
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = "Rain",
            fontSize = 15.sp )
        }
    }
}
@Composable
fun Lokasi () {
    Text(text = "25c",
    fontSize = 64.sp,
        fontWeight = FontWeight.Bold
    )
    Row {
    Image(painter = painterResource(id = R.drawable.baseline_location_on_24), contentDescription = "", modifier = Modifier.size(40.dp)
    )
        Spacer(modifier = Modifier.padding(4.dp))
        Text(text = "Yogyakarta",
        fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
    }
    Text(text = "Kasihan, Tamantirto, Bantul \n Yogyakarta", textAlign = TextAlign.Center, color = Color.Gray)
}

@Composable
fun Boxinformasi() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray),


    ) {
        Text(
            text ="Indeks UV",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(25.dp)
                .padding(end = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text ="8/10",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(40.dp),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp
        )
        Text(
            text ="Kelembapan",
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Text(
            text ="89%",
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(40.dp),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp
        )
        Text(
            text ="Sunrise",
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(30.dp)
                .padding(top = 10.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text ="05.00 AM",
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 25.dp),
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            )
        Text(
            text ="Sunset",
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(30.dp)
                .padding(top = 10.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
            )
        Text(
            text ="06.00 PM",
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(start = 25.dp),
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold
        )
    }
}
