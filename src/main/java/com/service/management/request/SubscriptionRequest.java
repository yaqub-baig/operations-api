package com.service.management.request;

import lombok.Data;

@Data
public class SubscriptionRequest {
    private Integer ownerId;
    private Integer planId;
}
