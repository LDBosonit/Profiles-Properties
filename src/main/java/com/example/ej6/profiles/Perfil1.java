package com.example.ej6.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@Component
@Profile("perfil1")
public class Perfil1 implements Perfiles{

    Perfiles p;

    @Override
    public String miFuncion() {
        return "Estas en el perfil 1";
    }
}
