package com.phonon.webhook.webhook_service;

import com.phonon.webhook.webhook_service.enums.RequestStatus;
import com.phonon.webhook.webhook_service.model.RequestData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController("/webhook/")
public class WebHookController {

    private static final String UPDATE_REQUEST_URL = "http://localhost:8080/request/update";
    private RestTemplate restTemplate;


    public WebHookController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @PostMapping("/updateRequest")
    public ResponseEntity<RequestData> updateRequest(RequestData requestData){
        requestData.setRequestStatus(RequestStatus.PROCESSED);
        restTemplate.put("/request/update/"+requestData.getUuid(), requestData);
        return ResponseEntity.ok(requestData);
    }
}
