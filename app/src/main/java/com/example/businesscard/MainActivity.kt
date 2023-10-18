package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    val image = painterResource(id = R.drawable.img_1)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            alpha = 0.5f,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(bottom = 250.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val image = painterResource(id = R.drawable.img_3)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            )
            Text(
                text = "Kadek Astri Yani",
                color = Color.Black,
                fontSize = 40.sp,
                fontFamily = FontFamily.Serif
            )
            Text(
                text = "Student of Hasanuddin University",
                color = Color.Black,
                fontSize = 16.sp
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 500.dp)
                .padding(bottom = 100.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp),
            )
            {
                val icon = painterResource(id = R.drawable.wa)
                Image(
                    painter = icon,
                    contentDescription = null,
                    modifier = Modifier.padding(start = 60.dp)
                        .height(20.dp)
                        .width(20.dp)
                )
                Text(
                    text = "+6285211638311",
                    modifier = Modifier.padding(start = 16.dp),
                    color = Color.Black

                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp),)
            {
                val icon3 = painterResource(id = R.drawable.ig)
                Image(
                    painter = icon3,
                    contentDescription = null,
                    modifier = Modifier.padding(start = 60.dp)
                        .height(20.dp)
                        .width(20.dp)
                )
                Text(
                    text = "@astriyanika",
                    modifier = Modifier.padding(start = 16.dp),
                    color = Color.Black
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp),)
            {
                val icon2 = painterResource(id = R.drawable.gmail)
                Image(
                    painter = icon2,
                    contentDescription = null,
                    modifier = Modifier.padding(start = 60.dp)
                        .height(20.dp)
                        .width(20.dp)
                )
                Text(
                    text = "kadekastriyani@gmail.com",
                    modifier = Modifier.padding(start = 16.dp),
                    color = Color.Black
                )
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview(){
    BusinessCardTheme {
        BusinessCard()
    }
}
