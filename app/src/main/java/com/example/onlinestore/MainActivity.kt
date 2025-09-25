package com.example.onlinestore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.onlinestore.model.Mensaje
import com.example.onlinestore.ui.theme.OnlineStoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            OnlineStoreTheme{
                Surface (modifier = Modifier.fillMaxSize()){
                    TargetaConMensaje(Mensaje("Jonathan","Bienvendido a tu app"))
                }
            }


        }
    }
}



@Composable
fun TargetaConMensaje(mensaje: Mensaje){
    Row(modifier = Modifier.padding(all = 10.dp)) {
        Image(painter = painterResource(R.drawable.naruto),
            contentDescription = "imagen de perfil",
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colorScheme.primary,CircleShape)


        )

        Spacer(modifier = Modifier.width(10.dp))

        Column {
            Text( mensaje.autor)
            Spacer(modifier = Modifier.height(7.dp))
            Text(mensaje.cuerpo)
        }
    }
}



@Preview
@Composable
fun VistaPreviaTarjetaConMensaje(){
    OnlineStoreTheme{
        Surface (modifier = Modifier.fillMaxSize()){
            TargetaConMensaje(Mensaje("Jonathan","Bienvendido a tu app"))
        }
    }
}