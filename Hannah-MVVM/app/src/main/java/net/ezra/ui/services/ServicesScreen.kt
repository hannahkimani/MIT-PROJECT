package net.ezra.ui.services


import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.ui.theme.AppTheme



@Composable
fun ServicesScreen(navController: NavHostController) {




    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        Text(text = "ADD NEW EXPENSE")

      Column (
          modifier = Modifier
              .padding(10.dp)
      ){
          var text by remember { mutableStateOf(TextFieldValue("")) }
          TextField(
              value = text,
              onValueChange = {
                  text = it
              },
              label = { Text(text = "EXPENSE NAME") },
              placeholder = { Text(text = "Your Placeholder/Hint") },
          )

      }


Column(
    modifier = Modifier
        .padding(10.dp)
) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        label = { Text(text = "EXPENSE AMOUNT") },
        placeholder = { Text(text = "Your Placeholder/Hint") },
    )






}











        Text(
            modifier = Modifier
                .padding(20.dp)

                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_SERVICES) { inclusive = true }
                    }
                },
            text = "Cancel",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )
    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ServicesScreen(rememberNavController())
}

