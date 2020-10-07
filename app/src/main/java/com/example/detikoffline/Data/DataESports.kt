package com.example.detikoffline.Data

import com.example.detikoffline.R

class DataESports(var titleESport: String, var date : String, var photoEsport:Int, var detailESports : String) {
    object EsportModel{
        val sportList = listOf<DataESports>(
            DataESports(
                "Perjuangan Squad Evos Raih Juara M1 World Championship",
                "Selasa, 19 November 2019",
                R.drawable.evos_juara,
                "Ada beberapa hal menarik yang terjadi dari hasil pertandingan babak Group Stage. Pertama, dari 8 tim yang lolos ke babak Playoffs, hanya 2 tim non-MPL yang ada di sini; yaitu 10Second Gaming+ dari Jepang dan VEC Fantasy Main dari Vietnam. Sisanya, ada EVOS  Legends (ID) dan RRQ dari MPL ID, Sunsparks dari MPL PH, Todak dan Axiata Esports dari\n" +
                        "MPL MY/SG, dan Burmese Ghouls dari MPL Myanmar.\n" +
                        "\n" +
                        "Kedua, EVOS SG yang merupakan juara MPL MY/SG dan ONIC PH yang merupakan juara MPL PH justru gagal menunjukkan performa terbaik mereka. Ketiga, dua tim non-MPL yang lolos juga menarik -- meski memang 10 Second Gaming mungkin lebih menarik karena jadi satu-satunya tim dari luar regional Asia Tenggara yang berhasil lolos ke Playoff."
            ),
            DataESports(
                "Kerjasama Team RRQ dan PSG eSports Berakhir",
                "July 8, 2019",
                R.drawable.rrq_juara,
                "Tim eSports Team Rex Regum Qeon (Team RRQ) mengumumkan kerjasamanya dengan divisi eSports raksasa klub sepakbola asal Perancis, Paris Saint-Germain (PSG), telah berakhir pada hari ini, Senin (8/7/2019).\n" +
                        "\n" +
                        "Sebelumnya, kerjasama ini dimulai pada awal Maret 2019. Dalam kerjasama ini divisi Mobile Legends Team RRQ berganti nama menjadi PSG.RRQ.\n" +
                        "\n" +
                        "“Kami ingin menyampaikan rasa terima kasih dan penghormatan kepada salah satu klub terbaik dan terbesar di dunia; baik dalam olahraga maupun esports; Paris Saint Germain,” tulis Team RRQ dalam keterangan resminya."
            )
        )
    }
}