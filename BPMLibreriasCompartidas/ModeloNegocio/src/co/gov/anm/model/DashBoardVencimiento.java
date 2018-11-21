package co.gov.anm.model;

import java.io.Serializable;

import java.math.BigInteger;

public class DashBoardVencimiento implements Serializable {
    @SuppressWarnings("compatibility:1198490066296230459")
    private static final long serialVersionUID = 2L;

    private String titulo;
    private String fechaVencimiento;
    private BigInteger diasRestantes;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setDiasRestantes(BigInteger diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    public BigInteger getDiasRestantes() {
        return diasRestantes;
    }

}
