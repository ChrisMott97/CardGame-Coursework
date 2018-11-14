package com.exeter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Card> cards = new ArrayList<>();
    List<Player> players = new ArrayList<>();

    public Game(int numPlayers, File packFile){
        try(BufferedReader br = new BufferedReader(new FileReader(packFile))){
            String line = br.readLine();

            while (line != null){
                cards.add(new Card(Integer.parseInt(line)));
                line = br.readLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}