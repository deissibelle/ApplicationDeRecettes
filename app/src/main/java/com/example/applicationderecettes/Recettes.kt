package com.example.applicationderecettes

import android.annotation.SuppressLint
import android.icu.text.CaseMap
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.AssistChip
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.applicationderecettes.ui.theme.ApplicationDeRecettesTheme
import kotlinx.coroutines.launch

private val tags = listOf(
    "Fufu and Eru",
    "FufuCorn and NJama Njama",
    "fried plantains and beans",
    "fried chicken",

    )


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun Recettes(modifier: Modifier = Modifier) {



                Scaffold (
                    topBar = {
                        TopAppBar(

                            title = {
                                Column (
                                    
                                ){
                                    
                                    Text(
                                        text = "Recipe",
                                        fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        text = "lorem ipsum lorem ipsum",
                                        fontSize = 8.sp,
                                        fontWeight = FontWeight.W300
                                    )
                                }
                                


                            },

                            navigationIcon = {
                                IconButton(
                                    onClick = {}
                                ) {

                                }
                            }
                        )
                    },



                    bottomBar = {
                        BottomAppBar {
                            NavigationBarItem(
                                selected = true,
                                onClick = {},
                                icon={
                                    Icon(
                                        imageVector = Icons.Default.Settings,
                                        contentDescription = null
                                    )
                                },
                                label = {
                                    Text("photo")
                                }
                            )
                            NavigationBarItem(
                                selected = true,
                                onClick = {},
                                icon={
                                    Icon(
                                        imageVector = Icons.Default.Settings,
                                        contentDescription = null
                                    )
                                },
                                label = {
                                    Text("ingredient")
                                }
                            )
                            NavigationBarItem(
                                selected = true,
                                onClick = {},
                                icon={
                                    Icon(
                                        imageVector = Icons.Default.Favorite,
                                        contentDescription = null
                                    )
                                },
                                label = {
                                    Text("preparation")
                                }
                            )
                        }
                    }
                ){
LazyColumn(
    modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
    verticalArrangement = Arrangement.spacedBy(16.dp),
    horizontalAlignment = Alignment.CenterHorizontally
) {
    item {
        Card  (
            modifier =Modifier
                .fillMaxSize(),
        ){

            tags.forEach {
                    tag->
                AssistChip(
                    onClick = {},
                    label = {
                        Text(
                            text = tag
                        )
                    }
                )
            }
        }



    }

}
                    }
                }




@Preview(
        showBackground = true
    )

@Composable
private fun RecettesPreview() {
    ApplicationDeRecettesTheme {
        Recettes()
    }

}