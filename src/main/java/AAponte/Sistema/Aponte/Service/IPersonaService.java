package  AAponte.Sistema.Aponte.Service;

import AAponte.Sistema.Aponte.entity.Persona;


import java.util.List;
public interface IPersonaService {
    //Listar personas

    List<Persona> listaPersonas();

    //BUscar personas
    Persona obtenerPersonaByDni(String codigo);
}
