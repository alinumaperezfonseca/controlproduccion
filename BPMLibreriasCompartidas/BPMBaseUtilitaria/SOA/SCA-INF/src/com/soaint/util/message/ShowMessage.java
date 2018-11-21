package com.soaint.util.message;

import com.soaint.util.BundleUtil;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShowMessage implements Serializable {
    @SuppressWarnings("compatibility:7493953345104851095")
    private static final long serialVersionUID = 1L;
    private Boolean isError;
    private Boolean showMessage;
    private List<String> listMessage;

    public ShowMessage() {
        super();
        this.listMessage = new ArrayList<String>();
        this.isError = true;
        this.showMessage = false;
    }

    public void addMessage(String msj) {
        this.listMessage.add(msj);
        this.showMessage = true;
    }

    public void addMessage(String varBundle, String key) {
        this.listMessage.add(BundleUtil.getString(varBundle, key));
        this.showMessage = true;
    }

    public void addParameterMessage(String varBundle, String key) {
        this.listMessage.add(BundleUtil.getString(varBundle, key));
        this.showMessage = true;
    }

    public void exito() {
        this.isError = false;
    }

    public void clear() {
        this.listMessage.clear();
        this.isError = true;
        this.showMessage = false;
    }

    public String getShow() {
        String msj = "";
        Iterator<String> it = this.listMessage.iterator();
        while (it.hasNext()) {
            String ms = it.next();
            msj += "<B>* </B>" + ms + "<br>";
        }
        return msj;
    }

    public Boolean isVisible() {
        return showMessage;
    }

    public Boolean getShowMessage() {
        return showMessage;
    }

    public void setShowMessage(Boolean showMessage) {
        this.showMessage = showMessage;
    }

    public void setIsError(Boolean isError) {
        this.isError = isError;
    }

    public Boolean getIsError() {
        return isError;
    }
}
