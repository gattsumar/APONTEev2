package  AAponte.Sistema.Aponte.entity;

import javax.persistence.*;


@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)

public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDireccion")
    private Long idDireccion;

    @Column(name = "calle", length = 50, nullable = false)
    private String calle;

    @Column(name = "ciudad", length = 100, nullable = false)
    private String ciudad;

    @Column(name = "estado", length = 10, nullable = false)
    private String estado;

    @Column(name = "codigoPostal", length = 50, nullable = false)
    private String codigoPostal;

    @Column(name = "pais", length = 100, nullable = false)
    private String pais;

    public Direccion() {
    }

    public Direccion(Long idDireccion, String calle, String ciudad, String estado, String codigoPostal, String pais) {
        this.idDireccion = idDireccion;
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public Long getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}