package com.soaint.extend.base;

import com.soaint.util.JSFUtil;

import java.lang.reflect.Field;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import java.util.Map;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.share.logging.ADFLogger;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierBinding;

import oracle.binding.BindingContainer;
import oracle.binding.ControlBinding;

import oracle.jbo.NavigatableRowIterator;

import oracle.jbo.Row;

import org.apache.myfaces.trinidad.model.CollectionModel;

/**
 * Clase para ser heredada por clases utilizadas como beans que se llenan
 * con lo valores de los atributos definidos en el Page Definition
 * Creada el 01-02-2014
 * @author John D. Silva T.
 * @version 1.0
 **/

public abstract class BPMBeanBase extends Base {
    public static final ADFLogger LOGGER =
        ADFLogger.createADFLogger(BPMBeanBase.class);
    private static final List<Class> tipos = new ArrayList<Class>();
    static {
        tipos.add(String.class);
        tipos.add(Double.class);
        tipos.add(Integer.class);
        tipos.add(Boolean.class);
        tipos.add(Float.class);
        tipos.add(Byte.class);
        tipos.add(Character.class);
        tipos.add(Long.class);
        tipos.add(Short.class);
    }

    public Field[] getClassAtributes() {
        return this.getClass().getDeclaredFields();
    }

    public void bindValue() {
        final Field[] attr = this.getClassAtributes();
        for (int i = 0; i < attr.length; i++) {
            final Field temp = attr[i];
            temp.setAccessible(true);
            final String name = temp.getName();
            if (!java.lang.reflect.Modifier.isStatic(temp.getModifiers()) &&
                this.isBasicType(temp)) {
                try {
                    temp.set(this, this.getAtributeValue(name));
                } catch (IllegalAccessException e) {
                    LOGGER.warning("Error en el metodo bindValue \" " + name +
                                   "\", originado por :  " + e.getMessage());
                } catch (Exception e) {
                    LOGGER.warning("Error en el metodo bindValue \" " + name +
                                   "\", originado por :  " + e.getMessage());
                }
            }
        }
    }

    /***************************************************************
     * Inicio Codigo Fabrica
     ****************************************************************/

    public void bindValue(String source) {
        final Field[] attr = this.getClassAtributes();
        for (int i = 0; i < attr.length; i++) {
            final Field temp = attr[i];
            temp.setAccessible(true);
            final String name = temp.getName();
            if (!java.lang.reflect.Modifier.isStatic(temp.getModifiers()) &&
                this.isBasicType(temp)) {
                try {
                    temp.set(this, this.getAtributeValue(name, source));
                } catch (IllegalAccessException e) {
                    LOGGER.warning("Error en el metodo bindValue \" " + name +
                                   "\", originado por :  " + e.getMessage());
                } catch (Exception e) {
                    LOGGER.warning("Error en el metodo bindValue \" " + name +
                                   "\", originado por :  " + e.getMessage());
                }
            }
        }
    }

    private Object getAtributeValue(final String name, String source) {
        Object valor = null;
        try {
            final BindingContainer bindingContainer =
                (BindingContainer)JSFUtil.resolveExpression("#{" + source +
                                                            "}");
            final ControlBinding ctrlBinding =
                bindingContainer.getControlBinding(name);
            final oracle.binding.AttributeBinding atributo =
                (oracle.binding.AttributeBinding)ctrlBinding;
            if (atributo.getInputValue() != null) {
                valor = atributo.getInputValue();
            }
        } catch (Exception e) {
            LOGGER.warning("Error en el metodo getAtributeValue \" " + name +
                           "\", originado por :  " + e.getMessage());
        } catch (NoClassDefFoundError e) {
            LOGGER.warning("Clase no encontrada - " + e.getMessage());
        }
        return valor;
    }

    /***************************************************************
     * Fin Codigo Fabrica
     ****************************************************************/


