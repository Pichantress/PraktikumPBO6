/**
 * File         : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri
 *                Pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Pertanyaan
// Ketika eksepsi terjadi apakah baris 12 pada AngkaSial.java diatas dieksekusi?

// Jawaban
// Tidak, jika eksepsi terjadi pada baris 6 (angka == 13) dan exception dilemparkan dengan menggunakan perintah "throw", maka program akan langsung keluar dari metode "cobaAngka" dan baris 12 tidak akan dijalankan.

// Pertanyaan
// Apakah baris 21 pada AngkaSial.java diatas dieksekusi?

// Jawaban
// Ya, baris 21 pada AngkaSial.java akan dieksekusi ketika terjadi exception dan program melompat ke blok catch pada metode "main".