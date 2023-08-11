package com.goumi.exception_;

/**
 * @version 1.0
 * @auther GouMi
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "韩顺平";
            //int a = Integer.parseInt(str);
            System.out.println("数字：" + str);
        } catch (NumberFormatException e) {
            System.out.println("异常信息=" + e.getMessage());
        } finally {
            System.out.println("不需要处理");
        }

        System.out.println("往下执行");
    }

}
