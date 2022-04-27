package  AAponte.Sistema.Aponte.Service.Impl;

import  AAponte.Sistema.Aponte.Service.IPersonaService;
import  AAponte.Sistema.Aponte.dao.IPersonaDao;
import  AAponte.Sistema.Aponte.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listaPersonas() {

       List<Persona> personasList = this.personaDao.findAll();
       for (Persona persona: personasList){
           System.out.println(persona.toString());
       }
        return personasList;
    }

    @Override
    public Persona obtenerPersonaByDni(String codigo) {
        return this.personaDao.buscarPersona(codigo);
    }

}
