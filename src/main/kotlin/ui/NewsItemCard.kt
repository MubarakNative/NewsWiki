package ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NewsItemCard(
    modifier: Modifier = Modifier,
    newsCategory: String = "Sports",
    newsTitle: String = "Mubarak Native",
    thumnailImg: String
) {
    Card(
        modifier = modifier,
        backgroundColor = MaterialTheme.colors.surface,
        border = BorderStroke(1.dp, Color.Black)
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            /*Image( /**TODO: replace with image loading lib*/
                org.jetbrains.compose.resources.painterResource(contentImg),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(120.dp).clip(RectangleShape)
            )*/
            Spacer(Modifier.width(8.dp))
            Column(verticalArrangement = Arrangement.Center, modifier = modifier) {
                Text(text = newsCategory, fontSize = 15.sp)
                Text(
                    text = newsTitle,
                    fontSize = 18.sp,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1
                )
            }
        }
    }
}