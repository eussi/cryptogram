package com.eussi._01_jca_jce.securitypkg;

import org.junit.Test;

import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;

/**
 * Created by wangxueming on 2019/2/20.
 */
public class _06_AlgorithmParamters {

    @Test
    public void test() {
        //实例化
        try {
            AlgorithmParameters ap = AlgorithmParameters.getInstance("DES");
            //生成参数字节数组
            //19046533647688409466013通过AlgorithmParametersGenerator类得到，不能随意写
            ap.init(new BigInteger("19046533647688409466013").toByteArray());
            //获得参数字节数组
            byte[] b = ap.getEncoded();
            //打印字符串，
            System.out.println(new BigInteger(b).toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
