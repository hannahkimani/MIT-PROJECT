package net.ezra.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_SPLASH

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "SPENDWISE")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent
                )

                )
        }, content = {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Cyan)
            ) {


                Column {
                    Column(
modifier = Modifier
    .padding(top = 40.dp)
                    ) {
                        Row(
                            Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween


                        ) {

                            val paddingModifier = Modifier.padding(10.dp)
                            Card(
                                elevation = CardDefaults.cardElevation(10.dp),
                                modifier = paddingModifier
                            )
                            {
                                Text(text = "Hey", modifier = paddingModifier)

                            }

                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "fab icon",
                                Modifier.padding(14.dp)
                            )

                        }


                    }


                }

                Column(
                    modifier = Modifier
                        .padding(top = 40.dp),
                    
                    horizontalAlignment = Alignment.CenterHorizontally
                        
                ) {

                    Column {
                        Text(text = "Weekly Total")
                        Text(text = "Ksh 0.00")


                    }





                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)


                    ) {
                        Text(text = "Analytics:")
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 0.dp),
                        horizontalAlignment = Alignment.CenterHorizontally


                    )

                    {
                        Image(
                            painter = painterResource(id = R.drawable.img_3),
                            contentDescription = "img_3",


                            )
                    }


                }


            }
            Column(
                modifier = Modifier
                    .padding(top = 190.dp)
                    .padding(170.dp)
            ) {
                Text(
                    modifier = Modifier
                        .clickable {
                            navController.navigate(ROUTE_HOME) {
                                popUpTo(ROUTE_CONTACT) { inclusive = true }
                            }
                        },
                    text = Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "fab icon"
                    ),
                )
            }


        },


        bottomBar = { BottomBar(navController) }

    )

}



fun Text(modifier: Modifier, text: Unit) {

}


@Composable
    fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home, "")
        },
            label = { Text(text = "Home") },
            selected = (selectedIndex.value == 0),
            onClick = {

            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Add, "")
        },
            label = { Text(text = "Favorite") },
            selected = (selectedIndex.value == 1),
            onClick = {
                navController.navigate(ROUTE_HOME)
            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "")
        },
            label = { Text(text = "Profile") },
            selected = (selectedIndex.value == 2),
            onClick = {
                navController.navigate(ROUTE_HOME)
            })


    }
}

@Preview(showBackground = true)
        @Composable
        fun PreviewLight() {
            HomeScreen(rememberNavController())
        }

