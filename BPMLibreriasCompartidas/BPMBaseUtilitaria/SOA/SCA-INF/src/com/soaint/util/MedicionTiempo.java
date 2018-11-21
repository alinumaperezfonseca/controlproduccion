package com.soaint.util;

import java.util.concurrent.TimeUnit;

public class MedicionTiempo {
    private Long timeStart;
    private Long timeStop;

    public MedicionTiempo() {
        super();
    }

    public void star() {
        this.timeStart = System.currentTimeMillis();
    }

    public void stop() {
        this.timeStop = System.currentTimeMillis();
    }

    public Long getTime(Long time) {
        return ((timeStop - timeStart) + time);
    }

    public Long getTime() {
        return (timeStop - timeStart);
    }

    public Long getMinutes() {
        return TimeUnit.MILLISECONDS.toMinutes(timeStop - timeStart);
    }

    public Long getSeconds() {
        return TimeUnit.MILLISECONDS.toSeconds(timeStop - timeStart);
    }
}
