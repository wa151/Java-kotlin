package com.project;

public class Hello {
    public static void main(String[] args) {
        //基本Print語法
        System.out.println("Hello world");

        //將物件Person儲存在一個物件p中，建立new Person()到記憶體裡。
        //再呼叫Person(儲存在p了)hello方法
        Person p = new Person();
        p.hello();

        //基本資料型態(8大類)，定義資料前要將變數寫在前面，全部都是小寫
        //int 整數 32位元；short 短整數 16位元；long 長整數 64位元
        //float 浮點數 32位元(較低精確)(也可以在值得後面加上f/F)；double 浮點數 64位元(較高精確)
        //char 字元 16位元 ；byte 字元 8位元
        //boolean 布林值
        int age = 19 ;
        char c = '我';
        byte b = 123;
        double weight = 66.5;
        float height = 17.22f;

        //參照資料型態，第一個字是大寫
        //String 字串
    }
}
