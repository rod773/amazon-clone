package com.amazonclone.amazonclonebackend.exception;

public class ResponseMessage {
    private String message;

    public ResponseMessage(String message){
        this.message=message;
    }

    public String getMessage()
    {
        return message;
    }
}
