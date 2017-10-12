package com.indirwan.appresepmakanan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Resep> dataResep;
    private RecyclerView listResep;
    private ResepAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();
        listResep   = (RecyclerView) findViewById(R.id.list_resep);

        adapter     = new ResepAdapter(this, dataResep);
        listResep.setAdapter(adapter);
        listResep.setLayoutManager(new LinearLayoutManager(this));
    }

    private void generateData() {
        dataResep = new ArrayList<>();

        dataResep.add(new Resep("Nuget Pisang Yummy", " enaaak bangeeet !!!",
                "<b>Bahan-bahan: </b><br>" +
                        "8 buah pisang(me:kepok)<br>" +
                        "200 gr tepung terigu<br>" +
                        "4 sendok makan gula<br>" +
                        "2 sendok skm<br>" +
                        "2 butir telur<br>" +
                        "<br>" +

                        "<b> Bahan Celup :</b><br>" +
                        "2 sendok Tepung Terigu<br>"+
                        "Tepung Panir<br>"+
                        "sesuai selera Toping<br>"+
                        "<br>" +

                        "<b>Langkah Pembuatan :</b><br>" +
                        "1. Pertama, kita haluskan pisang sampai halus.<br>\n" +
                        "2. Lalu masukkan telur, gula, susu aduk rata.<br>\n" +
                        "3. Selanjutnya tuang tepung terigu perlahan, jangan terlalu keras adonannya.<br>\n" +
                        "4.Apabila dirasa cukup kita kukus adonannya<br>\n" +
                        "5. Beri minyak/alasi plastik loyang, lalu tuangkan adonan.<br>\n"+
                        "6. Kukus 20-30 menit smpai matang lalu dinginkan<br>\n"+
                        "7. Setelah dingin, potong adonan tadi sesuai selera lalu masukkan dalam adonan cair<br>\n"+
                        "8. Selanjutnya gulingkan dalam tepung panir lalu simpan dalam kulkas kurleb 20menit<br>\n"+
                        "9. Pisang pun siap digoreng dan diberi toping sesuai selera<br>\n"+
                        "10. Selamat mencoba\uD83D\uDC4C\uD83C\uDFFC\uD83D\uDC4C\uD83C\uDFFC<br>\n"+
                        "<br>\n","nuggetpisang"));
        dataResep.add(new Resep("Sate Ayam Bumbu Kacang", "Super Pedes !!!! ",
                "<b>Bahan Utama Sate Ayam Bumbu Kacang : </b><br>" +
                        "500 gr ayam fillet<br>" +
                        "<br>" +

                        "<b> Bahan Olesan :</b><br>" +
                        "2 sdm mentega<br>"+
                        "secukupnya Kecap manis<br>"+
                        "<br>" +

                        "<b> Bumbu Kacang :</b><br>"+
                        "100 gr kacang tanah goreng<br>"+
                        "4 siung bawang meraht<br>"+
                        "5 siung bawang putih<br>"+
                        "15 bh cabe rawit<br>"+
                        "10 bh cabe merah keriting<br>"+
                        "secukupnya Gula merah<br>"+
                        "secukupnya Penyedap rasa<br>"+
                        "Secukupnya minyak goreng<br>"+
                        "secukupnya Garam<br>"+
                        "<br>"+

                        "<b>Langkah Pembuatan :</b><br>" +
                        "1. Potong dadu ayam fillet tusukan ke lidi sate lakukan sampai ayam fillet habis.<br>\n" +
                        "2. Siapkan wadah campurkan mentega dan kecap, olesi sate dengan bahan olesan lalu bakar.<br>\n" +
                        "3. Sambil menunggu suami bakar sate, saya siapkan bumbu kacang. Haluskan kacang bawang merah, bawang putih dan cabe. Lalu tumis dengan minyak.<br>\n" +
                        "4. Masukkan gula merah, kecap, penyedap rasa dan garam sambil terus di aduk..<br>\n"+
                        "5. Koreksi rasa. Taburi dengan bawang goreng.Sate bumbu kacang siap di hidangkan.<br>\n","sateayam"));

    }


}

