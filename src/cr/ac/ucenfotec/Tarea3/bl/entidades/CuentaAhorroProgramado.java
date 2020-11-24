package cr.ac.ucenfotec.Tarea3.bl.entidades;

import java.time.LocalDate;

public class CuentaAhorroProgramado extends Cuenta{
    private Cuenta cuentaCorrienteAsociada;

    public Cuenta getCuentaCorrienteAsociada() {
        return cuentaCorrienteAsociada;
    }

    public void setCuentaCorrienteAsociada(Cuenta cuentaCorrienteAsociada) {
        this.cuentaCorrienteAsociada = cuentaCorrienteAsociada;
    }

    public CuentaAhorroProgramado(){}

    public CuentaAhorroProgramado(int numeroCuenta, int saldo, LocalDate fechaApertura,Cuenta cuentaCorrienteAsociada) {
        super(numeroCuenta,saldo,fechaApertura);
        this.cuentaCorrienteAsociada = cuentaCorrienteAsociada;
    }

    @Override
    public String toString() {
        return "CuentaAhorroProgramado{" +
                "cuentaCorrienteAsociada=" + cuentaCorrienteAsociada +
                ", numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                ", fechaApertura=" + fechaApertura +
                '}';
    }
    @Override
    public String toCSVLine() {
        return this.numeroCuenta + "," + this.saldo + "," + this.fechaApertura + "," + this.cuentaCorrienteAsociada;
    }
}
