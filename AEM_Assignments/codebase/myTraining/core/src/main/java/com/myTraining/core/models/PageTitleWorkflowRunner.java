package com.myTraining.core.models;

import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkflowData;
import com.adobe.granite.workflow.model.WorkflowModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = PageTitleWorkflowRunner.class)
public class PageTitleWorkflowRunner {

    private static final Logger log = LoggerFactory.getLogger(PageTitleWorkflowRunner.class);

    @Reference
    private ResourceResolverFactory resourceResolverFactory;

    public void runLoggingWorkflow(String pagePath) {
        try (ResourceResolver resolver = resourceResolverFactory.getServiceResourceResolver(null)) {
            // Get the page to extract title
            Resource pageResource = resolver.getResource(pagePath);
            String pageTitle = pageResource.getValueMap().get("jcr:title", String.class);

            if (pageTitle == null) {
                pageTitle = "Default Title";
            }

            WorkflowSession workflowSession = resolver.adaptTo(WorkflowSession.class);
            WorkflowModel workflowModel = workflowSession.getModel("/var/workflow/models/custom/my-logging-workflow");

            WorkflowData workflowData = workflowSession.newWorkflowData("JCR_PATH", pagePath);

            // Add metadata including page title
            workflowData.getMetaDataMap().put("pageTitle", pageTitle);
            workflowData.getMetaDataMap().put("initiatedBy", "system");

            workflowSession.startWorkflow(workflowModel, workflowData);
            log.info("Started My Logging Workflow on page: {} with title: {}", pagePath, pageTitle);
        } catch (Exception e) {
            log.error("Error starting My Logging Workflow", e);
        }
    }
}