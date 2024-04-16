/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.prueba_git_hub.pruebas_git_hub;

/**
 *
 * @author Sebastian
 */
public class Pruebas_git_hub {

    public static void main(String[] args) {
        try {
            System.out.println(utils.Utils.division(1, 0));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
