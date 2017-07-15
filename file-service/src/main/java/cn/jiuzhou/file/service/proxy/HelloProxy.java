package cn.jiuzhou.file.service.proxy;

import cn.jiuzhou.file.api.HelloApi;

/**
 * Created by jiuzhou on 2017/7/15.
 */
public class HelloProxy implements HelloApi {
    public String show() {
        return "hello";
    }
}
