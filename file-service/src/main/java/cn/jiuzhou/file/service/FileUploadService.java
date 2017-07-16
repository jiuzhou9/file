package cn.jiuzhou.file.service;

import java.io.InputStream;

/**
 * Created by jiuzhou on 2017/7/15.
 */
public interface FileUploadService {
    /**
     * 文件上传
     * @param fileName 文件名
     * @param data 文件数据
     */
    public void upload(String fileName,InputStream data)throws Exception;
}
