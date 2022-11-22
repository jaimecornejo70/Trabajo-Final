package org.example.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "partner")
public class Partner {

    @Id
    @Column(name ="idPartner")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idPartner ;
    @Column(name ="nombrePartner")
    protected String nombrePartner;
    @Column(name ="rutPartner")
    protected String rutPartner;
    @Column(name ="direccionPartner")
    protected String direccionPartner;
    @Column(name ="telefonoPartner")
    protected String telefonoPartner;
    @Column(name ="emailPartner")
    protected String emailPartner;

    public Partner() {
    }

    public Partner(Long idPartner, String nombrePartner, String rutPartner, String direccionPartner, String telefonoPartner, String emailPartner) {
        this.idPartner = idPartner;
        this.nombrePartner = nombrePartner;
        this.rutPartner = rutPartner;
        this.direccionPartner = direccionPartner;
        this.telefonoPartner = telefonoPartner;
        this.emailPartner = emailPartner;
    }

    public Partner(String nombrePartner, String rutPartner, String direccionPartner, String telefonoPartner, String emailPartner) {
        this.nombrePartner = nombrePartner;
        this.rutPartner = rutPartner;
        this.direccionPartner = direccionPartner;
        this.telefonoPartner = telefonoPartner;
        this.emailPartner = emailPartner;
    }

    public Long getIdPartner() {
        return idPartner;
    }

    public void setIdPartner(Long idPartner) {
        this.idPartner = idPartner;
    }

    public String getNombrePartner() {
        return nombrePartner;
    }

    public void setNombrePartner(String nombrePartner) {
        this.nombrePartner = nombrePartner;
    }

    public String getRutPartner() {
        return rutPartner;
    }

    public void setRutPartner(String rutPartner) {
        this.rutPartner = rutPartner;
    }

    public String getDireccionPartner() {
        return direccionPartner;
    }

    public void setDireccionPartner(String direccionPartner) {
        this.direccionPartner = direccionPartner;
    }

    public String getTelefonoPartner() {
        return telefonoPartner;
    }

    public void setTelefonoPartner(String telefonoPartner) {
        this.telefonoPartner = telefonoPartner;
    }

    public String getEmailPartner() {
        return emailPartner;
    }

    public void setEmailPartner(String emailPartner) {
        this.emailPartner = emailPartner;
    }

    @Override
    public String toString() {
        return "Partner{" +
                "idPartner=" + idPartner +
                ", nombrePartner='" + nombrePartner + '\'' +
                ", rutPartner='" + rutPartner + '\'' +
                ", direccionPartner='" + direccionPartner + '\'' +
                ", telefonoPartner='" + telefonoPartner + '\'' +
                ", emailPartner='" + emailPartner + '\'' +
                '}';
    }
}
