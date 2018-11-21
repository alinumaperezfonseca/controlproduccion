package co.gov.anm.model;

import java.io.Serializable;

public class ListaSelectBean implements Serializable {
    @SuppressWarnings("compatibility:8752035043836088116")
    private static final long serialVersionUID = 1L;

    private String codigo;
    private String descripcion;
    
    public ListaSelectBean(String codigo,String descripcion){
        super();
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ListaSelectBean() {
        super();
    }
    
}
