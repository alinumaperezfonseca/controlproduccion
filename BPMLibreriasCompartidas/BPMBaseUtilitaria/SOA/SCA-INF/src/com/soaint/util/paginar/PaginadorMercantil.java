package com.soaint.util.paginar;

import com.soaint.util.StringUtil;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaginadorMercantil implements Serializable {
    @SuppressWarnings("compatibility:-5965727836422588074")
    private static final long serialVersionUID = 1L;
    public static final String ATRIBUTO_NEXT = "NEXT";
    private Map<Integer, String> paginas;
    private Integer pagina;
    private Boolean nuevaPagina;
    private Boolean selecPagina;

    public PaginadorMercantil() {
        super();
        this.paginas = new HashMap<Integer, String>();
        this.clear();
    }

    public void clear() {
        this.pagina = 0;
        this.selecPagina = false;
        this.paginas.clear();
        this.paginas.put(1, "");
    }

    public Boolean getMostrarPaginador() {
        return this.paginas.size() > 1 ? true : false;
    }

    public List<Integer> getNumPaginas() {
        return new ArrayList<Integer>(this.paginas.keySet());
    }

    public void addPagina(String key, String atributo) {
        this.nuevaPagina = false;
        if (StringUtil.existe(atributo) &&
            atributo.equals(PaginadorMercantil.ATRIBUTO_NEXT) &&
            !this.selecPagina) {
            this.nuevaPagina = true;
            this.paginas.put(this.paginas.size() + 1, key);
        }

    }

    public String getInfoPaginaActual() {
        return this.paginas.get(this.pagina);
    }

    public String getInfoSiguientePagina() {
        this.pagina = this.pagina + 1;
        return this.paginas.get(this.paginas.size());
    }

    public String getInfoPagina(Integer num) {
        this.pagina = num;
        return this.paginas.get(num);
    }

    public void setPaginas(Map<Integer, String> paginas) {
        this.paginas = paginas;
    }

    public Map<Integer, String> getPaginas() {
        return paginas;
    }

    public void setNuevaPagina(Boolean nuevaPagina) {
        this.nuevaPagina = nuevaPagina;
    }

    public Boolean getNuevaPagina() {
        return nuevaPagina;
    }

    public void setPagina(Integer pagina) {
        this.pagina = pagina;
    }

    public Integer getPagina() {
        return pagina;
    }

    public void setSelecPagina(Boolean selecPagina) {
        this.selecPagina = selecPagina;
    }

    public Boolean getSelecPagina() {
        return selecPagina;
    }
}
