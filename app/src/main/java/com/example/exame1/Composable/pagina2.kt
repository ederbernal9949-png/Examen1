package com.example.exame1.Composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun pagina2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFECDC8A))
            .padding(20.dp))
    {
        Text(
            text = "ClassMath", fontSize = 20.sp, fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(25.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth())
        {
            Box(
                modifier = Modifier
                    .size(90.dp)
                    .background(Color(0xFF1A1415), CircleShape)

            )
            Spacer(modifier = Modifier.height(10.dp))
            Text("Eder Bernal", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Text("Grado6", color = Color.Gray, fontSize = 14.sp)
        }
        Spacer(modifier = Modifier
            .height(25.dp))
        Card(
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Text(
                text = "Ayuda a aprender", modifier = Modifier.padding(16.dp),
                color = Color.White,
                fontWeight = FontWeight.SemiBold
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Aprendizaje", fontWeight = FontWeight.SemiBold, fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(15.dp))
        tarjeta(
            title = "Temporada de primavera",
            subtitle = "Semana 1",
            background = listOf(Color(0xFF110165), Color(0xFF260BD3))
        )
        Spacer(modifier = Modifier.height(20.dp))
        tarjeta(
            title = "Prueba de 7 dias", subtitle = "Dia 3", background = listOf(Color(0xFFD75522), Color(
                0xFFEFC90B
            )
            )
        )
    }
}