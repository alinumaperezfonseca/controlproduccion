package com.soaint.extend.base;

public class BPMBaseException extends Exception {
    @SuppressWarnings("compatibility:5518100693623549200")
    private static final long serialVersionUID = 1L;

    public BPMBaseException(final Throwable throwable) {
        super(throwable);
    }

    public BPMBaseException(final String string, final Throwable throwable) {
        super(string, throwable);
    }

    public BPMBaseException() {
        this.logException();
    }

    public BPMBaseException(final String string) {
        super(string);
        this.logException();
    }

    protected void logException() {
        System.out.println("Exception: causa-> " + this.getCause() +
                           " mensaje -> " + this.getMessage() + " clase-> " +
                           this.getClass().getName());
        this.getStackTrace()[2].getLineNumber();
    }

}
