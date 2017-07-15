package cn.jiuzhou.file.test;

import cn.jiuzhou.file.api.HelloApi;
import com.caucho.hessian.client.HessianProxyFactory;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jiuzhou on 2017/7/15.
 */
public class HelloApiTest {
    public static HelloApi api;
    @Before
    public void setUp() throws Exception {
        api= (HelloApi) new HessianProxyFactory().create(HelloApi.class,"http://localhost:8080/api/helloApi");
    }

    @Test
    public void testHello(){
        String show = api.show();
        System.out.println(show);
    }
}
