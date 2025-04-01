package com.myTraining.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(
        service = { Servlet.class }
)
@SlingServletPaths("/bin/dynamiccreatepage")
public class DynamicPageCreationServlet extends SlingAllMethodsServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Sample JSON response for GET request
        response.getWriter().write("{\"message\": \"GET request successful. Use POST to create a page.\"}");
    }

    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Extracting parameters (modify according to your needs)
        String pageTitle = request.getParameter("title");
        String pagePath = request.getParameter("path");

        if (pageTitle == null || pagePath == null) {
            response.getWriter().write("{\"error\": \"Missing title or path parameter.\"}");
            return;
        }

        try {
            // Your logic to create the page dynamically in AEM
            // Example: Call a utility/service to create the page

            response.getWriter().write("{\"message\": \"Page created successfully\", \"title\": \"" + pageTitle + "\", \"path\": \"" + pagePath + "\"}");
        } catch (Exception e) {
            response.getWriter().write("{\"error\": \"Failed to create page\", \"details\": \"" + e.getMessage() + "\"}");
        }
    }
}
