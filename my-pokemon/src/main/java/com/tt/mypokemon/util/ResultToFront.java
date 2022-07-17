package com.tt.mypokemon.util;

import lombok.Data;

@Data
public class ResultToFront <T>{
    private int code;
    private String message;
    private T data;
    public ResultToFront(){
        this(400,"fail");
    }
    public ResultToFront(int code, String message){
        this(code,message,null);
    }
    public ResultToFront(int code,String message,T data){
        this.code = code;
        this.message=message;
        this.data=data;
    }
    public static ResultToFront success(){
        return new ResultToFront(200,"success");
    }
    public static ResultToFront fail(){
        return new ResultToFront();
    }
}
