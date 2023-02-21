package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        TestStats p = new TestStats();
        System.out.println(p.returnPlayerName());
        System.out.println(p.returnPlayerRuns());
        System.out.println(p.returnPlayerAvg());
        p.HashMap();
        HashMap<String, ArrayList> playerStats = p.returnHashMap();
        System.out.println(playerStats.get("VD Philander (SA)"));
    }
}
