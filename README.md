# Tutorial APAP

## Authors

- **Muhammad Fawwaz Arshad Said** - _2206082511_ _A_

---

## Tutorial 1

### Apa yang telah saya pelajari hari ini

Pada tutorial 1 ini, saya telah mempelajari bagaimana operasi-operasi dasar git diterapkan pada gitlab. Pada mata kuliah sebelumnya, saya mempelajari operasi git pada github saja. Operasi git pada gitlab mirip-mirip saja sebagaimana yang diimplementasikan pada github. Di tutorial ini, saya mempelajari version control system dan bagaimana cara mengakses file atau direktori dari commit sebelumnya dengan command `git revert <commit>`. Saya juga telah mempelajari bagaimana cara melakukan issue tracker jika bekerja pada proyek berbentuk tim di mana sangat bermanfaat untuk menghubungkan file dan direktori satu sama lain. Dalam hal ini issue tracker dapat digunakan untuk melakukan merge request sehingga menjadi jelas issue apa yang akan disolve. Ketika merge, saya telah mengetahui bagaimana opsi dalam merge bekerja yang mana hal ini membantu membuat proyek tidak mendapat hal yang tidak terpakai berlebih dengan mengeliminasi commit/branch origin. Di tutorial kali ini, materi MVC kembali diulas karena dalam framework Spring Boot sangat berkaitan erat dengan pembuatan model, view berupa template html, dan controller sebagai penghubung path atau endpoint. Saya juga telah mempelajari bagaimana cara run proyek Spring Boot serta cara meng-commit sesuai dengan kaidah agar lebih rapi untuk setiap perubahan yang terjadi dan akan dikirim ke gitlab. Saya juga mempelajari terkait dependency yang diatur sebelumnya sehingga projek Spring Boot yang saya jalankan sudah otomatis men-set versi dependency dan plugin apa saja yang dipakai. Dalam hal ini, saya mengimplementasikan empat dependencies, di antaranya Spring Web untuk hal berkaitan dengan MVC, Thymeleaf untuk template engine yang mengizinkan html ditampilkan dengan benar di browser, Spring Boot Dev Tools untuk melakukan restart, livereload, dan konfigurasi yang cepat, serta lombok sebagai library yang membantu mereduksi boilerplate suatu code.

### GitLab

1. Apa itu Issue Tracker? Apa saja masalah yang dapat diselesaikan dengan Issue Tracker?
   Issue tracker berasosisasi dengan projek-projek dalam suatu grup di mana kita dapat melihat semua isu projek dengan mudah. Dari yang dipelajari dalam tutorial 1 ini, aku berusaha menyelesaikan masalah perbedaan source pada branch yang berbeda, yaitu branch milikku dan branch main sebagai branch inti. Di issue tracker, aku juga bisa mentrack tugas dan status pekerjaan, meminta acceptance dengan pj/ketua projek terkait fitur yang dipropose, melakukan bug reports, mengaitkan isu yang terjadi dengan suatu tautan atau id isu, hingga melihat aktivitas yang telah berlangsung yang dapat difilter berdasarkan ketentuan tertentu.
2. Saat membuat Merge Request, terdapat 2 merge options yang diceklis. Jelaskan fungsi dari kedua pilihan tersebut! Mengapa hanya squash yang diceklis?
   Pertama, ada 'delete source branch when merge request is accept' dan yang edua ada 'squash commits when merge request is accepted'. Opsi pertama memungkinkan penghapusan cabang branch ketika merge request sudah diterima oleh pj/ketua/yang bertanggung jawab terhadap acceptance request. Jadi, ketika merge diterima, branch digabungkan ke cabang target sehingga branch yang menjadi source terhapus untuk menjaga kebersihan repositori dan mengurangi jumlah cabang yang sekiranya tidak penting-penting amat atau tidak aktif di repositori. Opsi kedua akan menggabungkan semua commit (bukan branch) yang ada di source cabang branch ke branch tujuan. Jadi, versi commit yang ada menjadi lebih ringkas karena sudah digabungkan ke branch tujuan. Squash membuat versi lebih bersih dan mudah di-track setelah adanya perbaikan/commit minor selama proses pengembangan fitur.
