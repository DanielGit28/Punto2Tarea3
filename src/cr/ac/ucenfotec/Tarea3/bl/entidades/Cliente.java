package cr.ac.ucenfotec.Tarea3.bl.entidades;

import cr.ac.ucenfotec.Tarea3.interfaces.SerializacionCSV;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente implements SerializacionCSV {
    private String nombre;
    private String id;
    private String direccion;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente(){}

    public Cliente(String nombre, String id, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
    }
    public Cliente(String sourceLines) {
        String[] datos = sourceLines.split(",");
        this.nombre = datos[0];
        this.id = datos[1];
        this.direccion = datos[2];
    }


    @Override
    public String toCSVLine() {
        return this.nombre + "," + this.id + "," + this.direccion;
    }

   
}
