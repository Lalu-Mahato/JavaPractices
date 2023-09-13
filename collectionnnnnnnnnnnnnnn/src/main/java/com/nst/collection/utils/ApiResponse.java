package com.nst.collection.utils;

import lombok.Data;

@Data
public class ApiResponse {
    private int code;
    private String status;
    private Object data;
    private Object message;
}
