package com.nowcoder.community;

import java.io.IOException;

public class WkTests {

    public static void main(String[] args) {
        String cmd = "e:/Work/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://tieba.baidu.com/p/7865643961 e:/Work/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
