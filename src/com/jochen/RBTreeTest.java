package com.jochen;

import java.util.Scanner;

/**
 * Created by JoChen on 2020/6/1.
 *
 * @Description 红黑树测试
 */
public class RBTreeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RBTree<String, Object> rbt = new RBTree<>();
        while (true) {
            System.out.println("请输入key：");
            String key = scanner.next();
            System.out.println();
            rbt.insert(key, null);
            TreeOperation.show(rbt.getRoot());
        }
    }
}
