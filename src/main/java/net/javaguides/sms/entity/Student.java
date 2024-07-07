package net.javaguides.sms.entity;

import jakarta.persistence.*;

// Menandakan bahwa kelas ini adalah entitas JPA
@Entity
// Mengatur nama tabel dalam database yang akan di-mapping ke entitas ini
@Table(name = "students")
public class Student {

    // Menandakan bahwa ini adalah primary key
    @Id
    // Mengatur strategi untuk pembuatan nilai ID secara otomatis
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Mengatur kolom 'name' yang tidak boleh null
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "nis", unique = true, nullable = false)
    private String nis;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "no_telephone")
    private String noTelephone;

    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    
    @Column(name = "kelas")
    private String kelas;

    // Konstruktor default
    public Student() {
    }

    // Konstruktor dengan parameter untuk inisialisasi atribut
    public Student(String name, String nis, String alamat, String noTelephone, String jenisKelamin, String kelas) {
        super();
        this.name = name;
        this.nis = nis;
        this.alamat = alamat;
        this.noTelephone = noTelephone;
        this.jenisKelamin = jenisKelamin;
        this.kelas = kelas;
    }

    // Getter dan Setter untuk atribut 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter dan Setter untuk atribut 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan Setter untuk atribut 'nis'
    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    // Getter dan Setter untuk atribut 'alamat'
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter dan Setter untuk atribut 'noTelephone'
    public String getNoTelephone() {
        return noTelephone;
    }

    public void setNoTelephone(String noTelephone) {
        this.noTelephone = noTelephone;
    }

    // Getter dan Setter untuk atribut 'jenisKelamin'
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    // Getter dan Setter untuk atribut 'kelas'
    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