3. Apa keunggulan menggunakan Version Control System seperti Git dalam pengembangan suatu aplikasi?
   Dengan menggunakan version control system, saya bisa menilisik balik perubahan berkas dari waktu-waktu jika sewaktu-waktu menginginkan informasi source code pada berkas tertentu. Intinya, version control system mengizinkan saya mengembalikan berkas yang udah lawas ke keadaan sekarang, mengembalikan seluruh projek yang udah lawas ke keadaan sekarang, meng-compare perubahan yang terjadi di setiap waktu, lalu melihat siapa yang menjadi biang masalah dan menyebabkan isu sehingga program tidak jalan. Lebih singkat, intinya bisa memulihkan berkas sebelum-sebelumnya jika ternyata ada isu yang terjadi di kondisi sekarang dengan meng-compare dan menelaah kira-kira mending balik ke versi tersebut atau cuma ngambil dikit-dikit source sebelumnya bagian mana yang salah.

### Spring

4. Apa itu library & dependency?
   Library itu semacam kumpulan kode yang telah ditulis sebelumnya oleh developer lain yang bisa aku atau orang lain ke dalam suatu proyek jadi ready-to-use. Dengan library, tersedia banyak program dengan fungsionalitas tertentu yang bisa dipakai tanpa menulis kode dari awal. Berbagai fitur yang ada, contohnya pengelolaan transaksi, pengiriman pesan, keamanan, dll. Contoh library di Spring misalnya Spring Security. Lalu, dependency itu istilah yang merujuk kebutuhan proyek terhadap library atau komponen eksternal yang dapat diunduh otomatis dengan alat manajemen, seoerti Gradle. Di Spring Boot sendiri, manajemen dependensi dilakukan dengan cukup mendeklarasikan dependensi di file konfigrurasi, seperti build.gradle.
5. Apa itu Gradle? Mengapa kita menggunakan Gradle? Apakah ada alternatif dari Gradle? Gradle adalah tool untuk membuild otomatis, mengelola, dan melakukan testing perangkat lunak. Gradle memungkinkan developer mengelola dependednsi, run task yang kompleks, dan otomasi banyak aspek. Karena pakai Spring Boot, Gradle lumayan populer di kalangan developer yang menggunakan Spring Boot karena fleksibilitasnya tinggi akibat penggunaan domain-specific-language (DSL) untuk configure build. Build juga bisa dilakukan secara inkremental atau sebagian proyek yang ingin diubah bisa di-rebuild dan ada build caching sehingga hasil build yang tidak ikut perubahan tetap disimpan. Alternatif lain dari Gradle adalah Maven, Ant + Ivy, dll. Maven juga populer di kalangan pengembang yang pakai Spring Boot, tetapi memang kurang fleksibel buat kostumisasi karena simpel. Soalnya, Maven menggunakan format .xml buat konfigurasi build, dependency, dan plugin yang meskipun bagus untuk proyek sederhana tapi kurang bagus buat proyek yang berjalan sustain karena keterbatasan penulisan lohika yang rumit dan dinamis. Selain itu, Maven juga cenderung lebih lambat daripada Gradle. Selain Maven, ada Ant+Ivy yang menjadi alat build yang lebih dahulu dari Maven. Di Ant kita tidak dapat mengelola dependency bawaan sehingga membutuhkan Ivy untuk kelola dependency. Meskipun fleksibel untuk berbagai tugas build, konfigurasi Ant sangat manual dan ga otomatis / kurnag modern dibandingkan Maven dan Gradle.
6. Apa itu DTO? Apakah DTO harus selalu digunakan? Kapan sebaiknya kita menggunakan DTO?
   DTO atau data transfer object adalah pola desain yang digunakan untuk transfer data antarlapisan atau modul aplikasi. Intinya, hanya berisi data tanpa logika bisnis. Hal ini penting digunakan karena dapat meminimalisasi pengiriman data berlebih antara lapisan aplikasi, misalnya server dan client. DTO ga harus selalu digunakan karena tidak selalu diperlukan untuk setiap kasus yang justru kalau berlebihan bisa jadi boilerplate dan kompleks. DTO ga diperlukan kalau proyeknya kecil dan sederhana yang ga butuh komunikasi antar modul yang kompleks (bisa langsung pakai entitas model atau objek bisnis aja). Lalu, kalau bekerja dalam satu lapisan yang da memerlukan pengiriman data bisa jadi overkill. Jadi, pas-pasin aja sama kebutuhan proyek biar penggunaan langsung objek domain bisa jadi lebih efisien. Sebaiknya, gunakan DTO ketika ingin memisahkan antara presentation layer, service layer, dan data layer dengan memerhatikan bahwa hanya data yang diperlukan yang dipindahkan ke lapisan tersebut, misal logika bisnis gausah dimasukan di lapisan transport data. DTO juga sering digunakan buat komuniaksi antara server dan client di RESTful APIs atau web services. Ketika mengirim data dari server ke client, DTO memungkinkan kita untuk kontrol data yang ingin dikirim karena ga seluruh objek entitas dikirim keseluruhan propertinya.
