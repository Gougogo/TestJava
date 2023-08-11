package com.goumi.interfacetest;

import com.goumi.testclass.Note;

import static net.mindview.util.Print.print;

abstract class Instrument{
    private int i;
    public abstract void play(Note n);
    public String what(){
        return "Instrument";
    }
    public abstract void adjust();
}

class Wind extends Instrument{

    @Override
    public void play(Note n) {
        print("Wind.play()" + n);
    }

    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {

    }
}

class Percussion extends Instrument{

    @Override
    public void play(Note n) {
        print("Percussion.play()" + n);
    }

    public String what(){
        return "Percussion";
    }

    @Override
    public void adjust() {

    }
}

class Stringed extends Instrument{

    @Override
    public void play(Note n) {
        print("Stringed.play()"+n);
    }

    public String what(){
        return "Stringed";
    }

    @Override
    public void adjust() {

    }
}

class Brass extends Wind{
    public void play(Note n){
        print("Brass.play()" + n);
    }
    public void adjust(){
        print("Brass.adjust()");
    }
}

class Woodwind extends Wind{
    public void play(Note n){
        print("Woodwind.play()" + n);
    }

    public String what(){
        return "Woodwind";
    }
}

public class Music4 {
    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e){
        for(Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra ={
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}