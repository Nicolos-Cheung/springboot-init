package com.zn.springbootdemo.utils;

import com.google.common.base.Strings;

/**
 * @author wei.yang on 2017/12/21
 */
public class IpUtil {

    private static final String IP_REGEX = "^\\d{1,3}(\\.\\d{1,3}){3}$";

    /**
     * ip判断
     *
     * @param ip ip
     * @return 是否匹配
     */
    public static boolean match(String ip) {
        return !Strings.isNullOrEmpty(ip) && ip.matches(IP_REGEX);
    }

    /**
     * 如果存在则判断是不是符合规则
     *
     * @param ip ip
     * @return 是否匹配
     */
    public static boolean matchIfExist(String ip) {
        return Strings.isNullOrEmpty(ip) || ip.matches(IP_REGEX);
    }
}
