package com.soaint.util;

import java.lang.reflect.Field;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import oracle.adf.share.logging.ADFLogger;

public class ListUtil {
    public static final ADFLogger LOGGER =
        ADFLogger.createADFLogger(ListUtil.class);

    public ListUtil() {
        super();
    }

    public static Map<?, ?> listToMap(final List<?> lista, final String key) {
        Map<String, Object> res = new HashMap<String, Object>();
        if (lista.size() > 0) {
            Iterator it = lista.iterator();
            while (it.hasNext()) {
                Object obj = it.next();
                try {
                    Field temp = ListUtil.getField(obj.getClass(), key);
                    temp.setAccessible(true);
                    res.put(temp.get(obj).toString(), obj);
                } catch (IllegalAccessException e) {
                    LOGGER.warning("Error en el metodo getListObjectValue 1\" " +
                                   key + "\", originado por :  " +
                                   e.getMessage());
                }
            }
        }
        return res;
    }

    public static Object findListItem(final List<?> lista, final String key,
                                      final Object valor) {
        return ListUtil.findListItem(lista, key, valor, false);
    }

    public static Object findListItem(final List<?> lista,
                                      final Map<?, ?> listaParametros) {
        return ListUtil.findListItem(lista, listaParametros, false);
    }

    public static Object findListItem(final List<?> lista, final String key,
                                      final Object valor,
                                      final Boolean remove) {
        Map params = new HashMap<String, Object>();

        params.put(key, valor);
        return ListUtil.findListItem(lista, params, remove);
    }

    public static Object findListItem(final List<?> lista,
                                      final Map<?, ?> params,
                                      final Boolean remove) {
        if (lista.size() > 0) {
            final Iterator<?> it = lista.iterator();
            while (it.hasNext()) {
                final Object item = it.next();
                Set<String> set = (Set<String>)params.keySet();
                final List<String> keys = new ArrayList<String>(set);
                Map<String, Object> temp =
                    (Map<String, Object>)ListUtil.getListObjectValue(item,
                                                                     keys);
                Iterator<String> itt = keys.iterator();
                Boolean encontrado = true;
                while (itt.hasNext()) {
                    String key = itt.next();
                    if (!params.get(key).equals(temp.get(key))) {
                        encontrado = false;
                        break;
                    }
                }
                if (encontrado) {
                    if (remove)
                        it.remove();
                    return item;
                }
            }
        }
        return null;
    }

    public static void setObjectValue(final Object obj, final Object value,
                                      final String name) {
        try {
            Field temp = obj.getClass().getDeclaredField(name);
            temp.setAccessible(true);
            temp.set(obj, value);
        } catch (IllegalAccessException e) {
            LOGGER.warning("Error en el metodo setObjectValue 1\" " + name +
                           "\", originado por :  " + e.getMessage());
        } catch (NoSuchFieldException e) {
            LOGGER.warning("Error en el metodo setObjectValue 2\" " + name +
                           "\", originado por :  " + e.getMessage());
        }
    }

    public static Object getObjectValue(final Object obj, final String name) {
        List<String> names = new ArrayList<String>();
        names.add(name);
        return ListUtil.getListObjectValue(obj, names);
    }

    public static Map<?, ?> getListObjectValue(final Object obj,
                                               final List<String> nombres) {
        Map res = null;
        res = new HashMap<String, Object>();
        Iterator<String> it = nombres.iterator();
        while (it.hasNext()) {
            String name = it.next();
            try {
                Field temp = ListUtil.getField(obj.getClass(), name);
                temp.setAccessible(true);
                res.put(name, temp.get(obj));
            } catch (IllegalAccessException e) {
                LOGGER.warning("Error en el metodo getListObjectValue 1\" " +
                               name + "\", originado por :  " +
                               e.getMessage());
            }
        }
        return res;
    }

    public static Field getField(Class<?> clase, String name) {
        Class<?> current = clase;
        do {
            try {
                return current.getDeclaredField(name);
            } catch (Exception e) {
                LOGGER.info("Error en el metodo getField \" " + name +
                            "\", originado por :  " + e.getMessage());
            }
            current = current.getSuperclass();
        } while (current != null);
        return null;
    }
}
