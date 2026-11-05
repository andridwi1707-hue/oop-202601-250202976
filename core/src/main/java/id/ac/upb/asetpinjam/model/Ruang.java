package id.ac.upb.asetpinjam.model;

import id.ac.upb.asetpinjam.config.Varian;

/** Minggu 3: aset berupa ruang. Kapasitas harus lebih dari 0 (IllegalArgumentException). */
public class Ruang extends Aset {

    // TODO minggu 3: field kapasitas.
    private int kapasitas; 

    public Ruang(String kode, String nama, int kapasitas) {
        super(kode, nama);
           if(kapasitas <= 0){
        throw new IllegalArgumentException();
    }
     this.kapasitas = kapasitas; 
}
    public int getKapasitas() {
       return kapasitas; 
    }
    @Override 
    public JenisAset getJenis(){
        return JenisAset.RUANG;
    }
    @Override
public long hitungDenda(int hariTerlambat) {
    if (hariTerlambat < 0) {
        throw new IllegalArgumentException("Hari tidak boleh negatif");
    }

    if (hariTerlambat == 0) {
        return 0;
    }

    return hariTerlambat * Varian.aktif().dendaPerHari;
}
    // TODO minggu 3: override getJenis(). Minggu 4: override hitungDenda(int).
}
