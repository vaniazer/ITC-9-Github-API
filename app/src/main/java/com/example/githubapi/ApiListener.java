package com.example.githubapi;

public interface ApiListener<T> {
    void onSuccess(T users);
    void onFailed(String msg);
}
