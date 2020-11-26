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

    public CuentaAhorro(int numeroCuenta, double saldo, LocalDate fechaApertura,String idCliente) {
        super(numeroCuenta, saldo, fechaApertura,idCliente);
        this.tasaInteres = tasaInteres;
    }
    public CuentaAhorro(String sourceLines) {
        String[] datos = sourceLines.split(",");
        this.numeroCuenta = Integer.parseInt(datos[0]);
        this.saldo = Double.parseDouble(datos[1]);
        this.fechaApertura = LocalDate.parse(datos[2]);
        this.idCliente = datos[3];
        this.tasaInteres = Integer.parseInt(datos[4]);
    }
    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "tasaInteres=" + tasaInteres +
                ", numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                ", fechaApertura=" + fechaApertura +
                ", idCliente=" + idCliente +
                '}';
    }
    @Override
    public String toCSVLine() {
        return this.numeroCuenta + "," + this.saldo + "," + this.fechaApertura + "," + this.idCliente + "," + this.tasaInteres;
    }
}
