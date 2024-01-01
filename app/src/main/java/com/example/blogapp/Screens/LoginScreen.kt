package com.example.blogapp.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.blogapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(){
    var Email by remember {
        mutableStateOf("")
    }
    var Password by remember {
        mutableStateOf("")
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(
            title = {
                Text("BLOG APP",
                    color = Color.White
                )
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Black) ,
            navigationIcon = {
                IconButton(onClick = {/* Do Something*/ }) {
                    Icon(Icons.Filled.ArrowBack, null,
                        tint = Color.White
                        )
                }
            })
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            text = "Login",
            fontSize = 25.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(value = Email,
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            onValueChange = {
            Email = it
        },
            label = { Text(text = "Enter Email") },
            placeholder = { Text(text = "xyz@gmail.com") })
        Spacer(modifier = Modifier.height(20.dp))
        TextField(value = Password,
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "passwordIcon") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = {
                Password = it
            },
            label = { Text(text = "Enter Password") },
            placeholder = { Text(text = "4244fflkd@f") })
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            shape = RectangleShape,
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            )
            ) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Text(text = "Do not have account?")
            Text(text = " Sign-up", color = Color.Blue)
        }
    }
}




@Preview(showBackground = true)
@Composable
fun LoginPreview(){
    LoginScreen()
}