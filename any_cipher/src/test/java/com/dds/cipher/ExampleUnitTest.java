package com.dds.cipher;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        // assertEquals(4, 2 + 2);

        Md5Cipher javaMd5 = new Md5Cipher();
        String s = javaMd5.Md5("111111");

        System.out.println("md5 16:" + s.substring(8, 24));
        System.out.println("md5 32:" + s);


        String s2 = javaMd5.Md5Twice("123456");
        System.out.println("md5 twice 16:" + s2.substring(8, 24));
        System.out.println("md5 twice 32:" + s2);
    }

    @Test
    public void aes() {
    }
}