package com.bitlove.fetchat.event;

public class ServiceCallFinishedEvent {

    private String serviceCallAction;

    public ServiceCallFinishedEvent(String serviceCallAction) {
        this.serviceCallAction = serviceCallAction;
    }

    public String getServiceCallAction() {
        return serviceCallAction;
    }
}
