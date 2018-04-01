package com.hemonth.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Offer {
    private Integer bidId;
    private Integer bidCarrierAssociationId;
    private String type;
    private String loadId;
    private String userID;
    private String scac;
    private BigDecimal amount;
    private String status;
    private String startDate;
    private String endDate;
    private String[] conditions;
    private boolean autobid;
    private BigDecimal lowestBidAmount;
    private String viewedOffer;
    private boolean postedBlind;
    private String tContactToken;
}
