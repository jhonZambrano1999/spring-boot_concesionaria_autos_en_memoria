package com.example.springbootconcesariatymleaf.model;

import lombok.Data;

@Data
public class ClienteModel {


    private long id;
    private String nombre, apellido, telefono, direccion, edad,identificacion, ciudad_residencia;
}