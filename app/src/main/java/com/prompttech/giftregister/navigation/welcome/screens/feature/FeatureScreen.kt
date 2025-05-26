package com.prompttech.giftregister.navigation.welcome.screens.feature

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun FeatureScreen() {

    @Composable
    fun ItemView() {
        Row(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
            Text(text = "1")
            Text(text = "2")
            Text(text = "3")
            Text(text = "4")
        }
    }

    LazyColumn(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        stickyHeader {
            Text(
                text = "Sticky Header",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Red)
                    .padding(all = 8.dp)
                    .background(Color.Yellow)
                    .padding(all = 8.dp)
                    .background(Color.White)
                    .padding(all = 8.dp)
            )
        }
        items(20) {
            ItemView()
        }
    }

}