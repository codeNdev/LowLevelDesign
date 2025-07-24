package designProblems.TicTacToe.enums;

public enum Symbol {
    X(0),O(1),EMPTY(2);
    int value;
    private Symbol(int value){
        this.value=value;
    }
    public int getValue() {
        return value;
    }

}
