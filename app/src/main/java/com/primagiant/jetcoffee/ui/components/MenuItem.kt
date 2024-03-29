package com.primagiant.jetcoffee.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.primagiant.jetcoffee.R
import com.primagiant.jetcoffee.model.Menu

@Composable
fun MenuItem(
    menu: Menu,
    modifier: Modifier = Modifier,
) {
    Card (
        modifier = Modifier.width(140.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column {
            Image(
                painter = painterResource(menu.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Column(modifier = Modifier.padding(8.dp)){
                Text(
                    text = menu.title,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.bodySmall.copy(
                        fontWeight = FontWeight.ExtraBold
                    ),
                )
                Text(
                    text = menu.price,
                    style = MaterialTheme.typography.bodySmall,
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MenuItemPreview() {
    MaterialTheme{
        MenuItem(
            menu = Menu(R.drawable.menu2, "Hot Pumpkin Spice Latte Premium", "Rp 18.000"),
            modifier = Modifier.padding(8.dp)
        )
    }
}