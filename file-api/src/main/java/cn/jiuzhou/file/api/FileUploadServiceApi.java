package cn.jiuzhou.file.api;

import cn.jiuzhou.file.common.Result;

import java.io.InputStream;
/**
 * Created by jiuzhou on 2017/7/14.
 */
public interface FileUploadServiceApi {
    /**
     * 文件上传
     * @param filename 文件名
     * @param data 文件数据
     */
    public Result upload(String filename, InputStream data);
}

