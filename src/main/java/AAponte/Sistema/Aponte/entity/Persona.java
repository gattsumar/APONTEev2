package  AAponte.Sistema.Aponte.entity;

import javax.persistence.*;


@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)

public class Persona extends Direccion{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private Long idpersona;


    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "telefono", length = 100, nullable = false)
    private String telefono;

    @Column(name = "email", length = 10, nullable = false)
    private String email;

    @Override
    public String toString() {
        return "Persona{" +
                "idpersona=" + idpersona +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Persona() {
    }

    public Persona(Long idpersona, String nombre, String telefono, String email) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

}
