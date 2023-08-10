package com.workintech.main;

import com.workintech.RPG.Monster;
import com.workintech.RPG.Troll;

public class Main {
    public static void main(String[] args) {
        Monster troll = new Troll("Pikachu", 300, 30);
        System.out.println(troll.attack());
    }
}
