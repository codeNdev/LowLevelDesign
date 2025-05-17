package designProblems.chessDesign.core;

import designProblems.chessDesign.pieces.Colour;

public class Player {
    public Colour colour;
    public String name;
    public Player(String name,Colour colour){
        this.name=name;
        this.colour=colour;
    }
}