package cn.jiuzhou.file.service.impl;

import cn.jiuzhou.file.service.FileUploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.*;

/**
 * Created by jiuzhou on 2017/7/15.
 */
@Service
public class FileUploadServiceImpl implements FileUploadService {
    /*
    日志
     */
    protected final Logger log = LoggerFactory.getLogger(FileUploadServiceImpl.class);


    public void upload(String fileName, InputStream data) throws Exception{
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //获取客户端传递的InputStream
            bis = new BufferedInputStream(data);
            //创建文件输出流
            bos = new BufferedOutputStream(new FileOutputStream("E:/fileUpload/" + fileName));
            byte[] buffer = new byte[8192];
            int r = bis.read(buffer, 0, buffer.length);
            while (r > 0) {
                bos.write(buffer, 0, r);
                r = bis.read(buffer, 0, buffer.length);
            }
            log.info("-------文件上传成功！-------------");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
