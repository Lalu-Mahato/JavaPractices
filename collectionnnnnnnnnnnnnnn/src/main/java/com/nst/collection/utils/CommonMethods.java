package com.nst.collection.utils;

import org.springframework.stereotype.Component;

@Component
public class CommonMethods {

    // public ResponseEntity<Object> successResponse(Object data, Object pagination)
    // {
    // return ResponseEntity.status(HttpStatus.OK).body();
    // }

    // public ResponseEntity<Object> createdResponse(Object data, String message) {
    // return ResponseEntity.status(HttpStatus.CREATED)
    // .body(new ApiResponse(HttpStatus.CREATED, HttpStatus.CREATED.toString(),
    // data, message));
    // }

    // public ResponseEntity<Object> deletedResponse(String message) {
    // return ResponseEntity.status(HttpStatus.NO_CONTENT)
    // .body(new ApiResponse(HttpStatus.NO_CONTENT,
    // HttpStatus.NO_CONTENT.toString(), message));
    // }

    // public ResponseEntity<Object> notFoundResponse(String message) {
    // return ResponseEntity.status(HttpStatus.NOT_FOUND)
    // .body(new ApiResponse(HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND.toString(),
    // message));
    // }

    // public ResponseEntity<Object> errorResponse(HttpStatus status, String
    // message) {
    // return ResponseEntity.status(status)
    // .body(new ApiResponse(status, status.toString(), message));
    // }
}
