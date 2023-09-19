package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myapplication.ui.theme.Cyan40
import com.example.myapplication.ui.theme.Purple40

@Composable
fun PlayJuegosIRB(navController: NavHostController) {

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text =  stringResource(id = R.string.portada),
            fontSize = 50.sp,
            textAlign = TextAlign.Center,

            )

        Spacer(
            modifier = Modifier
                .width(5.dp)
                .height(50.dp))

        ///////////////////////////////////////

        Button(
            onClick = { /*TODO*/ },
            Modifier.width(200.dp),
        )
        {
            Text(text = stringResource(id = R.string.play),
                fontSize = 20.sp)
        }

        //

        Button(
            onClick = {navController.navigate("NewPlayer")},
            Modifier.width(200.dp)


        )
        {
            Text(text = stringResource(id = R.string.nPlayer),
                fontSize = 20.sp)
        }

        //

        Button(
            onClick = { /*TODO*/ },
            Modifier.width(200.dp)


        )
        {
            Text(text = stringResource(id = R.string.preferences),
                fontSize = 20.sp)
        }

        //

        Button(
            onClick = { /*TODO*/ },
            Modifier.width(200.dp)


        )
        {
            Text(text = stringResource(id = R.string.about),
                fontSize = 20.sp)
        }
    }




}

@Composable
fun Horizontal(navController: NavHostController) {

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Text(
            text =  stringResource(id = R.string.portada),
            fontSize = 50.sp,
            textAlign = TextAlign.Center,

            )


        Spacer(modifier = Modifier
            .width(5.dp)
            .height(50.dp))

        //

        Row {

            Button(
                onClick = { /*TODO*/ },
                Modifier.width(200.dp),
            )
            {
                Text(text = stringResource(id = R.string.play),
                    fontSize = 20.sp)
            }

            Spacer(modifier = Modifier
                .width(20.dp)
                .height(20.dp))

            Button(
                onClick = {navController.navigate("NewPlayer")},
                Modifier.width(200.dp)

            )
            {
                Text(text = stringResource(id = R.string.nPlayer),
                    fontSize = 20.sp)
            }
        }


        Spacer(modifier = Modifier
            .width(5.dp)
            .height(20.dp))

        //

        Row {
            Button(
                onClick = { /*TODO*/ },
                Modifier.width(200.dp)


            )
            {
                Text(text = stringResource(id = R.string.preferences),
                    fontSize = 20.sp)
            }


            Spacer(modifier = Modifier
                .width(20.dp)
                .height(20.dp))


            Button(
                onClick = { /*TODO*/ },
                Modifier.width(200.dp)

            )
            {
                Text(text = stringResource(id = R.string.about),
                    fontSize = 20.sp)
            }
        }

    }




}