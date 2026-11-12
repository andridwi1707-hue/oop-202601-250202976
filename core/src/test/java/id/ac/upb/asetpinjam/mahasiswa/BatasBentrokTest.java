package id.ac.upb.asetpinjam.mahasiswa;

import org.junit.jupiter.api.Test;
import static id.ac.upb.asetpinjam.TestSupport.pinjam;
import static org.assertj.core.api.Assertions.assertThat;
import id.ac.upb.asetpinjam.TestSupport;
import id.ac.upb.asetpinjam.config.Varian;
import id.ac.upb.asetpinjam.jadwal.JadwalPeminjaman;
import id.ac.upb.asetpinjam.model.Peminjaman;

/**
 * FOLDER INI MILIK ANDA. Tulis tes Anda sendiri di sini (minggu 7 dan seterusnya).
 *
 * <p>Tes dosen sengaja tidak menentukan: apakah peminjaman 09:00-11:00 dan 11:00-13:00 pada aset yang sama
 * bentrok? Putuskan, catat alasannya di docs/asumsi.md, lalu tuliskan tesnya di sini.
 * Hapus @Disabled setelah Anda mengisinya.
 *
 * <p>Syarat minggu 10: folder ini memuat minimal 8 tes (tidak termasuk contoh bawaan ini).
 */
class BatasBentrokTest {

    @Test
    void selesaiSamaDenganMulai() {

        JadwalPeminjaman jadwal = new JadwalPeminjaman(Varian.aktif().kuotaLaptop);

        jadwal.tambah(pinjam(
                "1",
                TestSupport.peminjam("P1"),
                TestSupport.ruang("R-1"),
                9,
                10));

        Peminjaman baru = pinjam(
                "2",
                TestSupport.peminjam("P2"),
                TestSupport.ruang("R-1"),
                10,
                11);

        assertThat(jadwal.bentrok(baru)).isFalse();
        // TODO: buat dua peminjaman pada aset yang sama, satu selesai tepat saat yang lain mulai,
        // lalu nyatakan hasil yang Anda putuskan dengan assertThat(...).
    }
}
