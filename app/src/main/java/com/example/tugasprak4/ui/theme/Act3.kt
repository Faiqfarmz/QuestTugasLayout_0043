package com.example.tugasprak4.ui.theme

import com.example.tugasprak4.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AktivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp)
            .padding(top = 75.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(R.string.univ),
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(18.dp))

        // Card 1: Bambang Sumantri
        KartuMahasiswa(
            nama = R.string.nama_1,
            telepon = R.string.telepon_1,
            alamat = R.string.alamat_1,
            warna = R.color.card_1_bg,
            warnaTeksAlamat = R.color.text_yellow,
            fontKursif = true
        )

        // Card 2: Gibran Fathoni
        KartuMahasiswa(
            nama = R.string.nama_2,
            telepon = R.string.telepon_2,
            alamat = R.string.alamat_2,
            warna = R.color.card_2_bg,
            warnaTeksAlamat = R.color.text_yellow
        )

        // Card 3: Zhilal Fadhilah
        KartuMahasiswa(
            nama = R.string.nama_3,
            telepon = R.string.telepon_3,
            alamat = R.string.alamat_3,
            warna = R.color.card_3_bg,
            warnaTeksAlamat = R.color.text_white
        )

        // Card 4: Ahmad Alfian
        KartuMahasiswa(
            nama = R.string.nama_4,
            telepon = R.string.telepon_4,
            alamat = R.string.alamat_4,
            warna = R.color.card_4_bg,
            warnaTeksAlamat = R.color.text_white
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(R.string.copy),
            fontSize = 10.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )
    }
}

@Composable
fun KartuMahasiswa(
    nama: Int,
    telepon: Int,
    alamat: Int,
    warna: Int,
    warnaTeksAlamat: Int,
    fontKursif: Boolean = false
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 9.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(warna)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 7.dp, vertical = 9.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(R.string.logo_description),
                modifier = Modifier.size(52.dp)
            )

            Spacer(modifier = Modifier.width(9.dp))

            Column(
                modifier = Modifier.weight(1f)
            ){
                Text(
                    text = stringResource(nama),
                    fontSize = 15.sp,
                    fontWeight = if (fontKursif) {
                        FontWeight.Normal
                    } else {
                        FontWeight.Bold
                    },
                    fontFamily = if (fontKursif) {
                        FontFamily.Cursive
                    } else {
                        FontFamily.Default
                    },
                    color = colorResource(R.color.text_white)
                )

