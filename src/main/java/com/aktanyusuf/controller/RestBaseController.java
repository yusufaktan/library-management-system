package com.aktanyusuf.controller;

import com.aktanyusuf.model.RootEntity;

public class RestBaseController {

    public <T> RootEntity<T> ok(T data){
        return RootEntity.ok(data);
    }

    public <T> RootEntity<T> error(String errorMessage){
        return RootEntity.error(errorMessage);
    }

}
