package net.ezra.ui


import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.view.animation.OvershootInterpolator
import android.widget.Toast
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import io.grpc.okhttp.internal.Credentials
import kotlinx.coroutines.delay
import net.ezra.MainActivity
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SPLASH


@Composable
fun SplashScreen(navController: NavHostController) {





Column (
    modifier = Modifier
        .fillMaxSize()
        .padding(50.dp)
        .padding(top = 70.dp)




){
    Image(
        painter = painterResource(id = R.drawable.img_7),
        contentDescription = "img_7", modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp)

    )
}

Text(text = "SPENDWISE",
    modifier = Modifier
        .padding(top = 180.dp)
        .padding(60.dp)



)



            }




@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
SplashScreen(rememberNavController())
}

