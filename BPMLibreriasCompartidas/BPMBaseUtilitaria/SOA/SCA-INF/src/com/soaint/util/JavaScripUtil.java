package com.soaint.util;

public class JavaScripUtil {
    public JavaScripUtil() {
        super();
    }

    public static void topScroll() {
        ADFUtil.addScript("setTimeout('window.scrollTo(0,0)',1500);");
    }
}
