package com.soaint.util;

import javax.faces.context.FacesContext;

import javax.servlet.ServletContext;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.ControlBinding;

import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.util.Service;

import oracle.bpel.services.workflow.WorkflowException;
import oracle.bpel.services.workflow.client.IWorkflowServiceClient;
import oracle.bpel.services.workflow.client.WorkflowServiceClientFactory;
import oracle.bpel.services.workflow.query.ITaskQueryService;
import oracle.bpel.services.workflow.verification.IWorkflowContext;
import oracle.bpel.services.workflow.worklist.adf.ADFWorklistBeanUtil;
import oracle.bpel.services.workflow.task.model.Task;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;

public class BPMUtil {
    public BPMUtil() {
        super();
    }

    public static Object getAtributeValue(String name) {
        Object valor = null;
        try {
            BindingContainer bindingContainer =
                (BindingContainer)JSFUtil.resolveExpression("#{bindings}");
            ControlBinding ctrlBinding =
                bindingContainer.getControlBinding(name);
            oracle.binding.AttributeBinding atributo =
                (oracle.binding.AttributeBinding)ctrlBinding;
            if (atributo.getInputValue() != null) {
                valor = atributo.getInputValue();
            }
        } catch (Exception e) {
            System.out.println("Error en el metodo getAtributeValue \" " +
                               name + "\", originado por :  " +
                               e.getMessage());
        } catch (NoClassDefFoundError e) {
            System.out.println("Clase no encontrada - " + e.getMessage());
        }
        return valor;
    }

    public static void setAtributeValue(String name, Object value) {
        try {
            BindingContainer bindingContainer =
                (BindingContainer)JSFUtil.resolveExpression("#{bindings}");
            ControlBinding ctrlBinding =
                bindingContainer.getControlBinding(name);
            oracle.binding.AttributeBinding atributo =
                (oracle.binding.AttributeBinding)ctrlBinding;
            if (atributo != null) {
                atributo.setInputValue(value);
            }
        } catch (Exception e) {
            System.out.println("Error en el metodo setAtributeValue, originado por :  " +
                               e.getMessage());
        } catch (NoClassDefFoundError e) {
            System.out.println("Clase no encontrada - " + e.getMessage());
        }
    }

    public static ServletContext getServletContext() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext ctx =
            (ServletContext)facesContext.getExternalContext().getContext();
        return ctx;
    }

    public static String getUsuarioBPM() {
        try {
            String usuario = "";
            IWorkflowServiceClient wfSvcClient;
            ITaskQueryService queryService;
            IWorkflowContext wfContext;

            String contextStr = ADFWorklistBeanUtil.getWorklistContextId();
            wfSvcClient = ADFWorklistBeanUtil.getWorkflowServiceClient();
            queryService = wfSvcClient.getTaskQueryService();
            wfContext = queryService.getWorkflowContext(contextStr);
            usuario = wfContext.getUser();
            return usuario;
        } catch (WorkflowException e) {
            e.printStackTrace();
            return null;
        } catch (NoClassDefFoundError e) {
            System.out.println("Clase no encontrada - " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static String getInstanceId() {
        FacesContext context = FacesContext.getCurrentInstance();
        String ctx =
            (String)context.getApplication().evaluateExpressionGet(context,
                                                                   "#{pageFlowScope.bpmWorklistContext}",
                                                                   String.class);
        String tskId =
            (String)context.getApplication().evaluateExpressionGet(context,
                                                                   "#{pageFlowScope.bpmWorklistTaskId}",
                                                                   String.class);

        IWorkflowServiceClient workflowSvcClient =
            WorkflowServiceClientFactory.getWorkflowServiceClient(WorkflowServiceClientFactory.REMOTE_CLIENT);

        ITaskQueryService wfQueryService =
            workflowSvcClient.getTaskQueryService();
        IWorkflowContext wfContext = null;
        Task myTask = null;
        try {
            wfContext = wfQueryService.getWorkflowContext(ctx);
            myTask = wfQueryService.getTaskDetailsById(wfContext, tskId);
        } catch (WorkflowException e) {
            e.printStackTrace();
        }
        if (myTask != null) {
            String id = myTask.getProcessInfo().getInstanceId();
            return id;
        }
        return null;
    }

    public String getActivityId() {
        String id = (String)BPMUtil.getAtributeValue("activityId");
        return id;
    }


    /***************************************************************
     * Inicio Codigo Fabrica
     ****************************************************************/
    public static Boolean executeAction(String operation) {

        Boolean result;
        try {
            BindingContainer bindings =
                BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding operationBinding =
                bindings.getOperationBinding(operation);
            operationBinding.execute();

            FacesContext facesContext = FacesContext.getCurrentInstance();
            ExtendedRenderKitService aService =
                Service.getRenderKitService(facesContext,
                                            ExtendedRenderKitService.class);
            aService.addScript(facesContext,
                               "window.opener = self;window.close();");
            // aService.addScript(facesContext, "window.close();window.opener.location.href = window.opener.location.href;");
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }

        return result;
    }
    /***************************************************************
    * Fin Codigo Fabrica
    ****************************************************************/

}
