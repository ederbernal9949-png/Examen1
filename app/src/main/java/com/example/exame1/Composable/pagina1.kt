package com.example.exame1.Composable

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun pagina1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFECDC8A))
            .padding(20.dp))
    {
        Text(
            text = "ClassMath", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth())
        {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier.size(45.dp)
                        .background(Color(0xFF110E0E), CircleShape)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text("Eder Bernal", fontWeight = FontWeight.Bold)
                    Text("grado6", fontSize = 12.sp, color = Color.Gray)
                }
            }
            Text("Grado", color = Color.Gray)
        }
        Spacer(modifier = Modifier.height(25.dp))
        Text(text = "Inicio", fontWeight = FontWeight.SemiBold)
        Spacer(modifier = Modifier.height(12.dp))
        tarjeta(
            title = "Numeros", subtitle = "Hola numeros!",
            background = listOf(Color(0xFF053A5D), Color(0xFF0B3193))
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Cursos", fontWeight = FontWeight.SemiBold)
        Spacer(modifier = Modifier.height(15.dp))
        tarjeta(
            title = "Prueba por 7 dias", subtitle = "Inicias el 1 de Marzo",
            background = listOf(Color(0xFFDC2560), Color(0xFFEF204A)))
        Spacer(modifier = Modifier.height(15.dp))
        tarjeta(
            title = "Finalizacion de primavera", subtitle = "inicias el 1 de Marzo",
            background = listOf(Color(0xFF2C67DA), Color(0xFF5BE7BF))
        )
    }
}