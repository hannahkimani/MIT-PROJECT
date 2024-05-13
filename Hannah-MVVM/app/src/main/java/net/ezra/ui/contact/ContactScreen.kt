package net.ezra.ui.contact


import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.theme.AppTheme



@Composable
fun ContactScreen(navController: NavHostController) {
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){


        var text by remember { mutableStateOf(TextFieldValue("")) }
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = { Text(text = "EXPENSE NAME") },
            placeholder = { Text(text = "TEXT") },
        )
Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = { Text(text = "EXPENSE AMOUNT") },
            placeholder = { Text(text = "NUMBER") },
        )
    }


Row (
    modifier = Modifier
        .padding(top = 140.dp)
){

    Button(onClick = {
        var modifier = Modifier
            .clickable {
                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_CONTACT) { inclusive = true }
                }


            }
    }) {
        Text(text = "Save")
    }
Spacer(modifier = Modifier.width(10.dp))
    Button(onClick = {
        //your onclick code here
    }) {
        Text(text = "Cancel")
    }

}








}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}

