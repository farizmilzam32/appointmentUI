package com.example.appointmentpage


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.appointmentpage.ui.theme.CardBlue
import com.example.appointmentpage.ui.theme.Orange

@Composable
fun HomeScreen(){
    val scrollState = rememberScrollState()
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
        ){
        Column(modifier = Modifier.verticalScroll(scrollState)){
            TopBar()
            DoctorLayout()
            CostLayout()
            PaymentLayout()
            PayButton()
        }

    }
}




@Composable
fun TopBar(){
    Row(
       horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp)
    ){
        Card(
            backgroundColor = Color.White,
            modifier = Modifier.wrapContentSize(),
            shape = RoundedCornerShape(corner = CornerSize(5.dp)),
            elevation = 3.dp
            ) {
            Icon(painterResource(id = R.drawable.ic_baseline_menu_24),
                contentDescription = "Menu",
                tint = Color.Black,
                modifier = Modifier
                    .padding(10.dp)
                    .size(30.dp)
            )
        }
        Text(text = "Appointment")
        Card(
            backgroundColor = Color.White,
            shape = RoundedCornerShape(corner = CornerSize(10.dp)),
            modifier = Modifier
                .wrapContentSize(),
            elevation = 3.dp
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_outline_notifications_24),
                contentDescription = "notification",
                tint = Color.Black,
                modifier = Modifier
                    .padding(10.dp)
                    .size(30.dp)
            )
        }

    }
}

@Composable
fun DoctorLayout(){
    Card(
        backgroundColor = CardBlue,
        modifier = Modifier.padding(16.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp),
        )
    ) {
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = R.drawable.ic_doctor),
                contentDescription = "doctor",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(20.dp)
                    .size(100.dp)
                    .clip(CircleShape)
                )
            Column (modifier = Modifier.padding(20.dp)) {
                Text(text = "Dr Corrie Anderson", color = Color.White)
                Text(text = "Cardiovascular", style = MaterialTheme.typography.body1, color = Color.Gray)
                Text(text = "01 hour consultation", modifier = Modifier.padding(top = 10.dp), color = Color.White)
            }
        }
    }
}

@Composable
fun CostLayout() {
    Card(
        backgroundColor = Color.White,
        modifier = Modifier.padding(16.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    )
        {
            Column (modifier = Modifier.padding(20.dp)) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {
                    Text(text = "Appointment Cost")
                    Text(text = "$95.00")
                }
                Text(text = "Consultation fee for 01 hour",
                    modifier = Modifier.padding(10.dp),
                    style = MaterialTheme.typography.body2,
                    color = Color.Gray
                    )
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {
                    Text(text = "Admin Fee")
                    Text(text = "$05.00")
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {
                    Text(text = "To Pay")
                    Text(text = "$100.00")
                }
                Divider(color = Color.Gray, thickness = 1.dp , modifier = Modifier.padding(10.dp))
                Card(modifier = Modifier.padding(16.dp),
                    backgroundColor = Color(0xFFFDF8F5),
                    shape = RoundedCornerShape(corner = CornerSize(10.dp)))
                {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                    ) {
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_receipt_24),
                            contentDescription = "promo",
                            tint = Orange,
                            modifier = Modifier.size(24.dp)
                            )
                        Text(text = "Use Promo Code")
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_chevron_right_24),
                            contentDescription = "nextPromo",
                            tint = Orange,
                            modifier = Modifier.size(24.dp)
                            )
                    }
                }
            }
    }
}

@Composable
fun PaymentLayout() {
    Card(
        backgroundColor = Color.White,
        modifier = Modifier.padding(16.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Column(modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()) {
            Text(text = "Payment Options", modifier = Modifier.padding(10.dp))
            Card(
                backgroundColor = Color.White,
                shape = RoundedCornerShape(corner = CornerSize(10.dp))
            ) {
                Column {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                    ) {
                        RadioButton(selected = true, onClick = { /*TODO*/ })
                        Text(text = "Paypal", modifier = Modifier.padding(end = 130.dp))
                        Image(
                            painter = painterResource(id = R.drawable.paypal),
                            contentDescription = "paypal",
                            modifier = Modifier.size(60.dp)
                        )
                    }
                    Divider(color = Color.LightGray, thickness = 1.dp)
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                    ) {
                        RadioButton(selected = true, onClick = { /*TODO*/ })
                        Text(text = "Credit Card", modifier = Modifier.padding(end = 80.dp))
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.visa),
                                contentDescription = "visa",
                                modifier = Modifier
                                    .padding(end = 10.dp)
                                    .size(30.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.master_card),
                                contentDescription = "visa",
                                modifier = Modifier.size(30.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.american_express),
                                contentDescription = "american",
                                modifier = Modifier.size(30.dp)
                            )
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun PayButton() {
    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Orange),
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
        ) {
            Text(text = "Pay & Confirm", color = Color.White)
        }
    }

}