    private Boolean isBasicType(final Field field) {
        final Iterator<Class> it = tipos.iterator();
        while (it.hasNext()) {
            if (field.getType().equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public void saveBindingValues() {
        final Field[] attr = this.getClassAtributes();
        for (int i = 0; i < attr.length; i++) {
            final Field temp = attr[i];
            temp.setAccessible(true);
            final String name = temp.getName();
            if (!java.lang.reflect.Modifier.isStatic(temp.getModifiers())) {
                try {
                    this.setAtributeValue(name, temp.get(this));
                } catch (IllegalAccessException e) {
                    LOGGER.warning("Error en el metodo saveBindingValues \" " +
                                   name + "\", originado por :  " +
                                   e.getMessage());
                } catch (Exception e) {
                    LOGGER.warning("Error en el metodo saveBindingValues \" " +
                                   name + "\", originado por :  " +
                                   e.getMessage());
                }
            }
        }
    }

    private Object getAtributeValue(final String name) {
        Object valor = null;
        try {
            final BindingContainer bindingContainer =
                (BindingContainer)JSFUtil.resolveExpression("#{bindings}");
            final ControlBinding ctrlBinding =
                bindingContainer.getControlBinding(name);
            final oracle.binding.AttributeBinding atributo =
                (oracle.binding.AttributeBinding)ctrlBinding;
            if (atributo.getInputValue() != null) {
                valor = atributo.getInputValue();
            }
        } catch (Exception e) {
            LOGGER.warning("Error en el metodo getAtributeValue \" " + name +
                           "\", originado por :  " + e.getMessage());
        } catch (NoClassDefFoundError e) {
            LOGGER.warning("Clase no encontrada - " + e.getMessage());
        }
        return valor;
    }

    private void setAtributeValue(final String name, final Object value) {
        try {
            final BindingContainer bindingContainer =
                (BindingContainer)JSFUtil.resolveExpression("#{bindings}");
            final ControlBinding ctrlBinding =
                bindingContainer.getControlBinding(name);
            final oracle.binding.AttributeBinding atributo =
                (oracle.binding.AttributeBinding)ctrlBinding;
            if (atributo != null) {
                atributo.setInputValue(value);
            }
        } catch (Exception e) {
            LOGGER.warning("Error en el metodo setAtributeValue, originado por :  " +
                           e.getMessage());
        } catch (NoClassDefFoundError e) {
            LOGGER.warning("Clase no encontrada - " + e.getMessage());
        }
    }

    public static void addItemToList(final Object obj, final String binding) {
        final BindingContainer bindingContainer2 =
            (BindingContainer)JSFUtil.resolveExpression("#{bindings}");

        //  Para obtener el objeto de la tabla (nombre de atributo tipo arreglo)
        final ControlBinding ctrlBinding2 =
            bindingContainer2.getControlBinding(binding);
        final FacesCtrlHierBinding fchb = (FacesCtrlHierBinding)ctrlBinding2;

        // Para agregar una fila al arreglo
        final CollectionModel model = fchb.getCollectionModel();
        final FacesCtrlHierBinding _biding =
            (FacesCtrlHierBinding)model.getWrappedData();
        final DCIteratorBinding dcIteratorBinding =
            _biding.getDCIteratorBinding();

        final NavigatableRowIterator nav =
            dcIteratorBinding.getNavigatableRowIterator();

        final Row rw = nav.createRow();
        rw.setNewRowState(Row.STATUS_INITIALIZED);
        final Row lastRow = nav.last();
        final int lastRowIndex = nav.getRangeIndexOf(lastRow);
        nav.insertRowAtRangeIndex(lastRowIndex + 1, rw);
        dcIteratorBinding.setCurrentRowWithKey(rw.getKey().toStringFormat(true));

        final Field[] attr = obj.getClass().getDeclaredFields();
        for (int i = 0; i < attr.length; i++) {
            Field temp = attr[i];
            temp.setAccessible(true);
            String name = temp.getName();
            if (!java.lang.reflect.Modifier.isStatic(temp.getModifiers())) {
                try {
                    fchb.setAttribute(name, temp.get(obj));
                } catch (IllegalAccessException e) {
                    LOGGER.warning("Error en el metodo addItemToList \" " +
                                   name + "\", originado por :  " +
                                   e.getMessage());
                } catch (Exception e) {
                    LOGGER.warning("Error en el metodo addItemToList \" " +
                                   name + "\", originado por :  " +
                                   e.getMessage());
                } catch (NoClassDefFoundError e) {
                    LOGGER.warning("Clase no encontrada - " + e.getMessage());
                }
            }
        }
    }

    public static void salvarLista(final List<?> lista, final String binding) {
        final BindingContainer bindingContainer2 =
            (BindingContainer)JSFUtil.resolveExpression("#{bindings}");

        //  Para obtener el objeto de la tabla (nombre de atributo tipo arreglo)
        final ControlBinding ctrlBinding2 =
            bindingContainer2.getControlBinding(binding);
        final FacesCtrlHierBinding fchb = (FacesCtrlHierBinding)ctrlBinding2;

        // Para agregar una fila al arreglo
        final CollectionModel model = fchb.getCollectionModel();
        final FacesCtrlHierBinding _biding =
            (FacesCtrlHierBinding)model.getWrappedData();
        final DCIteratorBinding dcIteratorBinding =
            _biding.getDCIteratorBinding();

        final Iterator it = lista.iterator();
        while (it.hasNext()) {
            final Object obj = it.next();
            final NavigatableRowIterator nav =
                dcIteratorBinding.getNavigatableRowIterator();

            final Row rw = nav.createRow();
            rw.setNewRowState(Row.STATUS_INITIALIZED);
            final Row lastRow = nav.last();
            final int lastRowIndex = nav.getRangeIndexOf(lastRow);
            nav.insertRowAtRangeIndex(lastRowIndex + 1, rw);
            dcIteratorBinding.setCurrentRowWithKey(rw.getKey().toStringFormat(true));

            final Field[] attr = obj.getClass().getDeclaredFields();
            for (int i = 0; i < attr.length; i++) {
                final Field temp = attr[i];
                temp.setAccessible(true);
                final String name = temp.getName();
                if (!java.lang.reflect.Modifier.isStatic(temp.getModifiers())) {
                    try {
                        fchb.setAttribute(name, temp.get(obj));
                    } catch (IllegalAccessException e) {
                        LOGGER.warning("Error en el metodo salvarLista \" " +
                                       name + "\", originado por :  " +
                                       e.getMessage());
                    } catch (Exception e) {
                        LOGGER.warning("Error en el metodo salvarLista \" " +
                                       name + "\", originado por :  " +
                                       e.getMessage());
                    } catch (NoClassDefFoundError e) {
                        LOGGER.warning("Clase no encontrada - " +
                                       e.getMessage());
                    }
                }
            }

        }
    }

    private static Map<String, Object> crearHashMap(final List<?> lista,
                                                    final String key) {
        final Map<String, Object> hash = new HashMap<String, Object>();
        final Iterator it = lista.iterator();
        while (it.hasNext()) {
            try {
                final Object obj = it.next();
                Field temp = obj.getClass().getDeclaredField(key);
                temp.setAccessible(true);
                final Object val = temp.get(obj);
                hash.put(val.toString(), obj);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoClassDefFoundError e) {
                LOGGER.warning("Clase no encontrada - " + e.getMessage());
            }
        }
        return hash;
    }

    public static void actualizarLista(final List lista, final String key,
                                       final String binding) {
        final BindingContainer bindingContainer2 =
            (BindingContainer)JSFUtil.resolveExpression("#{bindings}");
        final ControlBinding ctrlBinding2 =
            bindingContainer2.getControlBinding(binding);
        final FacesCtrlHierBinding fchb = (FacesCtrlHierBinding)ctrlBinding2;

        final CollectionModel model = fchb.getCollectionModel();
        final FacesCtrlHierBinding _biding =
            (FacesCtrlHierBinding)model.getWrappedData();
        final DCIteratorBinding dcIteratorBinding =
            _biding.getDCIteratorBinding();

        final NavigatableRowIterator nav =
            dcIteratorBinding.getNavigatableRowIterator();

        final Map hash = BPMBeanBase.crearHashMap(lista, key);
        for (final Row row : nav.getAllRowsInRange()) {
            try {
                final Object obj = hash.get(row.getAttribute(key));
                final Field[] attr = obj.getClass().getDeclaredFields();
                for (int i = 0; i < attr.length; i++) {
                    Field temp = attr[i];
                    temp.setAccessible(true);
                    String name = temp.getName();
                    if (!java.lang.reflect.Modifier.isStatic(temp.getModifiers())) {
                        try {
                            row.setAttribute(name, temp.get(obj));
                        } catch (IllegalAccessException e) {
                            LOGGER.warning("Error en el metodo cargarLista \" " +
                                           name + "\", originado por :  " +
                                           e.getMessage());
                        } catch (Exception e) {
                            LOGGER.warning("Error en el metodo cargarLista \" " +
                                           name + "\", originado por :  " +
                                           e.getMessage());
                        }
                    }
                }
                lista.add(obj);
            } catch (Exception e) {
                LOGGER.warning("Error en el metodo actualizarLista  originado por :  " +
                               e.getMessage());
            } catch (NoClassDefFoundError e) {
                LOGGER.warning("Clase no encontrada - " + e.getMessage());
            }
        }
    }

    public static void cargarLista(final List lista, final Class clase,
                                   final String binding) {
        // Para tomar el contenedor donde estan los Data Object
        final BindingContainer bindingContainer2 =
            (BindingContainer)JSFUtil.resolveExpression("#{bindings}");

        //  Para obtener el objeto de la tabla (nombre de atributo tipo arreglo)
        final ControlBinding ctrlBinding2 =
            bindingContainer2.getControlBinding(binding);
        final FacesCtrlHierBinding fchb = (FacesCtrlHierBinding)ctrlBinding2;

        // Para agregar una fila al arreglo
        final CollectionModel model = fchb.getCollectionModel();
        final FacesCtrlHierBinding _biding =
            (FacesCtrlHierBinding)model.getWrappedData();
        final DCIteratorBinding dcIteratorBinding =
            _biding.getDCIteratorBinding();

        final NavigatableRowIterator nav =
            dcIteratorBinding.getNavigatableRowIterator();
        for (final Row row : nav.getAllRowsInRange()) {
            try {
                final Object obj = clase.newInstance();
                final Field[] attr = obj.getClass().getDeclaredFields();
                for (int i = 0; i < attr.length; i++) {
                    final Field temp = attr[i];
                    temp.setAccessible(true);
                    final String name = temp.getName();
                    if (!java.lang.reflect.Modifier.isStatic(temp.getModifiers())) {
                        try {
                            temp.set(obj, row.getAttribute(name));
                        } catch (IllegalAccessException e) {
                            LOGGER.warning("Error en el metodo cargarLista \" " +
                                           name + "\", originado por :  " +
                                           e.getMessage());
                        } catch (Exception e) {
                            LOGGER.warning("Error en el metodo cargarLista \" " +
                                           name + "\", originado por :  " +
                                           e.getMessage());
                        }
                    }
                }
                lista.add(obj);
            } catch (InstantiationException e) {
                LOGGER.warning("Error en el metodo cargarLista  originado por :  " +
                               e.getMessage());
            } catch (IllegalAccessException e) {
                LOGGER.warning("Error en el metodo cargarLista  originado por :  " +
                               e.getMessage());
            } catch (NoClassDefFoundError e) {
                LOGGER.warning("Clase no encontrada - " + e.getMessage());
            }
        }
    }

}
