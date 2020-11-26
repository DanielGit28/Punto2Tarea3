package cr.ac.ucenfotec.Tarea3.bl.entidades;

import java.time.LocalDate;

public class CuentaAhorroProgramado extends Cuenta{
    private int cuentaCorrienteAsociada;

    public int getCuentaCorrienteAsociada() {
        return cuentaCorrienteAsociada;
    }

    public void setCuentaCorrienteAsociada(int cuentaCorrienteAsociada) {
        this.cuentaCorrienteAsociada = cuentaCorrienteAsociada;
    }

    public CuentaAhorroProgramado(){}

    public CuentaAhorroProgramado(int numeroCuenta, double saldo, LocalDate fechaApertura,String idCliente,int cuentaCorrienteAsociada) {
        super(numeroCuenta,saldo,fechaApertura,idCliente);
        this.cuentaCorrienteAsociada = cuentaCorrienteAsociada;
    }
    public CuentaAhorroProgramado(String sourceLines) {
        String[] datos = sourceLines.split(",");
        this.numeroCuenta = Integer.parseInt(datos[0]);
        this.saldo = Integer.parseInt(datos[1]);
        this.fechaApertura = LocalDate.parse(datos[2]);
        this.idCliente = datos[3];
        this.cuentaCorrienteAsociada = Integer.parseInt(datos[4]);
    }

    @Override
    public String toString() {
        return "CuentaAhorroProgramado{" +
                "cuentaCorrienteAsociada=" + getCuentaCorrienteAsociada() +
                ", numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                ", fechaApertura=" + fechaApertura +
                ", idCliente=" + idCliente +
                '}';
    }
    @Override
    public String toCSVLine() {
        return this.numeroCuenta + "," + this.saldo + "," + this.fechaApertura + "," + this.idCliente + "," + this.cuentaCorrienteAsociada;
    }


}
