package es.ciudadescolar.instituto;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private String nombre;
    private Integer id;
    List<Alumno> listaAlumnos;
    
    public Instituto() {
        this.listaAlumnos = new ArrayList<>();
    }

    public Instituto(String nombre, Integer id, List<Alumno> listaAlumnos) {
        this.nombre = nombre;
        this.id = id;
        this.listaAlumnos = listaAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    @Override
    public String toString() {
        return "Instituto [nombre=" + nombre + ", id=" + id + ", listaAlumnos=" + listaAlumnos + "]";
    }

}
