package com.umasuraj.pom.utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.umasuraj.pom.objects.BillingAddress;

public class JacksonUtility {
    public BillingAddress deserializeJson(String filePath, BillingAddress billingAddress) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.readValue(filePath, billingAddress.getClass());
    }
}
