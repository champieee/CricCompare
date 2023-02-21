package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ODIStats {
    HashMap<String, ArrayList<String>> playerStats = new HashMap<>();
    ArrayList<String> pName = new ArrayList<>();
    ArrayList<String> pRuns = new ArrayList<>();
    ArrayList<String> pAvg = new ArrayList<>();
    BufferedReader br = new BufferedReader(new FileReader("ODI data.csv"));

    public ODIStats() throws IOException {
        String line;
        String splitBy = ",";
        while ((line = br.readLine()) != null) {
            String[] testRuns = line.split(splitBy);
            pName.add(testRuns[1]);
            pRuns.add(testRuns[6]);
            pAvg.add(testRuns[8]);
        }
    }

    public void HashMap() {
        for (int i = 0; i < pName.size(); i++) {
            ArrayList<String> p = new ArrayList<>();
            p.add(0, pRuns.get(i));
            p.add(1, pAvg.get(i));
            playerStats.put(pName.get(i), p);
        }

    }

    public HashMap<String, ArrayList<String>> returnHash() {
        return playerStats;
    }

}

