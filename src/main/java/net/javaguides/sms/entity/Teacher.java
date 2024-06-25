package net.javaguides.sms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "nip", unique = true, nullable = false)
    private String nip;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "no_telephone")
    private String noTelephone;

    public Teacher() {
    }

    public Teacher(String name, String email, String nip, String alamat, String noTelephone) {
        super();
        this.name = name;
        this.email = email;
        this.nip = nip;
        this.alamat = alamat;
        this.noTelephone = noTelephone;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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

  

   
}
