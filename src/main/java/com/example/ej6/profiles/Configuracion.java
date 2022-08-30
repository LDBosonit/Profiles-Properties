package com.example.ej6.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource({"classpath:miconfiguracion.properties"})
public class Configuracion {

    @Value("${valor1}")
    private String valor1;
    @Value("${valor2}")
    private String valor2;

    @GetMapping("miConfiguracion")
    public String miConfiguracion() {
        return "Este es el valor1: " + valor1 + ", este es el valor2: " + valor2;
    }

}