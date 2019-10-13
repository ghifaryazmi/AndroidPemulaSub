package com.example.submissionbeginner;

import java.util.ArrayList;

public class FoodData {
    private static String[] foodName = {
            "Mie Nyemek",
            "Nasi Goreng",
            "Bakso Malang",
            "Sate Klatak",
            "Timlo Solo",
            "Sop Manten Klaten",
            "Sego Godok",
            "Rendang",
            "Pepes Ikan",
            "Tengkleng",
            "Sroto Sokaraja"
    };

    private static String[] foodDetail = {
            "Bakmi Nyemek atau Mi Nyemek adalah bakmi rebus. Bakmi Nyemek sebenarnya mirip dengan bakmi kuah, tetapi kuahnya agak lebih sedikit. Istilah nyemek sendiri berasal dari Bahasa Jawa Sumpiuh yang diartikan tidak basah tidak kering. Mungkin tengah-tengahnya antara bakmi kuah dan bakmi goreng.",
            "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng atau margarin, biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya, seperti telur, ayam, dan kerupuk.",
            "Bakso malang terkenal punya banyak isian yang memanjakan lidah. Sebut saja bakso alus, bakso urat, pangsit goreng, pangsit basah, bakso goreng, tahu bakso, dan masih banyak lagi. Hampir semuanya menggunakan adonan dasar yang sama yaitu daging sapi giling dan tepung sagu. Anda hanya tinggal menambahkan daging ayam atau udang giling untuk kreasinya. Jadi sekali membuat, Anda bisa menyajikan banyak jenis isian bakso malang ini.",
            "Sate klatak adalah sebuah hidangan sate kambing asal Kecamatan Pleret, Kabupaten Bantul, Yogyakarta. Dalam bahasa Jawa, kegiatan membakar sate di pembakaran terbuka disebut klathak Sate ini sangat berbeda dari ragam sate lainnya, yang biasanya memakai garam dan lada sebagai bumbu utamanya. Tusukan yang dipakai untuk memanggang dan membakar terbuat dari besi, tak seperti sate lainnya yang memakai tusukan bambu.",
            "Timlo Solo merupakan hidangan yang terdiri dari mie soun, potongan sosis Solo, suwiran ayam, wortel, irisan telur yang dimasak kecap, terkadang irisan hati ayam dan telur dadar juga di tata di dalamnya kemudian disiram dengan kuah bening mirip sop. Disantap panas-panas sambil ditemani dengan sambal kecap yang pedas.",
            "Sup manten biasanya berisikan ayam, wortel, kapri, kembang kol, kentang, jamur putih, dan jamur kuping. Saat diberi kuah, sop akan semakin lezat karena rasa kaldu ayam yang gurih ditambah aroma bawang putih sangat kaya. Kuahnya bening, dengan sayuran direbus terpisah.",
            "Sego Godog artinya adalah nasi yang direbus. yang penampakan dan cara membuatnya agak mirip dengan mie rebus. Hanya saja bahan utamanya adalah nasi. Sego godog ini juga memiliki dua versi, ada yang dimasak menggunakan mie kuning, ada juga yang berisi nasi saja. Sego godog yang menggunakan mie kuning biasanya disebut sego godog magelangan.",
            "Rendang atau randang adalah masakan daging dengan bumbu rempah-rempah yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang menggunakan santan sampai kuahnya kering sama sekali.",
            "Pepes atau Pais merupakan suatu cara khas dari Jawa Barat untuk mengolah bahan makanan dengan bantuan daun pisang untuk membungkus ikan beserta bumbunya. Cara membuatnya adalah bumbu dan rempah dihaluskan dan ditambah daun kemangi, tomat, dan cabai dibalur/dibalut bersama ikan mas yang sudah dibersihkan.",
            "Tengkleng adalah masakan sejenis sup dengan bahan utama tulang kambing. Sejarah tengkleng konon menurut para tetua di kota Solo hanya para bangsawan dan orang-orang Belanda saja yang bisa menikmati masakan daging kambing. Hanya kepala, kaki, dan tulang saja yang tersisa untuk pekerja dan tukang masak.",
            "Soto Sokaraja atau yang lebih dikenal oleh orang Banyumas dengan sebutan Sroto Sokaraja merupakan salah satu makanan khas Banyumas yang patut dicoba. Berbeda dengan makanan soto dari daerah lain, salah satu ciri khas yang membedakan Soto Sokaraja dengan soto lainnya adalah penggunaan ketupat dan sambel yang terbuat dari kacang. Sambel kacang ini tidak terlalu pedas, sehingga walaupun kita membubuhkan banyak sambel kacang, tidak akan terasa terlalu pedas."

    };

    private static String[] photofood = {
            "https://img-global.cpcdn.com/003_recipes/8b4f3dff201a579c/751x532cq70/mie-nyemek-kreasi-indomie-foto-resep-utama.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2019/01/nasi-goreng-spesial-620x440.jpg",
            "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/09/080809091818/5-BaksoUratCakToha-By-meufood.jpg",
            "https://akcdn.detik.net.id/community/media/visual/2018/01/05/1fcedb5e-cd6c-4065-b521-6bf224b73b00_43.jpeg?w=600&q=",
            "https://img-global.cpcdn.com/003_recipes/bd8fdde91b0fee3d/751x532cq70/timlo-solo-ala-fitri-foto-resep-utama.jpg",
            "https://www.netralnews.com/foto/2018/09/01/658-sop_manten_makanan_berkuah_dari_solo.jpg",
            "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1560004008/dsurktuvglsapz1znedc.jpg",
            "https://cdn0-production-images-kly.akamaized.net/Jaxy2d6_YWfUQtxywol-dfTp4e4=/640x480/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1253731/original/213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg",
            "https://selerasa.com/wp-content/uploads/2015/08/images_ikan_ikan-kembung-pepes-pedas.jpg",
            "https://media-cdn.tripadvisor.com/media/photo-s/12/27/57/7d/getlstd-property-photo.jpg",
            "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1558252426/qhmfbecedfumk46brqco.jpg"
    };

    private static String[] foodcity = {
            "Yogyakarta",
            "Jawa",
            "Malang",
            "Yogyakarta",
            "Solo",
            "Klaten",
            "Magelang",
            "Padang",
            "Jawa Tengah",
            "Solo",
            "Banyumas"
    };

    private static int[] foodImage = {
            R.drawable.busiti,
            R.drawable.nasigoreng,
            R.drawable.bakso,
            R.drawable.sateklatak,
            R.drawable.timlosolo,
            R.drawable.sopmanten,
            R.drawable.nasigodok,
            R.drawable.rendang,
            R.drawable.pepesikan,
            R.drawable.tengkleng,
            R.drawable.srotosokaraja



    };

    static ArrayList<Food> getListData(){
      ArrayList<Food> list = new ArrayList<>();
      for (int i=0; i<foodName.length; i++){
          Food food = new Food();
          food.setNameFood(foodName[i]);
          food.setDetailFood(foodDetail[i]);
          food.setCityFood(foodcity[i]);
          food.setPhoto(foodImage[i]);
          list.add(food);
      }
      return list;
    }
}
