package cr.ac.ucenfotec.Tarea3.bl.entidades;

import cr.ac.ucenfotec.Tarea3.interfaces.SerializacionCSV;

import java.time.LocalDate;

public class Cuenta implements SerializacionCSV {
    protected int numeroCuenta;
    protected int saldo;
    protected LocalDate fechaApertura;


    public Cuenta() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Cuenta(int numeroCuenta, int saldo, LocalDate fechaApertura) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
    }
    public Cuenta(String sourceLines) {
        String[] datos = sourceLines.split(",");
        this.numeroCuenta = Integer.parseInt(datos[0]);
        this.saldo = Integer.parseInt(datos[1]);
        this.fechaApertura = LocalDate.parse(datos[2]);
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                ", fechaApertura=" + fechaApertura +
                '}';
    }
    @Override
    public String toCSVLine() {
        return this.numeroCuenta + "," + this.saldo + "," + this.fechaApertura;
    }
}
