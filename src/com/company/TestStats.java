package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class TestStats {

    HashMap<String, ArrayList> playerStats = new HashMap<String, ArrayList>();
    ArrayList pName = new ArrayList();
    ArrayList pRuns = new ArrayList();
    ArrayList pAvg = new ArrayList();
    BufferedReader br = new BufferedReader(new FileReader("test.csv"));

    public TestStats() throws IOException {
        String line = "";
        String splitBy = ",";
        while ((line = br.readLine()) != null) {
            String[] testRuns = line.split(splitBy);
            pName.add(testRuns[1]);
            pRuns.add(testRuns[6]);
            pAvg.add(testRuns[8]);
        }
    }

    public String returnPlayerName() {
        return (String) pName.get(0);
    }

    public ArrayList returnPlayerRuns() {
        return pRuns;
    }

    public ArrayList returnPlayerAvg() {
        return pAvg;
    }

    public void HashMap() {
        ArrayList p = new ArrayList();
        for (int i = 0; i < pName.size(); i++) {;
            p.add(pRuns.get(i));
            p.add(pAvg.get(i));
            playerStats.put((String)pName.get(i), p);
            p.clear();
        }

    }

    public HashMap returnHashMap() {
        return playerStats;
    }




}
