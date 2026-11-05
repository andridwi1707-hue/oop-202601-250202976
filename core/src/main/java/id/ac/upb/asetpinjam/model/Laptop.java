package id.ac.upb.asetpinjam.model;

import id.ac.upb.asetpinjam.config.Varian;

/** Minggu 3: aset berupa laptop. Spesifikasi dan nomor inventaris tidak boleh kosong. */
public class Laptop extends Aset {
    private String spesifikasi;
    private String nomorInventaris;

    // TODO minggu 3: field spesifikasi dan nomorInventaris.

    public Laptop(String kode, String nama, String spesifikasi, String nomorInventaris) {
        super(kode, nama);
        if (spesifikasi == null || spesifikasi.isBlank())
            throw new IllegalArgumentException("Spesifikasi tidak boleh kosong");
        if (nomorInventaris == null || nomorInventaris.isBlank()) {
            throw new IllegalArgumentException("Nomor inventaris tidak boleh kosong");
    }
        this.spesifikasi = spesifikasi;
        this.nomorInventaris = nomorInventaris;
}

    public String getSpesifikasi() {
        return spesifikasi;
    }
    public String getNomorInventaris() {
        return nomorInventaris;
    }
    @Override 
    public JenisAset getJenis(){
        return JenisAset.LAPTOP;
    }
    @Override
public long hitungDenda(int hariTerlambat) {
    if (hariTerlambat < 0) {
        throw new IllegalArgumentException("Hari tidak boleh negatif");
    }

    if (hariTerlambat == 0) {
        return 0;
    }

    return hariTerlambat * 2 * Varian.aktif().dendaPerHari;
}
}
    // TODO minggu 3: override getJenis(). Minggu 4: override hitungDenda(int).

