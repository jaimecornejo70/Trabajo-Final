package org.example.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name ="idUsuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idUsuario ;
    @Column(name ="nombreUsuario")
    protected String nombreUsuario;
    @Column(name ="apellidoUsuario")
    protected String apellidoUsuario;
    @Column(name ="cuentaUsuario")
    protected String cuentaUsuario;
    @Column(name ="claveUsuario")
    protected String claveUsuario;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombreUsuario, String apellidoUsuario, String cuentaUsuario, String claveUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.cuentaUsuario = cuentaUsuario;
        this.claveUsuario = claveUsuario;
    }

    public Usuario(String nombreUsuario, String apellidoUsuario, String cuentaUsuario, String claveUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.cuentaUsuario = cuentaUsuario;
        this.claveUsuario = claveUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCuentaUsuario() {
        return cuentaUsuario;
    }

    public void setCuentaUsuario(String cuentaUsuario) {
        this.cuentaUsuario = cuentaUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", apellidoUsuario='" + apellidoUsuario + '\'' +
                ", cuentaUsuario='" + cuentaUsuario + '\'' +
                ", claveUsuario='" + claveUsuario + '\'' +
                '}';
    }
}
