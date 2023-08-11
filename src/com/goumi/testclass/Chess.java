package com.goumi.testclass;

import static net.mindview.util.Print.print;

class Game{
}

class BoardGame extends Game{
    BoardGame(int i){
        print("BoardGame Constructor1");
    }

    BoardGame(int i, String t){
        print("BoardGame Constructor2");
    }
}

public class Chess extends BoardGame{

    private Chess() {
        super(11, "sd");
        print("chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
