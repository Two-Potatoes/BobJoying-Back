package com.twoPotatoes.bobJoying.foodRequest.entity;

public enum FoodRequestStatusEnum {
    REQUESTED("요청중"),
    COMPLETED("완료");
    private final String status;

    FoodRequestStatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
