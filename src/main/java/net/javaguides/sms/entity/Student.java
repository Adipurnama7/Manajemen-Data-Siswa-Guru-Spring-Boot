package net.javaguides.sms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Student() {
    }

    public Student(String name,  String nis, String alamat, String noTelephone, String jenisKelamin, String kelas) {
        super();
        this.name = name;
        this.nis = nis;
        this.alamat = alamat;
        this.noTelephone = noTelephone;
        this.jenisKelamin = jenisKelamin;
        this.kelas = kelas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelephone() {
        return noTelephone;
    }

    public void setNoTelephone(String noTelephone) {
        this.noTelephone = noTelephone;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
