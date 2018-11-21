package co.gov.anm.Facade;

import co.gov.anm.model.ListaSelectBean;

import com.soaint.util.service.ResponseWS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
        super();
    }

    public static void main(String[] args) {
        List<ListaSelectBean> lista = new ArrayList<ListaSelectBean>();
        ResponseWS consultarListaValores = FacadeConsultarListaValores.getService().consultarListaValores("1", lista);
        for (ListaSelectBean item :lista){
            System.out.println("Codigo: "+item.getCodigo()+" Descripcion: "+ item.getDescripcion());
        }
    }
}
