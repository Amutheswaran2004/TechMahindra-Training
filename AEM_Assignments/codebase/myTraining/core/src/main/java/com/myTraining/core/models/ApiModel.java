package com.myTraining.core.models;

import com.myTraining.core.services.ApiService;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

@Model(adaptables = org.apache.sling.api.resource.Resource.class)
public class ApiModel {

    private static final Logger LOG = LoggerFactory.getLogger(ApiModel.class);

    @OSGiService
    private ApiService apiService;

    private String apiResponse;

    @PostConstruct
    protected void init() {
        LOG.info("Calling fetchApiData() in ApiModel...");
        this.apiResponse = apiService.fetchApiData();
        LOG.info("API Data from Model: {}", apiResponse);
    }

    public String getApiResponse() {
        return apiResponse;
    }
}
