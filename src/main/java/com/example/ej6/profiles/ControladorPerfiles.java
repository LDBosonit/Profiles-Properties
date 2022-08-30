package com.example.ej6.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorPerfiles {

    //Esta parte es de los perfiles para sacarlos por Postman
    @Autowired
    Perfiles perfiles;

    @GetMapping("perfil")
    public String getPerfil() {

        return perfiles.miFuncion();
    }
}
