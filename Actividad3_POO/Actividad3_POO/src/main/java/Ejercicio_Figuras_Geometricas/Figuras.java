/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio_Figuras_Geometricas;

import Ejercicio_Capitulo6_Punto41.*;
import Ejercicio_Capitulo5_Punto40.*;
import Ejercicio_Capitulo3_Punto19.*;
import Ejercicio_Capitulo3_Punto18.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author g4t0l
 */
public class Figuras extends javax.swing.JFrame {

    /**
     * Creates new form informacion
     */
    public Figuras() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRadio = new javax.swing.JLabel();
        buttonCalcular = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        textRadio = new javax.swing.JTextField();
        labelBaseR = new javax.swing.JLabel();
        textBaseR = new javax.swing.JTextField();
        labelAlturaR = new javax.swing.JLabel();
        textAlturaR = new javax.swing.JTextField();
        labelLadoC = new javax.swing.JLabel();
        textLadoC = new javax.swing.JTextField();
        labelBaseT = new javax.swing.JLabel();
        textBaseT = new javax.swing.JTextField();
        labelAlturaT = new javax.swing.JLabel();
        textAlturaT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelRadio.setText("Radio circulo:");

        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });

        buttonLimpiar.setText("Limpiar");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        textRadio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textRadioFocusLost(evt);
            }
        });
        textRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRadioActionPerformed(evt);
            }
        });

        labelBaseR.setText("Base rectangulo:");

        textBaseR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textBaseRFocusLost(evt);
            }
        });
        textBaseR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBaseRActionPerformed(evt);
            }
        });

        labelAlturaR.setText("Altura rectangulo:");

        textAlturaR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textAlturaRFocusLost(evt);
            }
        });
        textAlturaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAlturaRActionPerformed(evt);
            }
        });

        labelLadoC.setText("Lado cuadrado:");

        textLadoC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textLadoCFocusLost(evt);
            }
        });
        textLadoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLadoCActionPerformed(evt);
            }
        });

        labelBaseT.setText("Base triangulo:");

        textBaseT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textBaseTFocusLost(evt);
            }
        });
        textBaseT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBaseTActionPerformed(evt);
            }
        });

        labelAlturaT.setText("Altura triangulo:");

        textAlturaT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textAlturaTFocusLost(evt);
            }
        });
        textAlturaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAlturaTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelBaseT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textBaseT, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelAlturaT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textAlturaT, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelBaseR)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textBaseR, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelAlturaR)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textAlturaR, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(labelRadio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addComponent(labelLadoC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCalcular)
                .addGap(72, 72, 72)
                .addComponent(buttonLimpiar)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRadio)
                    .addComponent(textRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBaseR)
                    .addComponent(textBaseR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAlturaR)
                    .addComponent(textAlturaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLadoC)
                    .addComponent(textLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBaseT)
                    .addComponent(textBaseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAlturaT)
                    .addComponent(textAlturaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCalcular)
                    .addComponent(buttonLimpiar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed
        try{
            Circulo figura1 = new Circulo(Integer.parseInt(textRadio.getText()));
            Rectangulo figura2 = new Rectangulo(Integer.parseInt(textBaseR.getText()),Integer.parseInt(textAlturaR.getText()));
            Cuadrado figura3 = new Cuadrado(Integer.parseInt(textLadoC.getText()));
            TrianguloRectangulo figura4 = new TrianguloRectangulo(Integer.parseInt(textBaseT.getText()),Integer.parseInt(textAlturaT.getText()));
            
            JOptionPane.showMessageDialog(null,"El area del circulo es: "+figura1.calcularArea()+"\nEl perimetro del circulo es: "+figura1.calcularPerimetro()+"\n------------------\n"+"El area del rectangulo es: "+figura2.calcularArea()+"\nEl perimetro del rectangulo es: "+figura2.calcularPerimetro()+"\n------------------\n"+"El area del cuadrado es: "+figura3.calcularArea()+"\nEl perimetro del cuadrado es: "+figura3.calcularPerimetro()+"\n------------------\n"+"El area del triangulo es: "+figura4.calcularArea()+"\nEl perimetro del triangulo es: "+figura4.calcularPerimetro()+"\nEl tipo de triangulo es: "+figura4.determinarTipoTriangulo()+"\n------------------\n");
        }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Ingresar solo caracteres numericos");
        }
    }//GEN-LAST:event_buttonCalcularActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        textRadio.setText("");
        textBaseR.setText("");
        textAlturaR.setText("");
        textLadoC.setText("");
        textAlturaT.setText("");
        textBaseT.setText("");
    }//GEN-LAST:event_buttonLimpiarActionPerformed
   
    private void textRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRadioActionPerformed

    private void textRadioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textRadioFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textRadioFocusLost

    private void textBaseRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textBaseRFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textBaseRFocusLost

    private void textBaseRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBaseRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBaseRActionPerformed

    private void textAlturaRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textAlturaRFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textAlturaRFocusLost

    private void textAlturaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAlturaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAlturaRActionPerformed

    private void textLadoCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textLadoCFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textLadoCFocusLost

    private void textLadoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLadoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLadoCActionPerformed

    private void textBaseTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textBaseTFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textBaseTFocusLost

    private void textBaseTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBaseTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBaseTActionPerformed

    private void textAlturaTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textAlturaTFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textAlturaTFocusLost

    private void textAlturaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAlturaTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAlturaTActionPerformed
public static class Circulo {
        int radio;
        Circulo(int radio) {
            this.radio = radio;
        }
        double calcularArea() {
            return Math.PI*Math.pow(radio,2);
        }
        double calcularPerimetro() {
            return 2*Math.PI*radio;
        }
    }
    public static class Rectangulo {
        int base;
        int altura;
        Rectangulo(int base, int altura) {
            this.base = base;
            this.altura = altura;
        }
        double calcularArea() {
            return base * altura;
        }
        double calcularPerimetro() {
            return (2 * base) + (2 * altura);
        }
    }
    public static class Cuadrado {
        int lado;
        public Cuadrado(int lado) {
            this.lado = lado;
        }
        double calcularArea() {
            return lado*lado;
        }
        double calcularPerimetro() {
            return (4*lado);
        }
    }
    public static class TrianguloRectangulo {
        int base;
        int altura;
        public TrianguloRectangulo(int base, int altura) {
            this.base = base;
            this.altura = altura;
        }
        double calcularArea() {
            return (base * altura / 2);
        }
        double calcularPerimetro() {
            return (base + altura + calcularHipotenusa());
        }
        double calcularHipotenusa() {
            return Math.pow(base*base + altura*altura, 0.5);
        }
        String determinarTipoTriangulo() {
            if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())) 
                return "un triángulo equilatero";
            else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
                return "un triangulo escaleno";
            else
                return "un triangulo isósceles";
            }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Figuras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JLabel labelAlturaR;
    private javax.swing.JLabel labelAlturaT;
    private javax.swing.JLabel labelBaseR;
    private javax.swing.JLabel labelBaseT;
    private javax.swing.JLabel labelLadoC;
    private javax.swing.JLabel labelRadio;
    private javax.swing.JTextField textAlturaR;
    private javax.swing.JTextField textAlturaT;
    private javax.swing.JTextField textBaseR;
    private javax.swing.JTextField textBaseT;
    private javax.swing.JTextField textLadoC;
    private javax.swing.JTextField textRadio;
    // End of variables declaration//GEN-END:variables
}
