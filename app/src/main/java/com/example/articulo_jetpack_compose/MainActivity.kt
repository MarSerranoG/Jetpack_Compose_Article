package com.example.articulo_jetpack_compose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulo_jetpack_compose.ui.theme.Articulo_Jetpack_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Articulo_Jetpack_ComposeTheme {
                // A surface container using the 'background' color from the theme
                jetpack_Compose()
            }
        }
    }
}

@Composable
fun jetpack(modifier: Modifier=Modifier) {
Column(
    modifier=modifier,
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Image(painter = painterResource(id = R.drawable.bg_compose_background), contentDescription = null )
    Text(
        stringResource(id = R.string.title),
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
    Text(
        stringResource(id = R.string.header),
        textAlign = TextAlign.Justify,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
    Text(
        stringResource(id = R.string.content),
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(16.dp)
    )
}
}

@Preview(showBackground = true)
@Composable
fun jetpack_Compose() {
    jetpack(modifier = Modifier
        .fillMaxSize()
        .wrapContentHeight(Alignment.Top)
    )

}