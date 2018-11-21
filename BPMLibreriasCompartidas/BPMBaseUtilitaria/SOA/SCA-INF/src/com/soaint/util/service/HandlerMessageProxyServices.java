package com.soaint.util.service;

import com.soaint.extend.base.Base;

import java.io.StringWriter;

import java.util.Set;

import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;

import oracle.xml.parser.v2.XMLDocument;

import org.w3c.dom.Element;


public class HandlerMessageProxyServices extends Base implements SOAPHandler<SOAPMessageContext> {
    public HandlerMessageProxyServices() {
        super();
    }

    public boolean handleMessage(SOAPMessageContext context) {
        try {
            if (HandlerMessageProxyServices.getLoad().getConf().getLog().getLogPayload()) {
                if (Boolean.TRUE.equals(context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY))) {
                    log("########################################################    SOLICITUD    ########################################################");
                    try {
                        log(prettyXml(context.getMessage()));
                    } catch (Exception e) {
                        log(e);
                    }
                    log("########################################################   FIN SOLICITUD    ########################################################");
                } else {
                    log("########################################################    RESPUESTA    ########################################################");
                    try {
                        log(prettyXml(context.getMessage()));
                    } catch (Exception e) {
                        log(e);
                    }
                    log("########################################################   FIN RESPUESTA    ########################################################");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        //Log("ManejadorAuditoriaServicios : handleFault()......");
        return true;
    }

    @Override
    public void close(MessageContext context) {
    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    private String prettyXml(final SOAPMessage msg) {
        if (msg == null) {
            return null;
        }
        try {
            final StringWriter sw = new StringWriter();
            final Element msgDocElem = msg.getSOAPPart().getDocumentElement();
            final XMLDocument xdoc = new XMLDocument();
            xdoc.appendChild(xdoc.importNode(msgDocElem, true));
            xdoc.print(sw);
            return sw.toString();
        } catch (Exception e) {
            log(e);
            return "error XML: " + e.getMessage();
        }
    }
}
