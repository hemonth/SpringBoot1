package com.hemonth.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExecuteOffer {
    private String loadNumber;
    private String carrierScac;
    private Offer offer;
    private String engineResponse;
    private String executionAction;
    private String waitBeforeExecute;
    private String maxBuyAmount;
    private String maxBuyMargin;
    private String counterAmount;
    private String maxBuySource;
    private Integer counterAttempts;
    private Boolean cscManualIntervention;
}
