package org.example;

import Servicios.MenuServicio;

public class Main {
    public static void main(String[] args) {




                MenuServicio servicios = new MenuServicio();

                try {
                    servicios.Menu();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }

