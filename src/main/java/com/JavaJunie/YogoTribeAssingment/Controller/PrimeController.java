package com.JavaJunie.YogoTribeAssingment.Controller;
import com.JavaJunie.YogoTribeAssingment.Model.InputModel;
import com.JavaJunie.YogoTribeAssingment.Service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * PrimeController handles HTTP requests and responses for checking prime numbers.
 */
@RestController
@RequestMapping("/api") // Base URL for all APIs in this controller
public class PrimeController {

    // Injecting PrimeService to use its business logic
    @Autowired
    private PrimeService primeService;

    /**
     * Endpoint: POST /api/isPrime
     * Accepts a JSON payload with a number and returns whether it is a prime number.
     */
    @PostMapping("/isPrime")
    public ResponseEntity<?> isPrime(@RequestBody InputModel request) {
        Map<String, Object> response = new HashMap<>();

        // Extract number from request
        int num = request.getNumber();

        // Validate the number
        if (num <= 0) {
            response.put("error", "Please provide a positive integer.");
            return ResponseEntity.badRequest().body(response);
        }

        // Use service to determine primality
        boolean result = primeService.isPrime(num);

        // Prepare response
        response.put("number", num);
        response.put("isPrime", result);
        return ResponseEntity.ok(response);
    }
}
