package com.example.appsaf.ui.theme.screens.registration

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appsaf.R
import com.example.appsaf.navigation.ROUTE_LOGIN
import com.example.appsaf.navigation.ROUTE_REGISTER


@Composable
fun RegistrationScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var user by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.img3),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds,)
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Registration",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Create your new account",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontSize = 25.sp
            )

            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "email"
                    )
                },

                label = { Text(text = "User Name/ Mail") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .background(color = Color.White),

                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                keyboardActions = KeyboardActions()
            )

            OutlinedTextField(
                value = user,
                onValueChange = { user = it },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "email"
                    )
                },
                label = { Text(text = "user@mail.com") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .background(color = Color.White),
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                keyboardActions = KeyboardActions()
            )

            Spacer(modifier = Modifier.height(30.dp))

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                trailingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "Pass") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "password"
                    )
                },
                label = { Text(text = "Password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .background(color = Color.White),
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                keyboardActions = KeyboardActions()
            )

            Icon(imageVector = Icons.Default.CheckCircle, contentDescription = "tick")

            Text(
                text = "Remember me                                     " +
                        "Forgotten password?",
                color = Color.White,
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { navController.navigate(ROUTE_LOGIN) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Text(text = "Login")
            }

            Spacer(modifier = Modifier.height(20.dp))

            TextButton(
                onClick = { navController.navigate(ROUTE_REGISTER) },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ){
                Text(text = "Don't have account ?                                                 " +
                        "Sign up",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontSize = 15.sp )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Image(painter = painterResource(id = R.drawable.manu), contentDescription = "ig")
        }
    }
}

@Preview
@Composable
private fun Registrationprev() {
    RegistrationScreen(navController = rememberNavController())
}
