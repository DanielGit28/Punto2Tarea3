package cr.ac.ucenfotec.Tarea3.bl.entidades;

import com.sun.org.apache.xpath.internal.operations.String;
import cr.ac.ucenfotec.Tarea3.interfaces.SerializacionCSV;

import java.util.ArrayList;

public class Cliente implements SerializacionCSV {
    private String nombre;
    private String id;
    private String direccion;
    private ArrayList<Cuenta> cuentasCorrientes;
    private ArrayList<CuentaAhorro> cuentasAhorro;
    private ArrayList<CuentaAhorroProgramado> cuentasAhorroProgramado;

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

    public ArrayList<Cuenta> getCuentasCorrientes() {
        return cuentasCorrientes;
    }

    public void setCuentasCorrientes(ArrayList<Cuenta> cuentasCorrientes) {
        this.cuentasCorrientes = cuentasCorrientes;
    }

    public ArrayList<CuentaAhorro> getCuentasAhorro() {
        return cuentasAhorro;
    }

    public void setCuentasAhorro(ArrayList<CuentaAhorro> cuentasAhorro) {
        this.cuentasAhorro = cuentasAhorro;
    }

    public ArrayList<CuentaAhorroProgramado> getCuentasAhorroProgramado() {
        return cuentasAhorroProgramado;
    }

    public void setCuentasAhorroProgramado(ArrayList<CuentaAhorroProgramado> cuentasAhorroProgramado) {
        this.cuentasAhorroProgramado = cuentasAhorroProgramado;
    }
    public Cliente(){}

    public Cliente(String nombre, String id, String direccion, ArrayList<Cuenta> cuentasCorrientes,
                   ArrayList<CuentaAhorro> cuentasAhorro, ArrayList<CuentaAhorroProgramado> cuentasAhorroProgramado) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.cuentasCorrientes = cuentasCorrientes;
        this.cuentasAhorro = cuentasAhorro;
        this.cuentasAhorroProgramado = cuentasAhorroProgramado;
    }
    public Cliente(String sourceLines) {
        String[] datos = sourceLines.split(",");
        this.nombre = datos[0];
        this.id = datos[1];
        this.direccion = datos[2];
        this.cuentasCorrientes = cuentasCorrientes.toArray(new String[cuentasCorrientes.size()];
        this.cuentasAhorro = datos[4];
        this.cuentasAhorroProgramado = datos[5];
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cuentasCorrientes=" + cuentasCorrientes +
                ", cuentasAhorro=" + cuentasAhorro +
                ", cuentasAhorroProgramado=" + cuentasAhorroProgramado +
                '}';
    }

    @Override
    public String toCSVLine() {
        return this.nombre + "," + this.id + "," + this.direccion + "," + this.cuentasCorrientes + ","+ this.cuentasAhorro + "," + this.cuentasAhorroProgramado;
    }
}
