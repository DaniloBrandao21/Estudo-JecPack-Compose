package brandao.android.jettipapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import brandao.android.jettipapp.ui.theme.JetTipAppTheme
import java.util.concurrent.TimeUnit

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


        }
    }
}

@Composable
fun myApp(content: @Composable () -> Unit){
    JetTipAppTheme {
        myApp {
            Surface(color = MaterialTheme.colorScheme.background) {
                content()
            }
        }
    }
}

@Preview
@Composable
fun TopHeader(){
    Surface(modifier = Modifier.fillMaxWidth().height(150.dp)
        .clip(shape = RoundedCornerShape(corner = CornerSize(12.dp)))
        .background(color = Color.LightGray)) {
        Column() {

        }

    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetTipAppTheme {
        myApp {
            Text(text = "Hello Again!!!")
        }

    }
}