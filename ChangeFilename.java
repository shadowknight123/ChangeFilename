package ChangeFilenam;

import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class ChangeFilename {
    public static void main(String[] args) {
        NumberFormat f = new DecimalFormat("000000");

        File file = new File("D:\\TestDir");
        File[] list = file.listFiles();

        // 如果目录下文件存在
        if (file.exists() && file.isDirectory()) {
            for (int i = 0; i < list.length; i++) {
                //取文件名字存入name中
                String name = list[i].getName();
                // 截取.之前的字符串出来
                int index = name.indexOf(".");
                // 截取.JPG出来
                int index2 = name.lastIndexOf(".");
                String name3 = name.substring(index2);
                // 拼接字符串
                String newName = "b"+f.format(i+1) + name3;
                //重命名
                File dest = new File("d:/TestDir" + "/" +newName);
                list[i].renameTo(dest);
                System.out.println(dest.getName());            }

        }

    }
}
