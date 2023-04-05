/**
 * Nama         : Wahyu Arif Maulana
 * NIM          : 24060120120018
 * File         : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak
 *                jari-jari lingkaran yang bernilai nol
 */

class Lingkaran{
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0):"Jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "+kelilingLingkaran);
    }
}

// Pertanyaan
// Secara konsep, ada yang kurang tepat pada program Asersi2 diatas?

// Jawaban
// assertion yang digunakan tidak memeriksa variabel 'jariJari' pada saat inisialisasi objek lingkaran
// kita dapat mengubah nilai variabel 'jariJari' pada program Asersi2 sebelum objek Lingkaran dibuat, 
// atau bisa juga assertion ditempatkan di dalam konstruktor Lingkaran untuk memastikan variabel jariJari 
// selalu lebih besar dari 0 saat objek Lingkaran dibuat.