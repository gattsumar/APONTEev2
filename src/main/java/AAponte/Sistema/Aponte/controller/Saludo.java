package AAponte.Sistema.Aponte.controller;

import  AAponte.Sistema.Aponte.Service.IPersonaService;
import  AAponte.Sistema.Aponte.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("index")
public class Saludo {
    @Autowired
    private IPersonaService personaService;

    @GetMapping("/ListaPersonas")
    public List<Persona> listaPesona(){
        return this.personaService.listaPersonas();
    }

    @GetMapping("/buscarPersonas")
    public Persona buscarPersona(@RequestParam("codigo")String codigo){
        return this.personaService.obtenerPersonaByDni(codigo);
    }




}
