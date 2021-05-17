/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniloarantes.aula7java;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo Arantes <danilo at daniloarantes.com>
 */
public class Aluno {

    public void cadastrarAluno() {
        String a[] = new String[5];
        String m[] = {"Matemática", "Português", "Ciências", "Geografia", "Física"};

        System.out.println(a.length);

        for (int i = 0; i < a.length; i++) {
            a[i] = JOptionPane.showInputDialog("Nome do aluno " + i);
        }

        for (String aluno : a) {
            System.out.println(aluno);
        }

    }
    
    public void atividade1(){
        String disc[] = {"Português", "Matemática", "Física", "História", "Geografia"};
        double nota[] = new double[5];
        String result = "";
        
        for (int i = 0; i < disc.length; i++) {
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota de " + disc[i]));
            result += disc[i] + ": " + nota[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, result);
        
    }

}
