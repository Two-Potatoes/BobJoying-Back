package com.twoPotatoes.bobJoying.common.exception;

import org.springframework.graphql.execution.ErrorType;

import lombok.Getter;

@Getter
public enum CustomErrorCode {
    // TODO : 예시 에러코드입니다. 필요하지 않으면 추후 삭제합니다.
    USER_NOT_FOUND(ErrorType.NOT_FOUND, "사용자가 존재하지 않습니다.");

    private final ErrorType errorType;
    private final String message;

    CustomErrorCode(ErrorType errorType, String message) {
        this.errorType = errorType;
        this.message = message;
    }
}
