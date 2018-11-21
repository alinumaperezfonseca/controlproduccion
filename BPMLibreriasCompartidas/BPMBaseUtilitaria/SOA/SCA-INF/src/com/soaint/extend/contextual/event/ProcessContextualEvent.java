package com.soaint.extend.contextual.event;

import com.soaint.util.JSFUtil;

public class ProcessContextualEvent {
    public ProcessContextualEvent() {
        super();
    }

    public void onError(Object payload, String mbPath, Object extra) {
        ProcessContextualEventInterface mb =
            (ProcessContextualEventInterface)JSFUtil.resolveExpression("#{" +
                                                                       mbPath.trim() +
                                                                       "}");
        mb.processOnError(payload, extra);
    }

    public void onCleanError(Object payload, String mbPath, Object extra) {
        ProcessContextualEventInterface mb =
            (ProcessContextualEventInterface)JSFUtil.resolveExpression("#{" +
                                                                       mbPath.trim() +
                                                                       "}");
        mb.processOnCleanError(payload, extra);
    }

    public void onChange(Object payload, String mbPath, Object extra) {
        ProcessContextualEventInterface mb =
            (ProcessContextualEventInterface)JSFUtil.resolveExpression("#{" +
                                                                       mbPath.trim() +
                                                                       "}");
        mb.processOnChange(payload, extra);
    }

    public void onSearch(Object payload, String mbPath, Object extra) {
        ProcessContextualEventInterface mb =
            (ProcessContextualEventInterface)JSFUtil.resolveExpression("#{" +
                                                                       mbPath.trim() +
                                                                       "}");
        mb.processOnSearch(payload, extra);
    }

    public void onRefresh(Object payload, String mbPath, Object extra) {
        ProcessContextualEventInterface mb =
            (ProcessContextualEventInterface)JSFUtil.resolveExpression("#{" +
                                                                       mbPath.trim() +
                                                                       "}");
        mb.processOnRefresh(payload, extra);
    }

    public void onSelect(Object payload, String mbPath, Object extra) {
        ProcessContextualEventInterface mb =
            (ProcessContextualEventInterface)JSFUtil.resolveExpression("#{" +
                                                                       mbPath.trim() +
                                                                       "}");
        mb.processOnSelect(payload, extra);
    }
}
