package com.example.amar.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.math.round


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable

fun video() {
    var search by remember { mutableStateOf("") }
    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFF9800))
            .verticalScroll(rememberScrollState())
    )

    {
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier
                .padding(8.dp, 8.dp, 8.dp, 8.dp)

                .clip(
                    RoundedCornerShape(
                        topStart = 15.dp,
                        topEnd = 15.dp,
                        bottomEnd = 15.dp,
                        bottomStart = 15.dp
                    )
                )

                .fillMaxWidth(),

            label = { Text("Search") },


            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFF884CB8),
                focusedIndicatorColor = Color.Black,
                unfocusedIndicatorColor = Color.DarkGray
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Mm",
                    modifier = Modifier
                        .height(64.dp)
                        .padding(start = 16.dp, top = 5.dp, bottom = 15.dp, end = 5.dp),
                )
            })
        Column (modifier= Modifier
            .fillMaxWidth()
            .height(451.dp)
            .background(Color(0xFFE91E63))){

            Text(text = "Searchjnjeshfjkehfuekshfjeksfjkewhfjekwhfjekwf,dsjkewhnfjewf,esn,esnf,ewjfewnf,ewn,ewlew")
        }

    }



    Scaffold (
        topBar = {
            Column(

                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF8B74C))
            )

            {
                TextField(
                    value = search,
                    onValueChange = { search = it },
                    modifier = Modifier
                        .padding(8.dp, 8.dp, 8.dp, 8.dp)
                        .clip(
                            RoundedCornerShape(
                                topStart = 15.dp,
                                topEnd = 15.dp,
                                bottomEnd = 15.dp,
                                bottomStart = 15.dp
                            )
                        )
                        .fillMaxWidth(),

                    label = { Text("Search") },


                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = MaterialTheme.colorScheme.surface,
                        focusedIndicatorColor = Color.Black,
                        unfocusedIndicatorColor = Color.DarkGray
                    ),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = "Mm",
                            modifier = Modifier
                                .height(64.dp)
                                .padding(start = 16.dp, top = 5.dp, bottom = 15.dp, end = 5.dp),
                        )
                    })
Card(
             modifier =Modifier.background(Color (0xFF884CB8))
                 .padding(5.dp)
                ,
    shape = RoundedCornerShape(30.dp)
){
Row (modifier = Modifier
    .fillMaxWidth()
    .height(350.dp)
    .background(Color.Black)
    .clip(
        RoundedCornerShape(
            topStart = 15.dp,
            topEnd = 15.dp,
            bottomEnd = 15.dp,
            bottomStart = 15.dp
        )
    )){

}}


            }

        },
        bottomBar = {
            BottomAppBar(modifier= Modifier
                .height(55.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomEnd = 0.dp,
                        bottomStart = 0.dp
                    )
                ),
                containerColor = Color(0xFF884CB8)

            ) {
                Row(modifier= Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 20.dp,
                            topEnd = 20.dp,
                            bottomEnd = 0.dp,
                            bottomStart = 0.dp
                        )
                    ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {





                    Icon(
                        imageVector = Icons.Filled.Refresh,
                        contentDescription = "Mm",
                        modifier = Modifier
                            .height(64.dp)
                            .padding(start = 16.dp, top = 5.dp, bottom = 15.dp, end = 5.dp),
                    )
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "Mm",
                        modifier = Modifier
                            .height(64.dp)
                            .padding(start = 16.dp, top = 5.dp, bottom = 15.dp, end = 5.dp),
                    )
                    Icon(
                        imageVector = Icons.Filled.LocationOn,
                        contentDescription = "Mm",
                        modifier = Modifier
                            .height(64.dp)
                            .padding(start = 16.dp, top = 5.dp, bottom = 15.dp, end = 5.dp),
                    )
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "Mm",
                        modifier = Modifier
                            .height(64.dp)
                            .padding(start = 16.dp, top = 5.dp, bottom = 15.dp, end = 5.dp),
                    )
                }
            }

        }
    ) { it ->
        println("it: $it")
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFF9800))
        ) {
            Text(text = "Search")
        } }


}
