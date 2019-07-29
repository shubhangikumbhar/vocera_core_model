/*
 * Copyright (c) Vocera Communications, Inc. All Rights Reserved.
 * This software is the confidential and proprietary information of
 * Vocera Communications, Inc.
 */

package com.vocera.cloud.coremodel.constants;

/**
 * Constants @enum for Affiliation states.
 *
 * @author Rohit Phatak
 */
public enum AffiliationStatus {

    /**
     * Affiliation requested from an organization.
     * Request is in an active state to be actioned by organization on the other side.
     */
    ACTIVE_REQUEST("active_request"),

    /**
     * Affiliation request is Accepted by the second organization and Affiliation is successful.
     * Both organizations are successfully affiliated.
     */
    AFFILIATED("affiliated"),

    /**
     * Affiliation request has been declined by the organization.
     */
    REJECTED("rejected"),

    /**
     * Two organization are in an affiliated state.
     * One of the organizations has requested revoke for Affiliation.
     */
    AFFILIATION_REVOKE_REQUESTED("affiliation_revoke_requested"),

    /**
     * Affiliation revoke request is successful and both organizations are no longer affiliated with each other.
     */
    AFIILIATION_REVOKED("affiliation_revoked");

    private String status;

    AffiliationStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}