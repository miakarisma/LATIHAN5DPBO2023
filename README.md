# LATIHAN5DPBO2023
## Janji
Saya Mia Karisma Haq NIM [2102165] mengerjakan soal Latihan Praktikum-5 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
## Deskripsi Program
Membuat file jar untuk CRUD form Daftar Mahasiswa dengan menambahkan fitur konfirmasi sebelum penghapusan data, memperbaharui tampilan tabel setelah dilakukan ubah dan hapus data, dan reset form.
## Desain Program
Program terdiri dari 2 kelas, yaitu kelas Menu dan kelas Mahasiswa.
1. Kelas Mahasiswa merupakan kelas yang berdiri sendiri, karena tidak memiliki kesamaan dengan kelas Menu. Atribut pada kelas Mahasiswa terdiri dari atribut nim, nama, nilai, dan gender. Atribut pada kelas Mahasiswa memiliki hak akses private bertujuan agar atribut tersebut tidak bisa diakses dari luar class. Pada kelas Mahasiswa terdapat method setter dan getter untuk setiap atribut pada kelas tersebut. Hak akses untuk setiap method adalah public, supaya semua method dapat diakses diluar kelas.
2. Kelas Menu merupakan kelas yang berdiri sendiri, kelas ini digunakan untuk mengelola data tabel beserta tampilan GUI. Terdiri dari banyak method, diantaranya method untuk menambah data, mengubah, menghapus, dan menampilkan data.
## Desain GUI
![Screenshot 1](https://user-images.githubusercontent.com/100817609/226653025-1b396182-9513-4ed0-9ef3-4c5f086a4930.png)
## Penjelasan Alur
Pertama akan ditampilkan data awal tabel daftar mahasiswa, beserta formulir diri yang dapat diisi oleh user. Jika user tidak mengisi data secara lengkap maka akan ditampilkan pesan pemberitahuan bahwa data gagal ditambahkan. Sebaliknya jika semua kolom diisi secara lengkap maka data akan berhasil ditambahkan. User juga dapat menekan salah satu data dari data daftar mahasiswa, kemudian akan terdapat pilihan untuk mengubah, menghapus atau membatalkan pemilihan data tersebut. Apabila user menekan tombol "Update" dan mengisi semua data yang ingin diubah secara lengkap maka data mahasiswa tersebut akan diubah. Apabila user menekan tombol "Delete" akan ditampilkan pesan konfirmasi penghapusan data, jika user tetap meneruskan pilihannya untuk menghapus data, maka data akan dihapus, sebaliknya jika user membatalkan penghapusan data maka data akan tetap berada pada daftar mahasiswa. Apabila user menekan tombol "Cancel" maka data yang telah diisikan pada setiap kolom akan direset menjadi kosong.
## Dokumentasi
- Default Data<br>
  ![Screenshot 1](https://user-images.githubusercontent.com/100817609/226653025-1b396182-9513-4ed0-9ef3-4c5f086a4930.png)<br>
- Add Data<br>
  ![Screenshot 2](https://user-images.githubusercontent.com/100817609/226653061-44f02e7b-990e-4ee6-a59c-08e76ad1bfda.png)
  ![Screenshot 3](https://user-images.githubusercontent.com/100817609/226653076-11294ee3-9a24-4feb-b822-65f338a80fbf.png)<br>
- Update Data<br>
  ![Screenshot 4](https://user-images.githubusercontent.com/100817609/226653095-251fee77-bfb7-4634-b668-ccc643fe22ce.png)
  ![Screenshot 5](https://user-images.githubusercontent.com/100817609/226653114-ba9cc5b2-c2b2-4724-989b-35de3a3040c8.png)<br>
- Delete Data<br>
  ![Screenshot 6](https://user-images.githubusercontent.com/100817609/226653122-34a224cb-963a-4c2a-98f3-8dafeb8da847.png)
  ![Screenshot 7](https://user-images.githubusercontent.com/100817609/226653140-c2175ed5-41e1-4998-a400-047e851a3727.png)
