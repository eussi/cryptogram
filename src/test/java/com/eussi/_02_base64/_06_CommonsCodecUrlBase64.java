package com.eussi._02_base64;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

/**
 * Created by wangxueming on 2019/2/21.
 */
public class _06_CommonsCodecUrlBase64 {
    @Test
    public void test() {
        try {
            String text = "密";
            byte[] textByte;
            textByte = text.getBytes("GBK");
            //编码
            byte[] encodeBytes = Base64.encodeBase64URLSafe(textByte);
            String encodedText = new String(encodeBytes, "GBK");
            System.out.println(encodedText);
            //解码
            System.out.println(new String(Base64.decodeBase64(encodedText), "GBK"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
