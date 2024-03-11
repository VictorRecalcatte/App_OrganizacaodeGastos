package com.example.seil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import com.example.seil.TestBottom
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.seil.ui.theme.SeiLáTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            App()
        }
    }
}


@Composable
fun App(

){

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
        //.border(2.dp, Color.Black)
    ) {
        Appbar(nome = "Victor Augusto")

        Saldo()

        Transactions()


    }
}
@Composable
fun Appbar(nome:String){

    Row(
        //modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(text = "Welcome back, \n$nome",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.weight(1f)

        )

        Icon(imageVector = Icons.Outlined.Settings,
            contentDescription = "SettingsButton",

            )
    }
}

@Composable
fun Saldo(){
    Spacer(modifier = Modifier.padding(16.dp))
    Text(text = "Spending: ",
        style = MaterialTheme.typography.bodyLarge,

        modifier = Modifier.padding(bottom = 5.dp)
        )
    LazyRow(
        horizontalArrangement = Arrangement.Center,

    ) {
        item {
            OutlinedCard(
                modifier = Modifier
                    .height(80.dp)
                    .width(150.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )


            ) {
                Text(text = "Food:",
                    modifier = Modifier.padding(top = 5.dp, start = 8.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),
                    contentAlignment = Alignment.TopCenter,

                    ) {
                    Text(text = "R$ 250,00",
                        style = MaterialTheme.typography.headlineSmall,

                        )
                }

            }
            Spacer(modifier = Modifier.padding(8.dp))
            OutlinedCard(
                modifier = Modifier
                    .height(80.dp)
                    .width(150.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )


            ) {
                Text(text = "Transport:",
                    modifier = Modifier.padding(top = 5.dp, start = 8.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),
                    contentAlignment = Alignment.TopCenter,

                    ) {
                    Text(text = "R$ 160,00",
                        style = MaterialTheme.typography.headlineSmall,

                        )
                }

            }
            Spacer(modifier = Modifier.padding(8.dp))
            OutlinedCard(
                modifier = Modifier
                    .height(80.dp)
                    .width(150.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )


            ) {
                Text(text = "Study:",
                    modifier = Modifier.padding(top = 5.dp, start = 8.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),
                    contentAlignment = Alignment.TopCenter,

                    ) {
                    Text(text = "R$ 160,00",
                        style = MaterialTheme.typography.headlineSmall,

                        )
                }

            }
            Spacer(modifier = Modifier.padding(8.dp))
            OutlinedCard(
                modifier = Modifier
                    .height(80.dp)
                    .width(150.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )


            ) {
                Text(text = "Others:",
                    modifier = Modifier.padding(top = 5.dp, start = 8.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),
                    contentAlignment = Alignment.TopCenter,

                    ) {
                    Text(text = "R$ 160,00",
                        style = MaterialTheme.typography.headlineSmall,

                        )
                }

            }
        }
        
    }

}

@Composable
fun Transactions(){

    Spacer(modifier = Modifier.padding(16.dp))
    Text(text = "Transactions: ",
        style = MaterialTheme.typography.bodyLarge,

        modifier = Modifier.padding(bottom = 5.dp)
    )
    LazyColumn(
        modifier = Modifier.padding(bottom = 100.dp)
    ) {
        items(transações.size) { index ->
            OutlinedCard(
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )

            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = transações[index],
                        modifier = Modifier.weight(1f),
                        style = MaterialTheme.typography.bodyLarge,
                    )
                    Icon(imageVector = Icons.Outlined.Delete, contentDescription = "delete")
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    App()
}

private val transações = arrayListOf(
    "Food", "Transport", "Study","Food", "Other", "Health","Food", "Transport", "Study","Food", "other", "Health",

)