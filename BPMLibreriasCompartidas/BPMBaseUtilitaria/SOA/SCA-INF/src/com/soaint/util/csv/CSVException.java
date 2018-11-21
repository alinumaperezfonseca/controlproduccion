package com.soaint.util.csv;

import com.soaint.extend.base.BPMBaseException;

public class CSVException extends BPMBaseException {
    @SuppressWarnings("compatibility:-7655500273554045611")
    private static final long serialVersionUID = 1L;

    public CSVException(String string) {
        super(string);
    }

    public CSVException() {
        super();
    }

    public CSVException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public CSVException(Throwable throwable) {
        super(throwable);
    }
}
