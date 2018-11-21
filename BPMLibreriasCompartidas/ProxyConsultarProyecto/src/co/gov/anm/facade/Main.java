package co.gov.anm.Facade;

import co.gov.anm.model.ListaSelectBean;



import java.util.List;

public class Main {
    public Main() {
        super();
    }

    public static void main(String[] args) {
        List<ListaSelectBean> lista;
        lista = FacadeConsultarProyecto.getService().consultarProyecto();
        for (ListaSelectBean item :lista){
         System.out.print("Codigo: "+item.getCodigo()+" Descripcion: "+ item.getDescripcion());
    }
}
}
