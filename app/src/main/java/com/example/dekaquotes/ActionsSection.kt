package com.example.dekaquotes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.rounded.ArrowDownward
import androidx.compose.material.icons.rounded.ArrowUpward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActionsSection(modifier: Modifier = Modifier) {
    Row (
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ){

        ActionsItem(
            icon = Icons.Rounded.ArrowUpward ,
            text = "Send",
            color = Color.Red.copy(0.35f)
        )

        ActionsItem(
            icon = Icons.Rounded.ArrowDownward ,
            text = "Receive",
            color = Color.Green.copy(0.35f)
        )

        ActionsItem(
            icon = Icons.Outlined.GridView ,
            text = "More",
            color = Color.Gray.copy(0.35f)
        )

    }
}


@Composable
fun ActionsItem(
    modifier: Modifier = Modifier,
    icon:ImageVector,
    text:String,
    color: Color
) {

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .background(color),
            contentAlignment = Alignment.Center
        ){
            Icon(
                imageVector = icon,
                contentDescription = text,
                tint = Color.Black,
                modifier = Modifier.size(28.dp)
            )

        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = text,
            fontFamily = Font(R.font.play).toFontFamily(),
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 16.sp)

    }
    
}