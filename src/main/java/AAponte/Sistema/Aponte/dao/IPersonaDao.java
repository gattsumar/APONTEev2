package  AAponte.Sistema.Aponte.dao;

import  AAponte.Sistema.Aponte.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IPersonaDao extends JpaRepository <Persona,Long>{

    @Query("SELECT p FROM Persona p WHERE p.dni =?1")
    Persona buscarPersona(String codigo);

    Persona findByDni(String codigo);

    @Query("SELECT p FROM Persona p WHERE p.nombre =?1 AND p.telefono = ?2")
    Persona findByNombreAndtelefono(String nombre, String telefono);

    @Query("SELECT p FROM Persona p WHERE p.nombre = :nombre AND p.telefono = :telefono")
    Persona findByNombreAndtelefonoByParam(@Param("nombre") String nombre, @Param("telefono") String telefono );
}
