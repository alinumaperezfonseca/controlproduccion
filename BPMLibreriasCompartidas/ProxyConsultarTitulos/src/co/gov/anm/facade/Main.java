package co.gov.anm.facade;

import co.gov.anm.model.ListaSelectBean;

import java.util.*;

public class Main {
    public Main() {
        super();
        
    }
    
    public static void main(String[] args) {
        List<ListaSelectBean> lista = new ArrayList<ListaSelectBean>();
        FacadeConsultarTitulos.getService().consultarTitulos("1", lista);
        for (ListaSelectBean item :lista){
            System.out.println("Codigo: "+item.getCodigo()+" Descripcion: "+ item.getDescripcion());
        }
}
}
