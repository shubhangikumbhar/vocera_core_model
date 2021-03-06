/*
 * Copyright (c) Vocera Communications, Inc. All Rights Reserved.
 * This software is the confidential and proprietary information of
 * Vocera Communications, Inc.
 */

package com.vocera.cloud.coremodel.model;

import java.util.List;

/**
 * Entity for Error Response.
 *
 * @author Rohit Phatak
 */
public class ErrorResponse {
    private String message;

    private List<String> details;

    private String code;

    public ErrorResponse(String message, List<String> details, String code) {
        this.message = message;
        this.details = details;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
