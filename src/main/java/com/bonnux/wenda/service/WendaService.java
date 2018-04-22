package com.bonnux.wenda.service;

import org.springframework.stereotype.Service;

/**
 * Created by bonnux on 2018/3/10.
 */
@Service
public class WendaService {
    public String getMessage(int userId) {
        return "Hello Message:" + String.valueOf(userId);
    }
}
