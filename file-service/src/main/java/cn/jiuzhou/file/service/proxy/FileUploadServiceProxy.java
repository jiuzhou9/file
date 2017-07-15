package cn.jiuzhou.file.service.proxy;

import cn.jiuzhou.file.api.FileUploadServiceApi;
import cn.jiuzhou.file.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;

/**
 * Created by jiuzhou on 2017/7/15.
 */
public class FileUploadServiceProxy implements FileUploadServiceApi {

    @Autowired
    private FileUploadService fileUploadService;

    public void upload(String filename, InputStream data) {
        fileUploadService.upload(filename,data);
    }
}
