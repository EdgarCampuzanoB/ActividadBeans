package com.example.springcoredojo.NTT;

import org.springframework.stereotype.Component;

@Component
public class Compania {
    private Direccion direccion;

    @Override
    public String toString() {
        return "Compania{" +
                "direccion=" + direccion +
                '}';
    }

    public Compania(Direccion direccion) {
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
