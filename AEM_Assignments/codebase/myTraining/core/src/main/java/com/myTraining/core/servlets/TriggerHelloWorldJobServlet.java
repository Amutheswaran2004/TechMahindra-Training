package com.myTraining.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.event.jobs.JobManager;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(
        service = Servlet.class,
        property = {
                "sling.servlet.paths=/bin/triggerHelloWorldJob",
                "sling.servlet.methods=GET"
        }
)
public class TriggerHelloWorldJobServlet extends SlingSafeMethodsServlet {

    @Reference
    private JobManager jobManager;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        jobManager.addJob("myTraining/core/jobs/helloWorld", null);
        response.getWriter().write("🔹 Hello World Job Triggered Successfully!");
    }
}
