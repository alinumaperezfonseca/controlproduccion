package co.gov.anm.view;

import co.gov.anm.facade.VencimientosFacade;
import co.gov.anm.model.DashBoardVencimiento;

import com.soaint.util.JSFUtil;
import com.soaint.util.service.ResponseWS;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;


public class MbFragVencimientosDB implements Serializable {
    @SuppressWarnings("compatibility")
    private static final long serialVersionUID = 1L;

    private DashBoardVencimiento fragVencimientosDB;
    private List<DashBoardVencimiento> listaVencimiento = new ArrayList<DashBoardVencimiento>();

    public MbFragVencimientosDB() {
        super();
        this.fragVencimientosDB = (DashBoardVencimiento) JSFUtil.resolveExpression("#{pageFlowScope.FragVencimientos}");
        consultarVencimientos(fragVencimientosDB.getTitulo());
    }

    private void consultarVencimientos(String titulo) {
        ResponseWS responseWS = VencimientosFacade.consultarListaValores(titulo, this.listaVencimiento);

    }


    public void setFragVencimientosDB(DashBoardVencimiento fragVencimientosDB) {
        this.fragVencimientosDB = fragVencimientosDB;
    }

    public DashBoardVencimiento getFragVencimientosDB() {
        return fragVencimientosDB;
    }

    public void setListaVencimiento(List<DashBoardVencimiento> listaVencimiento) {
        this.listaVencimiento = listaVencimiento;
    }

    public List<DashBoardVencimiento> getListaVencimiento() {
        return listaVencimiento;
    }
}
