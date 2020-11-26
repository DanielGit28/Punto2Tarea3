package cr.ac.ucenfotec.Tarea3.bl.entidades;

import cr.ac.ucenfotec.Tarea3.interfaces.SerializacionCSV;

import java.time.LocalDate;

public class Movimiento implements SerializacionCSV {
    private LocalDate fecha;
    private String descripcion;
    private double monto;
    private TipoMovimiento tipoMovimiento;
    private int numeroCuenta;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Movimiento(){}

    public Movimiento(LocalDate fecha, String descripcion, double monto, TipoMovimiento tipoMovimiento, int numeroCuenta) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.monto = monto;
        this.tipoMovimiento = tipoMovimiento;
        this.numeroCuenta = numeroCuenta;
    }
    public Movimiento(String sourceLines) {
        String[] datos = sourceLines.split(",");
        this.fecha = LocalDate.parse(datos[0]);
        this.descripcion = datos[1];
        this.monto = Integer.parseInt(datos[2]);
        this.tipoMovimiento = TipoMovimiento.valueOf(datos[3]);
        this.numeroCuenta = Integer.parseInt(datos[4]);
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                ", monto=" + monto +
                ", tipoMovimiento=" + tipoMovimiento +
                ", numeroCuenta=" + numeroCuenta +
                '}';
    }
    @Override
    public String toCSVLine() {
        return this.fecha + "," + this.descripcion + "," + this.monto + "," + this.tipoMovimiento + "," + this.numeroCuenta;
    }


}
