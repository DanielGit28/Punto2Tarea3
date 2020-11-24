package cr.ac.ucenfotec.Tarea3.bl.entidades;

import cr.ac.ucenfotec.Tarea3.interfaces.SerializacionCSV;

import java.time.LocalDate;

public class Movimiento implements SerializacionCSV {
    private LocalDate fecha;
    private String descripcion;
    private int monto;
    private TipoMovimiento tipoMovimiento;

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

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
    public Movimiento(){}

    public Movimiento(LocalDate fecha, String descripcion, int monto, TipoMovimiento tipoMovimiento) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.monto = monto;
        this.tipoMovimiento = tipoMovimiento;
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                ", monto=" + monto +
                ", tipoMovimiento=" + tipoMovimiento +
                '}';
    }
    @Override
    public String toCSVLine() {
        return this.fecha + "," + this.descripcion + "," + this.monto + "," + this.tipoMovimiento;
    }
}
