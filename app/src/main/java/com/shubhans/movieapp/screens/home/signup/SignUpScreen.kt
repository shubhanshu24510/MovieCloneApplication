package com.shubhans.movieapp.screens.home.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.shubhans.movieapp.R
import com.shubhans.movieapp.navigation.MovieScreens

@Composable
fun SignUpScreen(navController: NavController) {
    MainContent(navController)
}
@Composable
fun MainContent(navController: NavController){
    Surface(modifier = Modifier.fillMaxSize()) {
        val inputValueID = remember {
            mutableStateOf("")
        }
        val inputValuePass = remember {
            mutableStateOf("")
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(
                        shape = RoundedCornerShape(
                            bottomStart = 25.dp,
                            bottomEnd = 25.dp
                        )
                    )
                    .background(
                        brush = Brush.radialGradient(
                            colors = listOf(
                                Color(0xFFB42B93),
                                Color(0xFF000000)
                            ),
                            radius = 415f
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    modifier = Modifier
                        .size(280.dp)
                        .offset(y = ((-20).dp)),
                    painter = painterResource(id = R.drawable.movielogo),
                    contentDescription = "Background Image"
                )
            }

            Card(
                modifier = Modifier
                    .offset(y = (-20).dp)
                    .width(290.dp),
                shape = RoundedCornerShape(25.dp),
                elevation = 15.dp
            ) {
                Column(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(top = 40.dp, bottom = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "Sign Up",
                        style = MaterialTheme.typography.h4,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                    CustomInputField(inputValue = inputValueID, type = "uid")
                    CustomInputField(type = "password", inputValue = inputValuePass)
                    GradientButton(
                        modifier = Modifier.offset(y = (-50).dp).padding(top=80.dp),
                        text = "Log in",
                        textColor = Color.White,
                        gradient = Brush.horizontalGradient(
                            listOf(
                                Color(0xFFC4A0F4),
                                Color(0xFFCF4CB9),
                                Color(0xFFE60B41)
                            )
                        ), onClick = {
                            navController.navigate(route = MovieScreens.HomeScreen.name)
                        }
                    )

                }

            }

        }
    }

}


