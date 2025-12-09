package com.example.progetto_fotogram.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.progetto_fotogram.R
import com.example.progetto_fotogram.color_background
import com.example.progetto_fotogram.color_name_text
import com.example.progetto_fotogram.transparency
import io.ktor.websocket.Frame

@Composable
fun ImageFullScreen(
    imgId: Int,
    onBackClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .background(color_background)
    ) {
        Row() {
            IconButton(
                onClick = { onBackClick() },
                modifier = androidx.compose.ui.Modifier
                    .padding(start = 5.dp, bottom = 10.dp),
                shape = RoundedCornerShape(0.dp),
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Indietro",
                    tint = color_name_text,
                    modifier = Modifier
                        .size(40.dp)
                )

            }
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp) // spazio per non coprire l'immagine col pulsante
    ) {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Fit
        )
    }
}


/*idea perchè sei una persona rompipalle e non ti piaccono le cose semplici :
sarebbe molto carino che le immagini magari si zoomassero vedi poi se è facile
da implementare o è un fever dream.
 */

