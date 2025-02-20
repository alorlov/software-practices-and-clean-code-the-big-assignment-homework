package com.devsmanship;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        if(args.length == 0) {
            System.out.println("NO ACTION");
            return;
        }
        String action = args[0];

        if(action.equals("report")) {
            new Start().start();
        } else {
            if(action.equals("save")) {
                new CarService().save();
            } else {
                System.out.println("The action is NoT VALID!!");
            }
        }
    }
}
