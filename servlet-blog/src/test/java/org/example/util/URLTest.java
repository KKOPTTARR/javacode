package org.example.util;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

public class URLTest {

    @Test
    public void test() throws UnsupportedEncodingException {
        URL url = URLTest.class.getClassLoader()
                .getResource("中文/随便.txt");
        System.out.println(url.getPath());
        String path = URLDecoder.decode(url.getPath(), "UTF-8");
        System.out.println(path);
    }
}
