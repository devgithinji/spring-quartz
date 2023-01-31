package com.densoft.springquartz.payload;

import lombok.Data;

@Data
public class EmailResponse {
    private boolean success;
    private String jobId;
    private String jobGroupId;
    private String message;

    public EmailResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public EmailResponse(boolean success, String jobId, String jobGroupId, String message) {
        this.success = success;
        this.jobId = jobId;
        this.jobGroupId = jobGroupId;
        this.message = message;
    }
}
