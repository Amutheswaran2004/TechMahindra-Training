package com.myTraining.core.services;

import com.myTraining.core.config.ApiConfig;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

@Component(service = ApiService.class, immediate = true)
@Designate(ocd = ApiConfig.class)
public class ApiService {

    private static final Logger LOG = LoggerFactory.getLogger(ApiService.class);
    private String apiUrl;

    @Activate
    @Modified
    protected void activate(ApiConfig config) {
        this.apiUrl = config.apiEndpoint();
        LOG.info("Configured API URL: {}", apiUrl);
        fetchAndLogApiData();  // Call API during activation
    }

    public String fetchApiData() {
        String jsonResponse = "";
        LOG.info("Fetching API data from: {}", apiUrl);

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            int responseCode = conn.getResponseCode();
            LOG.info("HTTP Response Code: {}", responseCode);

            if (responseCode == 200) {
                InputStream inputStream = conn.getInputStream();
                jsonResponse = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
                LOG.info("API Response Data: {}", jsonResponse);
            } else {
                LOG.error("API Call Failed. Response Code: {}", responseCode);
            }
        } catch (Exception e) {
            LOG.error("Error in fetchApiData()", e);
        }

        return jsonResponse;
    }

    private void fetchAndLogApiData() {
        String data = fetchApiData();
        LOG.info("Final API Response Logged: {}", data);
    }
}
