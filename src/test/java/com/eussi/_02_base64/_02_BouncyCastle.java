package com.eussi._02_base64;

import org.bouncycastle.util.encoders.Base64;
import org.junit.Test;

/**
 * Created by wangxueming on 2019/2/21.
 */
public class _02_BouncyCastle {
    @Test
    public void test() {
        try {
            String text = "密";
            byte[] textByte;
            textByte = text.getBytes("UTF-8");
            //编码
            byte[] encodeBytes = Base64.encode(textByte);
            String encodedText = new String(encodeBytes, "UTF-8");
            System.out.println(encodedText);
            //解码
            System.out.println(new String(Base64.decode(encodedText), "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
