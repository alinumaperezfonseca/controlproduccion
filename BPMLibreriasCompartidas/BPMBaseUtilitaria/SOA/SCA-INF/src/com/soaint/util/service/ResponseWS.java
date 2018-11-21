package com.soaint.util.service;

import com.soaint.util.BundleUtil;

import java.util.ArrayList;
import java.util.List;


public class ResponseWS {
    private boolean success;
    private String errorGeneric;
    private String codeResponse;
    private String nameResponse;
    private String aux;
    private List<ErrorResponse> listErrorResponse;

    public ResponseWS() {
        super();
        this.listErrorResponse = new ArrayList<ErrorResponse>();
        this.success = true;
        this.codeResponse = "";
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setCodeResponse(String codeResponse) {
        this.codeResponse = codeResponse;
    }

    public String getCodeResponse() {
        return codeResponse;
    }

    public void setNameResponse(String nameResponse) {
        this.nameResponse = nameResponse;
    }

    public String getNameResponse() {
        return nameResponse;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }

    public String getAux() {
        return aux;
    }

    public void setListErrorResponse(List<ErrorResponse> listErrorResponse) {
        this.listErrorResponse = listErrorResponse;
    }

    public List<ErrorResponse> getListErrorResponse() {
        return listErrorResponse;
    }

    public void setErrorGeneric(String errorGeneric) {
        this.errorGeneric = errorGeneric;
    }

    public String getErrorGeneric() {
        return errorGeneric;
    }

    public void setErrorPortalGeneric() {
        getListErrorResponse().get(0).setDescription(BundleUtil.getString(BundleUtil.BUNDLE_PATH,
                                                                          "MENSAJE_ERROR_SISTEMA"));
    }
}
