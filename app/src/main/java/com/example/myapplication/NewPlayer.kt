package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField

import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuNewPlayer () {

    Column  (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Spacer(Modifier.height(10.dp))

        Row {

            val account = painterResource(R.drawable.account)


            Image(
                painter = account,
                contentDescription = null,
                Modifier
                    .height(70.dp)
                    .width(90.dp)
            )
            
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                TextField(value = "", onValueChange = {}, label = { Text(text = "Nombre")})
                Spacer(modifier = Modifier.height(10.dp))
                TextField(value = "", onValueChange = {}, label = { Text(text = "Apellidos")})
                Spacer(modifier = Modifier.height(10.dp))
                TextField(value = "", onValueChange = {}, label = { Text(text = "Nickname")})
                Spacer(modifier = Modifier.height(10.dp))
            }

        }


        Row (horizontalArrangement = Arrangement.Center){

        }


        Row {

            val camera = painterResource(R.drawable.camera)
            val email = painterResource(R.drawable.email)

            Column {
                Image(
                    painter = camera,
                    contentDescription = null,
                    Modifier
                        .height(70.dp)
                        .width(90.dp)
                )

                Image(
                    painter = email,
                    contentDescription = null,
                    Modifier
                        .height(70.dp)
                        .width(90.dp)
                )
            }


            Spacer(modifier = Modifier.width(10.dp))

            Column {
                TextField(value = "", onValueChange = {}, label = { Text(text = "Telefono")})
                Spacer(modifier = Modifier.height(10.dp))
                TextField(value = "", onValueChange = {}, label = { Text(text = "Email")})
                Spacer(modifier = Modifier.height(10.dp))

            }
        }



    }
}