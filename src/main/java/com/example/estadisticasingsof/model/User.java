package com.example.estadisticasingsof.model;

import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Map;

public class User {
    @Id
    private long id;
    private String correo;
    private String password;
    private String nombreApellido;
    private Map materia;
    private long tiempo;
    private List prueba;

    public User(long id, String correo, String password, String nombreApellido, Map materia, long tiempo, List prueba) {
        this.id = id;
        this.correo = correo;
        this.password = password;
        this.nombreApellido = nombreApellido;
        this.materia = materia;
        this.tiempo = tiempo;

        this.prueba = prueba;
    }
    public User(){}

    public List getPrueba() {
        return prueba;
    }

    public void setPrueba(List prueba) {
        this.prueba = prueba;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Map getMateria() {
        return materia;
    }

    public void setMateria(Map materia) {
        this.materia = materia;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }




}
