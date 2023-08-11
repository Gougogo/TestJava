package com.goumi.interfacemusic5;

import com.goumi.testclass.Note;

import static net.mindview.util.Print.print;

interface Instrucment{
    int VALUE = 5;
    void play(Note n);
    void adjust();
}

class Wind implements Instrucment{

    @Override
    public void play(Note n) {
        print(this+".play()" +n);
    }

    public String toString(){
        return "Wind";
    }

    @Override
    public void adjust(){
        print(this + ".adjust()");
    }
}

class Percussion implements Instrucment{

    @Override
    public void play(Note n) {
        print(this+ ".play()" +n);
    }

    public String toString(){
        return "Percussion";
    }

    @Override
    public void adjust() {
        print(this+".adjust()");
    }
}

class Stringed implements Instrucment{
    public void play(Note n){
        print(this + ".play()" + n);
    }

    public String toString(){
        return "Stringed";
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}

class Brass extends Wind{
    public String toString(){
        return "Brass";
    }
}

class Woodwind extends Wind{
    public String toString(){
        return "Woodwind";
    }
}

public class Music5 {
    static void tune(Instrucment i){
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrucment[] e){
        for (Instrucment i :e )
            tune(i);
    }

    public static void main(String[] args) {
        Instrucment[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }

}