7. Jelaskan bagaimana alur ketika kita menjalankan http://localhost:8080/roman-converter/MMXXIV sampai dengan muncul keluarannya di browser!
   Untuk membuat program konversi bilangan romawi, aku membuat package model, controller, dan dto di direktori com.tutorial.romanconverter. Di package controller, aku buat class baru yaitu RomanConverterController dengan mapping bertipe Get yang meredirect ke /roman-converter/{roman}. Di dalam class, aku buat method romanConverterWithPathVariable yang menangkap PathVariable bervalue roman sehingga return bisa dilakukan dengan mereturn getRomanConverterPage yang menggunakan arugument roman bertipe String dan model bertipe Model. Di getRomanConverterPage, aku mengakses metode RomanConverter untuk diassign ke romanConverter. Lalu, addAttribute dilakukan agar nanti di template html view-conversion-result.html bisa akses romanConverter yang dapat diisi di URL dengan angka romawi. Setelah itu, program dijalankan dengan ./gradlew bootRun dan akses endpoint localhost:8080/roman-converter/MMXXIV. Jika sudah, aku add perubahan dan meng-commit dan push perubahan ke git dengan commit
   `feat: tutorial 1 - convert with path variable`.
8. Jelaskan bagaimana alur ketika kita menjalankan http://localhost:8080/roman-converter?roman=MMXXIV sampai dengan muncul keluarannya di browser!
   Sama seperti sebelumnya, aku melakukan mapping bertipe GET sehingga nantinya akses endpoint bisa dilakukan di ./roman-converter dengan request parameter. Request Parameter nantinya akan memformat tautan menjadi "..?roman=.." yang membedakan dari proses sebelumnya. Setelah itu, saya jalankan program dengan ./gradlew bootRun dan akses endpoint localhost:8080/roman-converter?roman=MMXXIV. Lalu, perubahan semuanya saya commit lagi dan push ke git dengan commit `feat: tutorial 1 - convert with request parameter`.
9. Jelaskan bagaimana alur ketika kita menjalankan http://localhost:8080/convert sampai dengan muncul keluarannya di browser!
   Untuk mengakses endpoint tersebut, langkah yang dijalankan cukup berbeda dengan dua nomor sebelumnya. Dalam hal ini, saya tidak hanya nge-mapping dengan tipe GET melainkan juga bertipe POST. Hal ini nantinya akan dibuat suatu submisi form yang mana akan diakses value '/convert' melalui form UI template yang sudah dibuat pada form.html. Method yang dibuat pada PostMapping adalah postRomanConverterWithView yang membutuhkan akses request data transfer object untuk bertransaksi inputan pengguna. Nantinya, fungsi akan mereturn getRomanConverterPage yang akan melakukan akses ke template form.html jika value endpoint adalah "/convert". Setelah method dan file dibuat, aku mencoba menjalankan dengan ./gradlew bootRun dan akses endpoint localhost:8080/convert. Sama seperti sebelumnya, perubahan disimpan, dicommit, dan dipush ke git dengan commit `feat: tutorial 1 - convert with view`.

10. Pada Tutorial 1 - Panduan bagian Spring Boot > VS Code / IDE > langkah 4, kita mendapati error. Apa penyebabnya? Tip: Kamu bisa melihat commit dengan nama `feat: tutorial 1 - initialize spring boot project` untuk melihat versi kode di langkah tersebut.
    Hal ini terjadi karena tidak ada resource atau template yang dimapping ke suatu endpoint. Dalam hal ini, saya mengakses endpoint localhost:8080 di mana belum ada controller yang me-mapping value "/" disertai akses template htmlnya.

### Apa yang belum saya pahami

(tuliskan apa saja yang kurang Anda mengerti, Anda dapat mencentang apabila Anda sudah mengerti dikemudian hari, dan tambahkan tulisan yang membuat Anda mengerti)

- [ ] Kenapa saya menggunakan Lombok?
- [ ] Kenapa controller bisa dijalankan dengan berbeda file dan di class yang berbeda?
