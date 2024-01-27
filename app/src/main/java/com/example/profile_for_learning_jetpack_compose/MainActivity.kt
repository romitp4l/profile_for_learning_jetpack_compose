package com.example.profile_for_learning_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profile_for_learning_jetpack_compose.ui.theme.Profile_for_learning_jetpack_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Profile_for_learning_jetpack_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(

                    modifier = Modifier.fillMaxSize(),

                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileScreen()

                }
            }
        }
    }
}
//
//@Composable
//fun MyProfile(modifier: Modifier){
//
//    Column (verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        ){
//        CreateImageProfile()
//        CreateInfo()
//
//    }
//}
//
//
//@Composable
//private fun CreateImageProfile(modifier: Modifier = Modifier) {
//    Surface(
//        modifier = Modifier
//            .fillMaxWidth()
//            .size(250.dp)
//            .padding(30.dp),
//        shape = CircleShape,
//        border = BorderStroke(0.5.dp, Color.Black),
//        // elevation = 4.dp,
//        color = MaterialTheme.colorScheme.primary
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.profile),
//            contentDescription = "profile image",
//            modifier = modifier.size(135.dp),
//            contentScale = ContentScale.Crop
//        )
//
//    }
//}
//
//@Composable
//private fun CreateInfo() {
//    Column(
//        modifier = Modifier
//            .padding(5.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            color = Color.Blue,
//            fontSize = 24.sp,
//            style = MaterialTheme.typography.headlineMedium,
//            text = "Romila James"
//        )
//
//        Text(
//            text = "Android Developer",
//            modifier = Modifier.padding(3.dp)
//        )
//
//        Text(
//            text = "@JetpackCompose",
//            modifier = Modifier.padding(3.dp),
//            style = MaterialTheme.typography.titleSmall
//        )
//    }
//}
//
//@Preview(showBackground = true , showSystemUi = true)
//@Composable
//fun MyProfilePreview() {
//    MyProfile(modifier = Modifier)
//
//}
@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.inversePrimary)
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Profile Image
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = null,
            modifier = Modifier
                .padding(horizontal = 60.dp)
                .clip(CircleShape)
        )

        // Spacer
        Spacer(modifier = Modifier.height(16.dp))

        // User Name
        Text(
            text = stringResource(id = R.string.user_name),
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        // Spacer
        Spacer(modifier = Modifier.height(8.dp))

        // Email
        Text(
            text = stringResource(id = R.string.user_email),
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface.copy(0.7f),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )


        // About Me
        Text(
            text = stringResource(id = R.string.about_user),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface.copy(0.7f),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        // Spacer
        Spacer(modifier = Modifier.height(28.dp))

        // Edit Profile Button
        Button(
            onClick = { /* Handle edit profile click */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colorScheme.primary)
        ) {
            Text(
                text = stringResource(id = R.string.edit_profile),
                color = MaterialTheme.colorScheme.onSecondary
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewProfileScreen() {
    ProfileScreen()
}
