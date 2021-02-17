package ru.gmasalskikh.testjetpackcompose.widgets

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.AmbientContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.gmasalskikh.testjetpackcompose.R

@Composable
fun MyDrawer() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            bitmap = imageResource(id = R.drawable.kitty),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Spacer(
            modifier = Modifier
                .padding(vertical = 20.dp)
                .height(1.dp)
                .fillMaxWidth(0.8f)
                .background(Color.Black)
        )
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            items((1..100).toList()) { item ->
                if (item % 10 == 0) MyInnerRecyclerView(index = item)
                else MyCard(item)
            }
        }
    }
}

@Composable
fun MyCard(
    item: Int
) {
    Card(
        modifier = Modifier
            .height(80.dp)
            .padding(horizontal = 10.dp)
            .fillMaxWidth(),
        shape = CutCornerShape(10.dp),
        backgroundColor = Color.LightGray,
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = item.toString(),
                fontSize = 50.sp,
                color = Color.Blue
            )
        }
    }
}

@Composable
fun MyInnerRecyclerView(
    index: Int
) {
    LazyRow(
        modifier = Modifier
            .height(80.dp)
            .fillMaxWidth()
            .background(Color.DarkGray),
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        items((1..index).toList()) { item ->
            MyInnerRecyclerViewItem(item)
        }
    }
}

@Composable
fun MyInnerRecyclerViewItem(
    item: Int
) {
    val context = AmbientContext.current
    Box(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxHeight()
            .aspectRatio(1f)
            .background(Color.Cyan)
            .border(2.dp, Color.Black)
            .clickable(
                enabled = item % 5 == 0,
                onClick = {
                    Toast
                        .makeText(context, item.toString(), Toast.LENGTH_SHORT)
                        .show()
                }
            )
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = item.toString(),
            color = Color.Red
        )
    }
}