package org.prog.poly.homework;

import javax.sound.midi.SysexMessage;

public class Android implements IPhone{
    @Override
    public void call() {
        System.out.println("Android can call");
    }

    @Override
    public void unlock() {
        System.out.println("Android can unlock");
    }
}
