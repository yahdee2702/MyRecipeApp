package com.yahdi.recipeapp

object RecipeDataProvider {
    private val recipeData = arrayListOf(
        RecipeData(
            "Ikan teri goreng tepung",
            "https://cdn-brilio-net.akamaized.net/webp/news/2022/05/27/230295/1755035-1000xauto-resep-masakan-rumahan-sederhana.jpg",
            "- 250 gr ikan teri segar\n- 150 gr tepung instan",
            "1. Cuci bersih ikan teri, bilas sebanyak 3 kali, kemudian tiriskan.\n2. Siapkan baskom, taruh ikan teri di dalam baskom kemudian tuang sedikit demi sedikit tepung instan lalu aduk rata, diamkan 5 menit, setelah terserap beri tepung lagi aduk kembali sampai habis.\n3. Setelah terserap sempurna sampai tidak ada butir tepung kering dan tanpa menambahkan air, goreng ikan dalam minyak panas dengan api kecil hingga matang dan kering.\n4. Sajikan.",
        ),
        RecipeData(
            "Tumis kubis",
            "https://cdn-brilio-net.akamaized.net/webp/news/2022/05/27/230295/1755036-resep-masakan-rumahan-sederhana.jpg",
            "- 6 lembar kubis\n- 6 bawang merah, iris\n- 3 bawang putih, iris\n- 8 cabai rawit, iris halus\n- 2 daun salam\n- 2 cm lengkuas, geprek\n-1 sdm ebi\n- 200 ml air\n- 1 sdt kaldu ayam, jamur, dan garam\n- 1 sdt gula pasir",
            "1. Tumis bumbu iris.\n2. Masukkan daun salam, lengkuas, kubis, air, dan bumbu lain.\n3. Masak hingga meresap. Cek rasa, sajikan hangat.",
        ),
        RecipeData(
            "Sayur Lombok",
            "https://cdn-brilio-net.akamaized.net/webp/news/2022/05/27/230295/1755038-1000xauto-resep-masakan-rumahan-sederhana.jpg",
            "- 1 papan tempe, potong-potong\n- 10 buah cabai hijau keriting, iris\n- 1 sdm udang rebon\n- 1 ruas lengkuas, geprek\n- 2 lembar daun salam\n- 3 butir bawang merah, haluskan\n- 2 siung bawang putih, haluskan\n- 2 butir kemiri, haluskan\n- 1 sdt gula merah\n- Garam dan merica secukupnya\n- 1 sachet santan instan ukuran kecil",
            "1. Panaskan sedikit minyak. Tumis bumbu-bumbu sampai harum.\n2. Rebus air kira-kira 500 ml atau secukupnya. Masukkan bumbu yang sudah ditumis, tempe dan semua bahan lainnya. Masak selama 30 menit. Koreksi rasa, dan sajikan.",
        )
    )

    fun getData(): ArrayList<RecipeData> {
        return recipeData
    }
}