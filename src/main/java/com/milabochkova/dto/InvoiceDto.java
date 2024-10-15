package com.milabochkova.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.milabochkova.model.Invoice;

public class InvoiceDto {

    @JsonProperty("user_id")
    private String userId;

    private Integer amount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
