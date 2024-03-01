package com.twoPotatoes.bobJoying.common.exception;

import org.springframework.graphql.data.method.annotation.GraphQlExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

import graphql.GraphQLError;

// 컨트롤러에서 예외 발생시 여기서 핸들링하여 errorCode와 메시지를 리턴합니다.
@ControllerAdvice
public class GlobalExceptionHandler {

    // CustomException 발생 시 작동하는 핸들러
    @GraphQlExceptionHandler
    public GraphQLError handle(CustomException ex) {
        return GraphQLError.newError()
            .errorType(ex.getErrorCode().getErrorType())
            .message(ex.getMessage())
            .build();
    }
}
