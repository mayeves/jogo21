/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        Carta carta = new Carta();
        carta.setNaipe("copas");
        System.out.println("Naipe: "+carta.naipe);
    }
}
