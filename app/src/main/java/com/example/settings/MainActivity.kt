package com.example.settings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.settings.ui.theme.SettingsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SettingsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(Modifier.fillMaxWidth().fillMaxHeight()) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.padding(top = 20.dp, start = 20.dp)) {
                Text(
                    text = "Display and Language",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.DarkGray
                )
            }
        }
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.padding(20.dp)) {
                Text(
                    text = "Feed Layout",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Black
                )
                Column(Modifier.padding(top = 4.dp)) {
                    Text(
                        text = "List View",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.Gray
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End
            ) {

                Image(
                    painter =
                    painterResource(id = R.drawable.ic_drop_down_grey),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Row(Modifier.padding(start = 20.dp))
        {
            Divider(color = Color.LightGray, thickness = 1.dp)
        }
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.padding(20.dp)) {
                Text(
                    text = "Select Language",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Black
                )
                Column(Modifier.padding(top = 4.dp)) {
                    Text(
                        text = "English",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.Gray
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End
            ) {

                Image(
                    painter =
                    painterResource(id = R.drawable.ic_drop_down_grey),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Row(Modifier.padding(start = 20.dp))
        {
            Divider(color = Color.LightGray, thickness = 1.dp)
        }
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.padding(20.dp)) {
                Text(
                    text = "Font Size",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Black
                )
                Column(Modifier.padding(top = 4.dp)) {
                    Text(
                        text = "Medium",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.Gray
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End
            ) {

                Image(
                    painter =
                    painterResource(id = R.drawable.ic_drop_down_grey),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Row(Modifier.padding())
        {
            Divider(color = Color.LightGray, thickness = 5.dp)
        }
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.padding(20.dp)) {
                Text(
                    text = "More",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Black
                )
            }
        }
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.padding(start = 20.dp, bottom = 20.dp)) {
                Text(
                    text = "Feedback",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Black
                )
            }
        }

        Row(Modifier.padding(start = 20.dp))
        {
            Divider(color = Color.LightGray, thickness = 1.dp)
        }
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.padding(20.dp)) {
                Text(
                    text = "Share App",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Black
                )
            }
        }
        Row(Modifier.padding())
        {
            Divider(color = Color.LightGray, thickness = 10000.dp)
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SettingsTheme {
        Greeting()
    }
}