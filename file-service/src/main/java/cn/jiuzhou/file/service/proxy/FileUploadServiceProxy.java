package cn.jiuzhou.file.service.proxy;

import cn.jiuzhou.file.api.FileUploadServiceApi;
import cn.jiuzhou.file.common.Result;
import cn.jiuzhou.file.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;

/**
 * Created by jiuzhou on 2017/7/15.
 */
public class FileUploadServiceProxy implements FileUploadServiceApi {

    @Autowired
    private FileUploadService fileUploadService;

    public Result upload(String filename, InputStream data) {
        try {
            fileUploadService.upload(filename,data);
        } catch (Exception e) {
            //异常 上传失败
            e.printStackTrace();
            return Result.buildFailed("文件上传失败："+e.getMessage());
        }
        //上传成功
        return Result.buildSuccess();
    }
}
