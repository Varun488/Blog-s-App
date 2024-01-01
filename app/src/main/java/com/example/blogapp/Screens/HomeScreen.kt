package com.example.blogapp.Screens

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.blogapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    Scaffold(
        topBar = { TopAppBar(title = {
            Text("BLOG APP",
                color = Color.White
            )
        },
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Black) ,) },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = { FloatingActionButton(onClick = {},
            shape = CircleShape,
            containerColor = Color.Black
        ){
            Icon(imageVector = Icons.Default.Add, contentDescription = "fab icon",tint = Color.White)
        } },
        content = {
                  Box(
                      modifier = Modifier
                          .padding(it)
                          .fillMaxWidth()
                          .fillMaxSize()
                  ){
                      Spacer(modifier = Modifier.height(10.dp))
                      Column (
                          modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(20.dp)
                      ) {
                          Text(text = "Top Blogs")
                          BlogCard()
                      }

                  }
        },
        bottomBar = { BottomAppBar(containerColor = Color.Black) {
            BottomAppBar(
                containerColor = Color.Black,
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(Icons.Default.Home , contentDescription = "Localized description",tint = Color.White)
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(onClick = { /* do something */ }) {
                        Icon(Icons.Default.Favorite, contentDescription = "Localized description",tint = Color.White)
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(onClick = { /* do something */ }) {
                        Icon(Icons.Default.AccountCircle, contentDescription = "Localized description",tint = Color.White)
                    }

                })

        }
        }
    )

}
@Composable
fun BlogCard(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp),
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Blog Image")
        Text(text = "Heading blog")
        Text(
            text = "Text of blog app and basic text"
        )
    }
}


@Preview(showBackground = true)
@Composable
fun HomePreview(){
    HomeScreen()
}