package com.bonnux.wenda.model;

import org.springframework.stereotype.Component;

@Component
public class HostHolder {
    //每个线程都有一份拷贝，在不同的内存空间
    private static ThreadLocal<User> users = new ThreadLocal<User>();

    //根据当前的线程，获取当前线程的user，相当于一个Map<ThreadId,User>
    public User getUser() {
        return users.get();
    }

    public void setUser(User user) {
        users.set(user);
    }

    public void clear() {
        users.remove();
    }
}
