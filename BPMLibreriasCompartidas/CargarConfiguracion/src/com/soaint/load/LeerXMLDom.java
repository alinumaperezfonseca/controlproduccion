package com.soaint.load;

import com.soaint.conf.Configuracion;

import com.soaint.conf.ConfiguracionConstantes;

import java.io.File;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.ParserConfigurationException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

public class LeerXMLDom {
    public LeerXMLDom() {
        super();
    }

    public ConfiguracionConstantes cargarConfiguracionContante(File fila) {
        ConfiguracionConstantes conf = null;
        try {
            conf = new ConfiguracionConstantes();
            DocumentBuilderFactory dbFactory =
                DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(fila);
            doc.getDocumentElement().normalize();

            /**
                 * Se obtiene la configuracion el tag servicios
                 * */

            NodeList nodes = doc.getElementsByTagName("servicios");
            Node node = nodes.item(0);
            Element element = (Element)node;

            conf.getServicio().setCodErrorServicio(this.getValue("cod-error",
                                                                 element));
            conf.getServicio().setCodRespuestaExitosa(this.getValue("cod-exito",
                                                                    element));
            conf.getServicio().setDescripcionCodSoaFault(this.getValue("descripcion-soap-fault",
                                                                       element));
            conf.getServicio().setDescripcionCodigoExcepcion(this.getValue("descripcion-cod-excepction",
                                                                           element));
            conf.getServicio().setParametroMensajeMandatorio(this.getValue("parametro-mensaje-mandatorio",
                                                                           element));
            conf.getServicio().setCodRespuestaPaginado(this.getValue("cod-paginado",
                                                                     element));
            conf.getServicio().setCodRespuestaNoRegistros(this.getValue("cod-no-registros",
                                                                        element));
            conf.getServicio().setCodRespuestaNoRegistrosAdabas(this.getValue("cod-no-registros-adabas",
                                                                              element));
            //Mart�n Gutierrez 29/11/2016
            conf.getServicio().setCodPersonaNoRegistrada(this.getValue("cod-persona-no-registrada",
                                                                       element));
            conf.getServicio().setCodPersonaSinCuenta(this.getValue("cod-persona-sin-cuenta",
                                                                    element));
            conf.getServicio().setCodClienteNoCumpleEstandares(this.getValue("cod-cliente-no-cumple-estandares",
                                                                             element));
            conf.getServicio().setCodRespuestaBodyVacio(this.getValue("cod-respuesta-body-vacio",
                                                                      element));
            /**
                 * Se obtiene la configuracion el tag servicios
                 * */

            nodes = doc.getElementsByTagName("codigos-util");
            node = nodes.item(0);
            element = (Element)node;

            conf.getCodigos().setCodAccionista(this.getValue("cod-accionista",
                                                             element));
            conf.getCodigos().setCodJuntaDirectiva(this.getValue("cod-junta-directiva",
                                                                 element));
            conf.getCodigos().setCodPaisVenezuela(this.getValue("codigo-pais-venezuela",
                                                                element));
            conf.getCodigos().setCodRepresentanteLegal(this.getValue("cod-representante-legal",
                                                                     element));
            conf.getCodigos().setIndicadorDatos(this.getValue("indicador-datos",
                                                              element));
            conf.getCodigos().setCodigoProducto(this.getValue("codigo-producto",
                                                              element));
            conf.getCodigos().setIndicadorSeleccion(this.getValue("indicador-seleccion",
                                                                  element));
            conf.getCodigos().setCodigoIndicadorVacio(this.getValue("codigo-indicador-vacio",
                                                                    element));
            //Mart�n Gutierrez 29/11/2016
            conf.getCodigos().setCodigoCondicionActiva(this.getValue("codigo-condicion-activa",
                                                                     element));
            conf.getCodigos().setCodigoCondicionInactiva(this.getValue("codigo-condicion-inactiva",
                                                                       element));
            conf.getCodigos().setCodigoTipoJuridico(this.getValue("codigo-tipo-juridico",
                                                                  element));
            conf.getCodigos().setCodigoTipoNaturalVenezolano(this.getValue("codigo-tipo-natural-venezolano",
                                                                           element));
            conf.getCodigos().setCodigoTipoPersonaFisica(this.getValue("codigo-tipo-persona-fisica",
                                                                       element));
            conf.getCodigos().setTipoBusquedaFiador(this.getValue("tipo-busqueda-fiador",
                                                                  element));
            conf.getCodigos().setTipoBusquedaPersona(this.getValue("tipo-busqueda-persona",
                                                                   element));
            conf.getCodigos().setTipoBusquedaSolicitante(this.getValue("tipo-busqueda-solicitante",
                                                                       element));
            conf.getCodigos().setEstatusPendiente(this.getValue("estatus-pendiente",
                                                                element));
            //SAUL VALECILLOS 17-02-2017
            conf.getCodigos().setCodigoFiador(this.getValue("codigo-fiador",
                                                            element));
            conf.getCodigos().setCodigoTipoRelacionSolicitanteFiador(this.getValue("codigo-tipo-relacion-solicitante-fiador",
                                                                                   element));
            conf.getCodigos().setCodigoTipoRelacionRepresentante(this.getValue("codigo-tipo-relacion-representante",
                                                                               element));
            conf.getCodigos().setCodigoTipoRelacionAccionista(this.getValue("codigo-tipo-relacion-accionista",
                                                                            element));
            conf.getCodigos().setCodigoTipoRelacionJuntaDirectiva(this.getValue("codigo-tipo-relacion-junta-directiva",
                                                                                element));
            conf.getCodigos().setCodigoTipoRelacionGrupo(this.getValue("codigo-tipo-relacion-grupo",
                                                                       element));
            conf.getCodigos().setCodigoTipoRelacionMegagrupo(this.getValue("codigo-tipo-relacion-megagrupo",
                                                                           element));
            conf.getCodigos().setCodigoCastigo(this.getValue("codigo-castigo",
                                                             element));
            conf.getCodigos().setCodigoLitigio(this.getValue("codigo-litigio",
                                                             element));
            conf.getCodigos().setCodigoVinculacion(this.getValue("codigo-vinculacion",
                                                                 element));
            conf.getCodigos().setCodigoCasoEspecial(this.getValue("codigo-caso-especial",
                                                                  element));
            conf.getCodigos().setCodigoLegitimacionCapital(this.getValue("codigo-legitimacion-capital",
                                                                         element));
            conf.getCodigos().setListaLegal(this.getValue("lista-legal",
                                                          element));
            conf.getCodigos().setListaAccionista(this.getValue("lista-accionista",
                                                               element));
            conf.getCodigos().setListaAccionista(this.getValue("lista-directivo",
                                                               element));
            conf.getCodigos().setCodigoPantallaPreliminar(this.getValue("codigo-pantalla-preliminar",
                                                                        element));
            conf.getCodigos().setCodigoPantallaVerificacion(this.getValue("codigo-pantalla-verificacion",
                                                                          element));
            conf.getCodigos().setCodigoPantallaSolicitud(this.getValue("codigo-pantalla-solicitud",
                                                                       element));
            conf.getCodigos().setCodigoPantallaGarantia(this.getValue("codigo-pantalla-garantia",
                                                                      element));
            conf.getCodigos().setCodigoPantallaDetalleGarantia(this.getValue("codigo-pantalla-detalle-garantia",
                                                                             element));
            conf.getCodigos().setCodigoPantallaDetalleBien(this.getValue("codigo-pantalla-detalle-bien",
                                                                         element));
            conf.getCodigos().setCodigoPantallaAnalisis(this.getValue("codigo-pantalla-analisis",
                                                                      element)); 
            conf.getCodigos().setCodigoDocumentoVencido(this.getValue("codigo-documento-vencido",
                                                                      element));
            conf.getCodigos().setCodigoPantallaFormalizacion(this.getValue("codigo-pantalla-formalizacion",
                                                                      element)); 
            
            
            
            
            conf.getCodigos().setProcesopreliminar(this.getValue("proceso-preliminar",
                                                                 element));
            conf.getCodigos().setProcesoverificacioninformacion(this.getValue("proceso-verificacion-informacion",
                                                                              element));
            conf.getCodigos().setProcesovaciadoproyeccion(this.getValue("proceso-vaciado-proyeccion",
                                                                        element));
            conf.getCodigos().setProcesosolicitudpreanalisis(this.getValue("proceso-solicitud-preanalisis",
                                                                           element));
            conf.getCodigos().setProcesogarantia(this.getValue("proceso-garantia",
                                                               element));
            conf.getCodigos().setProcesoanalisis(this.getValue("proceso-analisis",
                                                               element));
            conf.getCodigos().setProcesoaprobacion(this.getValue("proceso-aprobacion",
                                                                 element));
            conf.getCodigos().setProcesoformalizacion(this.getValue("proceso-formalizacion",
                                                                    element));
            conf.getCodigos().setPreliminar(this.getValue("preliminar",
                                                          element));
            conf.getCodigos().setAnalisis(this.getValue("analisis",
                                                          element));
            conf.getCodigos().setResumenFinanciero(this.getValue("resumen-financiero", element));
            conf.getCodigos().setDarVistoBueno(this.getValue("dar-visto-bueno",
                                                             element));
            conf.getCodigos().setDarRecomendacion(this.getValue("dar-recomendacion",
                                                                      element));
            conf.getCodigos().setRegistrarRespuestaCumplimiento(this.getValue("registrar-respuesta-cumplimiento",
                                                                      element));
            conf.getCodigos().setCastigo(this.getValue("castigo", element));
            conf.getCodigos().setLitigio(this.getValue("litigio", element));
            conf.getCodigos().setVinculado(this.getValue("vinculado",
                                                         element));
            conf.getCodigos().setCasosespeciales(this.getValue("casos-especiales",
                                                               element));
            conf.getCodigos().setLegitimacioncapital(this.getValue("legitimacion-capital",
                                                                   element));
            /**
                 * Se obtiene la configuracion el tag tipo de persona
                 * */

            nodes = doc.getElementsByTagName("tipo-persona");
            node = nodes.item(0);
            element = (Element)node;

            conf.getTipoPersona().setFiador(this.getValue("fiador", element));
            conf.getTipoPersona().setPersonaNueva(this.getValue("persona-nueva",
                                                                element));
            conf.getTipoPersona().setSolicitante(this.getValue("solicitante",
                                                               element));


            /**
                 * Se obtiene la configuracion el tag bitacora
                 * */

            nodes = doc.getElementsByTagName("nemonicos-bitacora");
            node = nodes.item(0);
            element = (Element)node;

            conf.getBitacora().setAlerta(this.getValue("cod-alerta", element));
            conf.getBitacora().setAcciones(this.getValue("cod-acciones",
                                                         element));
            conf.getBitacora().setObservacion(this.getValue("cod-observacion",
                                                            element));
            conf.getBitacora().setNotificacion(this.getValue("cod-notificacion",
                                                             element));
            conf.getBitacora().setAgregar(this.getValue("cod-agregar",
                                                        element));
            conf.getBitacora().setModificar(this.getValue("cod-modificar",
                                                          element));
            conf.getBitacora().setEliminar(this.getValue("cod-eliminar",
                                                         element));
            conf.getBitacora().setConsulta(this.getValue("cod-consulta",
                                                         element));
            conf.getBitacora().setVinculacion(this.getValue("cod-vinculacion",
                                                            element));
            conf.getBitacora().setClasAntecendete(this.getValue("clasificacion-antecedente",
                                                                element));
            conf.getBitacora().setClasAceptada(this.getValue("clasificacion-aceptar",
                                                             element));
            conf.getBitacora().setClasRechazada(this.getValue("clasificacion-rechazar",
                                                              element));
            conf.getBitacora().setClasGenerico(this.getValue("clasificacion-generico",
                                                             element));

            /**
                 * Se obtiene la configuracion cabecera
                 * */

            nodes = doc.getElementsByTagName("cabecera");
            node = nodes.item(0);
            element = (Element)node;

            conf.getCabecera().setAplicacion(this.getValue("aplicacion",
                                                           element));
            conf.getCabecera().setIdentificacionUnicoGlobal(this.getValue("identificacion-unico-global",
                                                                          element));
            conf.getCabecera().setIdentificacionCanal(this.getValue("identificacion-canal",
                                                                    element));
            conf.getCabecera().setClaveBusqueda(this.getValue("clave-busqueda",
                                                              element));


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conf;
    }

    public Configuracion cargarConfiguracion(File fila) {
        Configuracion conf = null;
        try {
            conf = new Configuracion();
            DocumentBuilderFactory dbFactory =
                DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(fila);
            doc.getDocumentElement().normalize();
            /**
             * Se obtiene la configuracion del OSB
             * */

            NodeList nodes = doc.getElementsByTagName("osb");
            Node node = nodes.item(0);
            Element element = (Element)node;

            conf.getOsb().setHost(this.getValue("host", element));
            conf.getOsb().setPort(this.getValue("port", element));
            conf.getOsb().setProtocol(this.getValue("protocol", element));

            /**
             * Se obtiene si se trabaja en modo desarrollo o nop
             */

            nodes = doc.getElementsByTagName("desarrollo");
            node = nodes.item(0).getChildNodes().item(0);
            conf.setDesarrollo(Boolean.parseBoolean(node.getNodeValue()));

            /**
            * Se si se debe hacer log de los payloas
            * */

            nodes = doc.getElementsByTagName("log");
            node = nodes.item(0);
            element = (Element)node;

            conf.getLog().setType(this.getValue("type", element));
            conf.getLog().setLogPayload(Boolean.parseBoolean(this.getValue("payload",
                                                                           element)));
            conf.getLog().setBasePath(this.getValue("base-path", element));
            conf.getLog().setTimePattern(this.getValue("time-pattern",
                                                       element));

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conf;
    }

    private String getValue(String tag, Element element) {
        try {
            NodeList nodes =
                element.getElementsByTagName(tag).item(0).getChildNodes();
            Node node = nodes.item(0);
            return node.getNodeValue();
        } catch (NullPointerException e) {
            return "";
        }
    }

    private List<String> getListValue(String tag, Element element) {
        List<String> lista = new ArrayList<String>();
        try {
            NodeList nodes =
                element.getElementsByTagName(tag).item(0).getChildNodes();
            Node node = nodes.item(0);
            return lista;
        } catch (NullPointerException e) {
            return lista;
        }
    }
}
