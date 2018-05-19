package com.odinysus.vshop.base.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class BaseResponse<T> extends ResponseEntity<T> {
    public BaseResponse(HttpStatus status) {
        super(status);
    }

    public BaseResponse(T body, HttpStatus status) {
        super(body, status);
    }

    public BaseResponse(MultiValueMap<String, String> headers, HttpStatus status) {
        super(headers, status);
    }

    public BaseResponse(T body, MultiValueMap<String, String> headers, HttpStatus status) {
        super(body, headers, status);
    }

    public BaseResponse(T body) {
        super(body, HttpStatus.OK);
    }


}
