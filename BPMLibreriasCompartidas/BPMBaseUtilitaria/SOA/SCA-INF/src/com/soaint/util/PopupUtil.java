package com.soaint.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import oracle.adf.view.rich.component.rich.RichPopup;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;


/**
 * Patterns Utility class for public use.
 */
public class PopupUtil {
    /**
     * Shows the specified popup component and its contents
     * @param popupId is the clientId of the popup to be shown
     * clientId is derived from backing bean for the af:popup using getClientId method
     */
    public static void invokePopup(String popupId) {
        invokePopup(popupId, null, null);
    }

    /**
     * Shows the specified popup and uses the specified hints to align the popup.
     * @param popupId is the clientId of the popup to be shown - clientId is derived from backing bean for the af:popup using getClientId method
     * @param align is a hint for the popup display. Check AdfRichPopup js javadoc for valid values. Supported value includes: "AdfRichPopup.ALIGN_START_AFTER", "AdfRichPopup.ALIGN_BEFORE_START" and "AdfRichPopup.ALIGN_END_BEFORE"
     * @param alignId is the clientId of the component the popup should align to - clientId is derived from backing bean for the component using getClientId method
     * align and alignId need to be specified together - specifying null for either of them will have no effect.
     */
    public static void ocultarPopUpComponet(String id) {
        UIComponent pop = JSFUtil.findComponentInRoot(id);
        PopupUtil.hidePopup(pop.getClientId(JSFUtil.getFacesContext()));
    }

    public static void mostrarPopUpComponet(String id) {
        UIComponent pop = JSFUtil.findComponentInRoot(id);
        PopupUtil.invokePopup(pop.getClientId(JSFUtil.getFacesContext()));
    }

    public static void mostrarPopUpComponet(String id, UIComponent comp) {
        UIComponent pop = JSFUtil.findComponent(comp, id);

        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        hints.add(RichPopup.PopupHints.HintTypes.HINT_ALIGN_ID,
                  comp).add(RichPopup.PopupHints.HintTypes.HINT_LAUNCH_ID,
                            comp).add(RichPopup.PopupHints.HintTypes.HINT_ALIGN,
                                      RichPopup.PopupHints.AlignTypes.ALIGN_OVERLAP);

        ((RichPopup)pop).show(hints);
    }

    public static void invokePopup(String popupId, String align,
                                   String alignId) {
        if (popupId != null) {
            ExtendedRenderKitService service =
                Service.getRenderKitService(FacesContext.getCurrentInstance(),
                                            ExtendedRenderKitService.class);

            StringBuffer showPopup = new StringBuffer();
            showPopup.append("var hints = new Object();");
            //Add hints only if specified - see javadoc for AdfRichPopup js for details on valid values and behavior
            if (align != null && alignId != null) {
                showPopup.append("hints[AdfRichPopup.HINT_ALIGN] = " + align +
                                 ";");
                showPopup.append("hints[AdfRichPopup.HINT_ALIGN_ID] ='" +
                                 alignId + "';");
            }
            showPopup.append("var popupObj=AdfPage.PAGE.findComponent('" +
                             popupId + "'); popupObj.show(hints);");
            service.addScript(FacesContext.getCurrentInstance(),
                              showPopup.toString());
        }
    }

    /**
     * Hides the specified popup.
     * @param popupId is the clientId of the popup to be hidden
     * clientId is derived from backing bean for the af:popup using getClientId method
     */
    public static void hidePopup(String popupId) {
        if (popupId != null) {
            ExtendedRenderKitService service =
                Service.getRenderKitService(FacesContext.getCurrentInstance(),
                                            ExtendedRenderKitService.class);
            String hidePopup =
                "var popupObj=AdfPage.PAGE.findComponent('" + popupId +
                "'); popupObj.hide();";
            service.addScript(FacesContext.getCurrentInstance(), hidePopup);
        }
    }

    public static Boolean hideParentPopUp(UIComponent comp) {
        RichPopup parent = PopupUtil.retriveParentPopUp(comp);
        if (parent == null) {
            return false;
        }
        parent.hide();
        return true;
    }

    public static RichPopup retriveParentPopUp(UIComponent comp) {
        if (comp == null) {
            return null;
        }
        if (comp instanceof RichPopup) {
            return (RichPopup)comp;
        }
        return PopupUtil.retriveParentPopUp(comp.getParent());
    }
}

