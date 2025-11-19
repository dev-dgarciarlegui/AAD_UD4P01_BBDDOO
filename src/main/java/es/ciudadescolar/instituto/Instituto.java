package es.ciudadescolar.instituto;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Instituto {

    private static Logger LOG = LoggerFactory.getLogger("Instituto.class");

    private String nombre;
    private Integer id;
    List<Alumno> listaAlumnos = null;
    
    public Instituto() {
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

    public void matricularAlumno(Alumno al) {
        if(this.listaAlumnos == null) {
            this.listaAlumnos = new ArrayList<>();            
        }
        listaAlumnos.add(al);
        LOG.info("Alumno añadido a la lista de alumnos: "+al);
    }

    public void expulsarAlumno(Alumno al) {
        if (this.listaAlumnos == null) {
            this.listaAlumnos = new ArrayList<>();
        }
        if (listaAlumnos.size() == 0) {
            LOG.warn("No se puede expulsar al alumno porque la lista está vacía: "+al);
        }
        else {
            if(listaAlumnos.contains(al)) {
                listaAlumnos.remove(al);
                LOG.info("Alumno eliminado de la lista de alumnos: "+al);
            }
            else {
                LOG.warn("El alumnos no se encuentra en la lista de alumnos: "+al);
            }
        }
    }

    public boolean cambiarIdInstituto(int nuevoId) {
        boolean status = true;

        if (nuevoId != this.id) {
            this.setId(nuevoId);
            LOG.info("Se ha cambiado el id del instituto: "+id);
        }
        else {
            LOG.warn("No se ha cambiado el id del instituto porque es igual que el id que ya tenía: "+id);
            status = false;
        }

        return status;
    }

}
