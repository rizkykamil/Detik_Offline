package com.example.detikoffline.Data

import com.example.detikoffline.R

class DataCovid(var covidTitle : String, var covidDate: String, var covidPhoto: Int, var covidDetail: String) {
    object CovidModel{
        val covidList = listOf<DataCovid>(
            DataCovid(
                "DKI-Jatim Tertinggi, Ini Sebaran 1.906 Kasus Baru Corona di Indonesia 23 Juli",
                "Kamis, 23 Jul 2020",
                R.drawable.corona,
                "Pemerintah melaporkan ada 1.906 kasus baru COVID-19 yang terkonfirmasi pada hari Kamis (23/7/2020). Ini membuat total sudah 93.657 kasus terkonfirmasi semenjak virus Corona mewabah di Indonesia.\n" +
                        "DKI Jakarta menjadi provinsi dengan penambahan kasus paling tinggi sebanyak 470 kasus.\n" +
                        "\n" +
                        "Dikutip dari laman covid19.go.id, hari ini tercatat penambahan kasus sembuh melebihi kasus baru Corona. Ada sebanyak 1.909 kasus sembuh baru sementara kasus baru Corona sebanyak 1.906."
            ),

            DataCovid(
                "UPDATE Sebaran Virus Corona Indonesia: 470 Kasus Baru di DKI, 665 Sembuh di Jatim",
                "Kamis, 23 Juli 2020",
                R.drawable.corona_2,
                "Berdasarkan laporan data pada akun Twitter @BNPB_Indonesia, Kamis (23/7/2020) sore, tercatat ada 1.906 kasus baru.\n" +
                        "\n" +
                        "Sehingga total kasus virus corona di Indonesia menjadi 93.657 orang.\n" +
                        "\n" +
                        "Untuk jumlah pasien yang sembuh bertambah sebanyak 1.909 orang.\n" +
                        "\n" +
                        "Total pasien sembuh yakni 52.164 orang.\n"
            ),

            DataCovid(
                "Kenapa Vaksin Virus Corona dari China Diuji di Indonesia? Ini Penjelasan Bio Farma",
                "23/07/2020",
                R.drawable.corona_3,
                "Vaksin Sinovac, kandidat vaksin virus corona, yang berasal dari China telah tiba di Indonesia. Rencananya, vaksin Covid-19 ini akan diuji klinis fase III di Indonesia pada Agustus mendatang. Melalui akun Twitternya, @jokowi, Presiden Joko Widodo juga menyampaikan rencana uji klinis vaksin virus corona dari Sinovac tersebut.  “Kita akan melaksanakan uji klinis vaksin Covid-19 tahap ketiga dengan melibatkan 1.620 sukarelawan. Proses dan protokolnya mendapat pendampingan secara ketat oleh BPOM. Apabila berhasil, BUMN Bio Farma siap memproduksi vaksin ini dengan kapasitas 100 juta dosis per tahun,” demikian Jokowi."
            )
        )
    }
}