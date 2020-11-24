package cr.ac.ucenfotec.Tarea3.bl.entidades;

import cr.ac.ucenfotec.Tarea3.interfaces.SerializacionCSV;

import java.time.LocalDate;

public class CuentaAhorro extends Cuenta{
    private int tasaInteres = 5;

    public int getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(int tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public CuentaAhorro() {}

    public CuentaAhorro(int numeroCuenta, int saldo, LocalDate fechaApertura, int tasaInteres) {
        super(numeroCuenta, saldo, fechaApertura);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "tasaInteres=" + tasaInteres +
                ", numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                ", fechaApertura=" + fechaApertura +
                '}';
    }
    @Override
    public String toCSVLine() {
        return this.numeroCuenta + "," + this.saldo + "," + this.fechaApertura + "," + this.tasaInteres;
    }
}
