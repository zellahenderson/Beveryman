package com.nmckinley.beveryman;

/**
 * Created by Zella on 2/9/2015.
 */
public class DrinkMaker {

    protected static void makeDrink(int id) {
        getDrinkInstructionsById(id);
        //TODO: pass instructions to arduino over bluetooth
    }

    private static void getDrinkInstructionsById(int id) {
        //TODO: decide on format for bluetooth communication
        //TODO: write instructions per drink for arduino
    }
}
