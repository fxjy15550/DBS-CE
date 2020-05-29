package com.dbs.ce.util;

public class StringCheckUtil {
    public static boolean checkIsEmpty(String str) {
        return (str == null || "".equals(str.trim()));
    }

    public static boolean checkPwdStr(String passwordStr) {
        if (checkIsEmpty(passwordStr))
            return false;
        return true;
    }
}