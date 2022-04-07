package com.uin;

import com.uin.utils.MD5Util;
import org.junit.Test;

/**
 * @author wanglufei
 * @description: TODO
 * @date 2022/4/7/10:29 AM
 */
public class MyTest {
    @Test
    public void testMD5(){
        String md5 = MD5Util.getMD5("000000");
        System.out.println(md5);
    }
}
