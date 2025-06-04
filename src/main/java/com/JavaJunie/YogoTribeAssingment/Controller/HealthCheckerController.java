package com.JavaJunie.YogoTribeAssingment.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

public class HealthCheckerController {
    /**
     * Simple health check endpoint.
     * URL: GET /health
     * @return JSON response indicating the service is up.
     */
    @GetMapping("/health")
    public Map<String, String> healthCheck() {
        Map<String, String> status = new HashMap<>();
        status.put("status", "UP");
        status.put("message", "Prime Number API is running fine");
        return status;
    }
}
