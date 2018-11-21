package com.soaint.extend.contextual.event;

public interface ProcessContextualEventInterface {
    public void processContextualEvent(Object payload, Object temp);

    public void processOnError(Object payload, Object temp);

    public void processOnCleanError(Object payload, Object temp);

    public void processOnSelect(Object payload, Object temp);

    public void processOnRefresh(Object payload, Object temp);

    public void processOnSearch(Object payload, Object temp);

    public void processOnChange(Object payload, Object temp);
}
