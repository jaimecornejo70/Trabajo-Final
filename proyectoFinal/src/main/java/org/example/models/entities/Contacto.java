package org.example.models.entities;


import javax.persistence.*;

@Entity
@Table(name = "contacto")
public class Contacto {

    @Id
    @Column(name ="idContacto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idContacto;
    @Column(name ="nombreContacto")
    protected String nombreContacto;
    @Column(name ="emailContacto")
    protected String emailContacto;
    @Column(name ="telefonoContacto")
    protected String telefonoContacto;
    @Column(name ="mensajeContacto")
    protected String mensajeContacto;

    public Contacto() {
    }

    public Contacto(Long idContacto, String nombreContacto, String emailContacto, String telefonoContacto, String mensajeContacto) {
        this.idContacto = idContacto;
        this.nombreContacto = nombreContacto;
        this.emailContacto = emailContacto;
        this.telefonoContacto = telefonoContacto;
        this.mensajeContacto = mensajeContacto;
    }

    public Contacto(String nombreContacto, String emailContacto, String telefonoContacto, String mensajeContacto) {
        this.nombreContacto = nombreContacto;
        this.emailContacto = emailContacto;
        this.telefonoContacto = telefonoContacto;
        this.mensajeContacto = mensajeContacto;
    }

    public Long getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Long idContacto) {
        this.idContacto = idContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getMensajeContacto() {
        return mensajeContacto;
    }

    public void setMensajeContacto(String mensajeContacto) {
        this.mensajeContacto = mensajeContacto;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "idContacto=" + idContacto +
                ", nombreContacto='" + nombreContacto + '\'' +
                ", emailContacto='" + emailContacto + '\'' +
                ", telefonoContacto='" + telefonoContacto + '\'' +
                ", mensajeContacto='" + mensajeContacto + '\'' +
                '}';
    }
}
