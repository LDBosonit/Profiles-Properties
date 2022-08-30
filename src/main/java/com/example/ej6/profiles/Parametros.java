package com.example.ej6.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Parametros {

    @Value("${server.port}")
    private String port;
    @Value("${password}")
    private String psw;
    @Value("${url}")
    private String url;

    @GetMapping("parametros")
    public String parametros(){
        return  "Este es el puerto: " + port + ", esta la contraseña: " + psw + " y esta la url: " + url;
    }
}
