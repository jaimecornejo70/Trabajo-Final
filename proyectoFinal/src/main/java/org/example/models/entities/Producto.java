package org.example.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @Column(name ="idProducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idProducto ;
    @Column(name ="nombreProducto")
    protected String nombreProducto;
    @Column(name ="marcaProducto")
    protected String marcaProducto;
    @Column(name ="tipoProducto")
    protected String tipoProducto;
    @Column(name ="precioProducto")
    protected Integer precioProducto;
    @Column(name ="stockProducto")
    protected Integer stockProducto;

    public Producto() {
    }

    public Producto(Long idProducto, String nombreProducto, String marcaProducto, String tipoProducto, Integer precioProducto, Integer stockProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.tipoProducto = tipoProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
    }

    public Producto(String nombreProducto, String marcaProducto, String tipoProducto, Integer precioProducto, Integer stockProducto) {
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.tipoProducto = tipoProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Integer getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Integer precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Integer getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(Integer stockProducto) {
        this.stockProducto = stockProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", marcaProducto='" + marcaProducto + '\'' +
                ", tipoProducto='" + tipoProducto + '\'' +
                ", precioProducto=" + precioProducto +
                ", stockProducto=" + stockProducto +
                '}';
    }
}
