package com.javatechie.utils;

import com.javatechie.entity.BaseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.sql.Timestamp;

public class DataUtils {
    private DataUtils(){}
    public static String getUserCurrent(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = null;
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            currentUserName = authentication.getName();
        }
        return currentUserName;
    }

    public static BaseEntity buildBaseEntity(){
        Timestamp sysDate = new Timestamp(System.currentTimeMillis());
        String userCurrent = getUserCurrent();
        return BaseEntity.builder()
                .created_by(userCurrent)
                .created_date(sysDate)
                .updated_by(userCurrent)
                .updated_date(sysDate).build();
    }
}
