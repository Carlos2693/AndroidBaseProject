package mx.bangapp.client.appointmentmedic.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dagger.hilt.android.AndroidEntryPoint
import mx.bangapp.client.appointmentmedic.ui.theme.AppointmentMedicTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppointmentMedicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TestList()
                }
            }
        }
    }
}

@Composable
fun TestList() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(40) { iterator ->
            Text(
                text = "Item in position ${iterator + 1}",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.DarkGray)
                    .padding(4.dp),
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TestListPreview() {
    AppointmentMedicTheme {
        TestList()
    }
}