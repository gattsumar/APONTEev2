package AAponte.Sistema.Aponte.entity;


import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")

public class Profesor extends Persona{


    @Column(name = "Salario", length = 15 , nullable = false)
    private String Salario;

   
}
