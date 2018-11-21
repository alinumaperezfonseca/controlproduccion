package com.soaint.util;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;

public class IpUtil {
    public IpUtil() {
        super();
    }

    public static String getClientIpAddress() {
        String clientIpAddress =
            ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getRemoteAddr();
        return clientIpAddress;
    }
}
