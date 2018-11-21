package com.soaint.util.service;

public class ErrorResponse {
    private String description;
    private String errorMessageCod;
    private String rowNumber;
    private String errorType;
    private String method = "";
    private String errorDisplay = "";
    private boolean displayError = false;

    public ErrorResponse() {
        super();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setErrorMessageCod(String errorMessageCod) {
        this.errorMessageCod = errorMessageCod;
    }

    public String getErrorMessageCod() {
        return errorMessageCod;
    }

    public void setRowNumber(String rowNumber) {
        this.rowNumber = rowNumber;
    }

    public String getRowNumber() {
        return rowNumber;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setDisplayError(boolean displayError) {
        this.displayError = displayError;
    }

    public boolean isDisplayError() {
        return displayError;
    }
}
