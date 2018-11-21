package com.soaint.util;

import java.io.Serializable;

public class MessagesUtils implements Serializable {

    @SuppressWarnings("compatibility:6389971725418397105")
    private static final long serialVersionUID = 1L;
    private Boolean display;
    private String message;

    public MessagesUtils() {
        super();
    }

    public void clearMessages() {
        setDisplay(false);
        setMessage("");
    }

    public void addMessages(String newMessage) {
        setDisplay(true);
        if (!getMessage().contains(newMessage)) {
            setMessage(getMessage() + newMessage + ".~");
        }
    }

    public void addMessagesMandatoryFromBundle(String bundlePath,
                                               String bundle,
                                               String bundleValidation) {
        setDisplay(true);
        if (!getMessage().contains(JSFUtil.getStringFromBundle(bundlePath,
                                                               bundle))) {
            setMessage(getMessage() + "<b>" +
                       JSFUtil.getStringFromBundle(bundlePath, bundle) +
                       "</b> " +
                       JSFUtil.getStringFromBundle(bundlePath, bundleValidation) +
                       ".~");
        }
    }

    public void addMessagesMandatoryFromBundle(String bundlePath,
                                               String bundleFrag,
                                               String bundle,
                                               String bundleValidation) {
        setDisplay(true);
        if (!getMessage().contains(JSFUtil.getStringFromBundle(bundlePath,
                                                               bundle))) {
            setMessage(getMessage() + "<b>(" +
                       JSFUtil.getStringFromBundle(bundlePath, bundleFrag) +
                       ")</b> " + "<b>" +
                       JSFUtil.getStringFromBundle(bundlePath, bundle) +
                       "</b> " +
                       JSFUtil.getStringFromBundle(bundlePath, bundleValidation) +
                       ".~");
        }
    }

    public void addMessagesFromBundle(String bundlePath, String bundleFrag,
                                      String bundle) {
        setDisplay(true);
        if (!getMessage().contains(JSFUtil.getStringFromBundle(bundlePath,
                                                               bundle))) {
            setMessage(getMessage() + "<b>(" +
                       JSFUtil.getStringFromBundle(bundlePath, bundleFrag) +
                       ")</b> " + "<b>" +
                       JSFUtil.getStringFromBundle(bundlePath, bundle) +
                       "</b>.~");
        }
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
