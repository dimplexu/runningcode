package com.dimple.headfirst.singleton.chocolate;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // 查看getInstance内部怎么执行的
        ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
    }
}
