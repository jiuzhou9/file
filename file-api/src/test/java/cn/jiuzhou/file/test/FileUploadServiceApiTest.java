package cn.jiuzhou.file.test;

import cn.jiuzhou.file.api.FileUploadServiceApi;
import cn.jiuzhou.file.common.Result;
import com.alibaba.fastjson.JSON;
import com.caucho.hessian.client.HessianProxyFactory;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by jiuzhou on 2017/7/15.
 */
public class FileUploadServiceApiTest {
    public static FileUploadServiceApi api;
    @Before
    public void setUp() throws Exception {
        api= (FileUploadServiceApi) new HessianProxyFactory().create(FileUploadServiceApi.class,"http://localhost:8080/api/fileUploadServiceApi");
    }

    @Test
    public void uploadTest(){
        String fileName = "a.txt";
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("C:/Users/九州/Desktop/编辑1.TXT");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        Result upload = api.upload(fileName, bufferedInputStream);
        System.out.println(JSON.toJSONString(upload));
    }

    @Test
    public void test(){
        System.out.println(System.getProperties());
    }
}
