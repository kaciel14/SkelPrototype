/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skelprototype;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java_cup.runtime.Symbol;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import skelprototype.TablaSimbolos.Variable;


public class vista extends javax.swing.JFrame {

    TablaSimbolos ts;

    public vista() {
        initComponents();
        setLocationRelativeTo(null);
        ts= new TablaSimbolos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaCodigo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        botonAbrir = new javax.swing.JButton();
        panelSemantico = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaSemantico = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        botonAnalizarSm = new javax.swing.JButton();
        botonLimpiarSm = new javax.swing.JButton();
        panelSintactico = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaSintactico = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        botonAnalizarS = new javax.swing.JButton();
        botonLimpiarS = new javax.swing.JButton();
        panelLexico = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaLexico = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        botonAnalizarL = new javax.swing.JButton();
        botonLimpiarL = new javax.swing.JButton();
        btnLimpiarAreaTexto = new javax.swing.JButton();
        btnLimpiarTabla = new javax.swing.JButton();
        numRows = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SkelPrototype");

        areaCodigo.setColumns(20);
        areaCodigo.setLineWrap(true);
        areaCodigo.setRows(5);
        jScrollPane1.setViewportView(areaCodigo);

        jLabel1.setText("Código");

        botonAbrir.setText("Abrir Archivo");
        botonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbrirActionPerformed(evt);
            }
        });

        panelSemantico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        areaSemantico.setEditable(false);
        areaSemantico.setColumns(20);
        areaSemantico.setRows(5);
        jScrollPane2.setViewportView(areaSemantico);

        jLabel2.setText("Semántico");

        botonAnalizarSm.setText("Analizar");
        botonAnalizarSm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnalizarSmActionPerformed(evt);
            }
        });

        botonLimpiarSm.setText("Limpiar");
        botonLimpiarSm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarSmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSemanticoLayout = new javax.swing.GroupLayout(panelSemantico);
        panelSemantico.setLayout(panelSemanticoLayout);
        panelSemanticoLayout.setHorizontalGroup(
            panelSemanticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSemanticoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSemanticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSemanticoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSemanticoLayout.createSequentialGroup()
                        .addComponent(botonLimpiarSm)
                        .addGap(19, 19, 19))))
            .addGroup(panelSemanticoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(botonAnalizarSm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68))
            .addGroup(panelSemanticoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSemanticoLayout.setVerticalGroup(
            panelSemanticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSemanticoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(botonLimpiarSm)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(botonAnalizarSm)
                .addContainerGap())
        );

        panelSintactico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        areaSintactico.setEditable(false);
        areaSintactico.setColumns(20);
        areaSintactico.setRows(5);
        jScrollPane3.setViewportView(areaSintactico);

        jLabel3.setText("Sintáctico");

        botonAnalizarS.setText("Analizar");
        botonAnalizarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnalizarSActionPerformed(evt);
            }
        });

        botonLimpiarS.setText("Limpiar");
        botonLimpiarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSintacticoLayout = new javax.swing.GroupLayout(panelSintactico);
        panelSintactico.setLayout(panelSintacticoLayout);
        panelSintacticoLayout.setHorizontalGroup(
            panelSintacticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSintacticoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(botonAnalizarS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSintacticoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSintacticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSintacticoLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSintacticoLayout.createSequentialGroup()
                        .addComponent(botonLimpiarS)
                        .addGap(19, 19, 19))))
            .addGroup(panelSintacticoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSintacticoLayout.setVerticalGroup(
            panelSintacticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSintacticoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(botonLimpiarS)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(botonAnalizarS)
                .addContainerGap())
        );

        panelLexico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        areaLexico.setEditable(false);
        areaLexico.setColumns(20);
        areaLexico.setRows(5);
        jScrollPane4.setViewportView(areaLexico);

        jLabel4.setText("Léxico");

        botonAnalizarL.setText("Analizar");
        botonAnalizarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnalizarLActionPerformed(evt);
            }
        });

        botonLimpiarL.setText("Limpiar");
        botonLimpiarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLexicoLayout = new javax.swing.GroupLayout(panelLexico);
        panelLexico.setLayout(panelLexicoLayout);
        panelLexicoLayout.setHorizontalGroup(
            panelLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLexicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLexicoLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLexicoLayout.createSequentialGroup()
                        .addComponent(botonLimpiarL)
                        .addGap(19, 19, 19))))
            .addGroup(panelLexicoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(botonAnalizarL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68))
            .addGroup(panelLexicoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLexicoLayout.setVerticalGroup(
            panelLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLexicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonLimpiarL)
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(botonAnalizarL)
                .addContainerGap())
        );

        btnLimpiarAreaTexto.setText("Limpiar");
        btnLimpiarAreaTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAreaTextoActionPerformed(evt);
            }
        });

        btnLimpiarTabla.setText("Limpiar tabla");
        btnLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTablaActionPerformed(evt);
            }
        });

        numRows.setText("Filas: ");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(botonAbrir)
                                        .addGap(32, 32, 32)
                                        .addComponent(btnLimpiarAreaTexto))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(numRows)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiarTabla)
                                .addGap(34, 34, 34))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)))
                .addComponent(panelLexico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelSemantico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelSemantico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAbrir)
                            .addComponent(btnLimpiarAreaTexto))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiarTabla)
                            .addComponent(numRows))
                        .addGap(13, 13, 13))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelLexico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAbrirActionPerformed

    private void botonAnalizarSmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnalizarSmActionPerformed
        numRows.setText("Filas: " + areaCodigo.getLineCount()); 
        String id = "";
        String tipo = "";
        Object valor = null;
        String lastIdAdded = "";
        MyTokens tipoUltimoValor = null;
        boolean asigna = false;
        
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(areaCodigo.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }
        
        Reader lector = null;
        
        try {
            lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexico lexer = new Lexico(lector);
            String resultado = "";
            while (true) {
                
               
                MyTokens tokens = lexer.yylex();
                MyTokens tipoOperacion = tokens;
                
                while(valor != null){
                    switch(tokens){
                        
                        case Suma: case Resta: case Multiplicacion:
                            tokens = lexer.yylex();
                            
                            if(tipoUltimoValor.equals(MyTokens.Numero)){
                                if(tokens.equals(MyTokens.Numero)){
                                    valor = calcularEntero(tipoOperacion, Integer.valueOf(String.valueOf(valor)), Integer.valueOf(lexer.lexeme));
                                }else if(tokens.equals(MyTokens.NumeroDecimal)){
                                    valor = calcularDecimal(tipoOperacion, Integer.valueOf(String.valueOf(valor)), Float.valueOf(lexer.lexeme));
                                }else if(tokens.equals(MyTokens.Identificador)){
                                    if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.Numero)){
                                        valor = calcularEntero(tipoOperacion, Integer.valueOf(String.valueOf(valor)), Integer.valueOf(String.valueOf(ts.get(lexer.lexeme).valor)));
                                    }else if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.NumeroDecimal)){
                                        valor = calcularDecimal(tipoOperacion, Integer.valueOf(String.valueOf(valor)), Float.valueOf(String.valueOf(ts.get(lexer.lexeme).valor)));
                                    }
                                }else if(tokens.equals(MyTokens.Texto)){
                                    valor = concatena(String.valueOf(valor), lexer.lexeme);
                                }
                            }else if(tipoUltimoValor.equals(MyTokens.NumeroDecimal)){
                                if(tokens.equals(MyTokens.Numero)){
                                    valor = calcularDecimal(tipoOperacion, Float.valueOf(String.valueOf(valor)), Integer.valueOf(lexer.lexeme));
                                }else if(tokens.equals(MyTokens.NumeroDecimal)){
                                    valor = calcularDecimal(tipoOperacion, Float.valueOf(String.valueOf(valor)), Float.valueOf(lexer.lexeme));
                                }else if(tokens.equals(MyTokens.Identificador)){
                                    if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.Numero)){
                                        valor = calcularDecimal(tipoOperacion, Float.valueOf(String.valueOf(valor)), Integer.valueOf(String.valueOf(ts.get(lexer.lexeme).valor)));
                                    }else if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.NumeroDecimal)){
                                        valor = calcularDecimal(tipoOperacion, Float.valueOf(String.valueOf(valor)), Float.valueOf(String.valueOf(ts.get(lexer.lexeme).valor)));
                                    }
                                }
                            }else if(tipoUltimoValor.equals(MyTokens.Texto)){
                                if(tokens.equals(MyTokens.Texto)){
                                    valor = concatena(String.valueOf(valor), lexer.lexeme);
                                }else if(tokens.equals(MyTokens.NumeroDecimal)){
                                    valor = concatena(String.valueOf(valor), lexer.lexeme);
                                }else if(tokens.equals(MyTokens.Numero)){
                                    valor = concatena(String.valueOf(valor), lexer.lexeme);
                                }else if(tokens.equals(MyTokens.Identificador)){
                                    if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.Texto)){
                                        valor = concatena(String.valueOf(valor), String.valueOf(ts.get(lexer.lexeme).valor));
                                    }else if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.NumeroDecimal)){
                                        valor = concatena(String.valueOf(valor), String.valueOf(ts.get(lexer.lexeme).valor));
                                    }else if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.Numero)){
                                        valor = concatena(String.valueOf(valor), String.valueOf(ts.get(lexer.lexeme).valor));
                                    }
                                }
                            }  
                            
                            break;
                            
                        case Division:
                            tokens = lexer.yylex();
                            if(tipoUltimoValor.equals(MyTokens.Numero)){
                                if(tokens.equals(MyTokens.Numero)){
                                    valor = calcularDecimal(tipoOperacion, Integer.valueOf(String.valueOf(valor)), Integer.valueOf(lexer.lexeme));
                                }else if(tokens.equals(MyTokens.NumeroDecimal)){
                                    valor = calcularDecimal(tipoOperacion, Integer.valueOf(String.valueOf(valor)), Float.valueOf(lexer.lexeme));
                                }else if(tokens.equals(MyTokens.Identificador)){
                                    if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.Numero)){
                                        valor = calcularDecimal(tipoOperacion, Integer.valueOf(String.valueOf(valor)), Integer.valueOf(String.valueOf(ts.get(lexer.lexeme).valor)));
                                    }else if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.NumeroDecimal)){
                                        valor = calcularDecimal(tipoOperacion, Integer.valueOf(String.valueOf(valor)), Float.valueOf(String.valueOf(ts.get(lexer.lexeme).valor)));
                                    }
                                }
                            }else if(tipoUltimoValor.equals(MyTokens.NumeroDecimal)){
                                if(tokens.equals(MyTokens.Numero)){
                                    valor = calcularDecimal(tipoOperacion, Float.valueOf(String.valueOf(valor)), Integer.valueOf(lexer.lexeme));
                                }else if(tokens.equals(MyTokens.NumeroDecimal)){
                                    valor = calcularDecimal(tipoOperacion, Float.valueOf(String.valueOf(valor)), Float.valueOf(lexer.lexeme));
                                }else if(tokens.equals(MyTokens.Identificador)){
                                    if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.Numero)){
                                        valor = calcularDecimal(tipoOperacion, Float.valueOf(String.valueOf(valor)), Integer.valueOf(String.valueOf(ts.get(lexer.lexeme).valor)));
                                    }else if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.NumeroDecimal)){
                                        valor = calcularDecimal(tipoOperacion, Float.valueOf(String.valueOf(valor)), Float.valueOf(String.valueOf(ts.get(lexer.lexeme).valor)));
                                    }
                                }
                            }
                            
                            break;
                            
                        case FinDeLinea:
                            try{
                                if(ts.isContained(ts.os.aux)){
                                ts.get(ts.os.aux).setValue(valor);
                                resultado += "Se añadió valor --> "+ts.get(ts.os.aux).toString();
                            }else if(ts.getLast().id.equals(lastIdAdded)){
                                ts.getLast().setValue(valor);
                                resultado += "Se añadió valor --> "+ts.getLast().toString();
                            }
                            }catch(Exception ex){
                                //JOptionPane.showMessageDialog(null, "Tipo de dato erroneo. " + ex.getMessage());
                                reset();
                            }
                            
                            valor=null;
                            break;
                            
                            
                        case Relacional: case AND: case OR:
                            
                            String relacional = lexer.lexeme; 
                            tokens = lexer.yylex();
                            
                            if(tipoUltimoValor.equals(MyTokens.TrueFalse)){
                                if(tokens.equals(MyTokens.TrueFalse)){
                                    valor = calcularBool(relacional, Boolean.valueOf(String.valueOf(valor)), Boolean.valueOf(lexer.lexeme));
                                    resultado += "El resultado de la operación \nbooleana fue: " + valor +"\n\n";
                                    if(valor.equals(false)){
                                        while(!tokens.equals(MyTokens.LlaveCierre)){
                                            tokens = lexer.yylex();
                                        }
                                    }
                                    valor = null;
                                }/*else if(tokens.equals(MyTokens.Identificador)){
                                    if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.Numero)){
                                        valor = calcularDecimal(tipoOperacion, Integer.valueOf(String.valueOf(valor)), Integer.valueOf(String.valueOf(ts.get(lexer.lexeme).valor)));
                                    }else if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.NumeroDecimal)){
                                        valor = calcularDecimal(tipoOperacion, Integer.valueOf(String.valueOf(valor)), Float.valueOf(String.valueOf(ts.get(lexer.lexeme).valor)));
                                    }
                                }*/
                            }else if(tipoUltimoValor.equals(MyTokens.Numero)){
                                if(tokens.equals(MyTokens.Numero)){
                                    valor = calcularBool(relacional, Integer.valueOf(String.valueOf(valor)), Integer.valueOf(lexer.lexeme));
                                    resultado += "El resultado de la operación \nbooleana fue: " + valor +"\n\n";
                                    if(valor.equals(false)){
                                        while(!tokens.equals(MyTokens.LlaveCierre)){
                                            tokens = lexer.yylex();
                                        }
                                    }
                                    valor = null;
                                }/*else if(tokens.equals(MyTokens.NumeroDecimal)){
                                    valor = calcularDecimal(tipoOperacion, Float.valueOf(String.valueOf(valor)), Float.valueOf(lexer.lexeme));
                                }else if(tokens.equals(MyTokens.Identificador)){
                                    if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.Numero)){
                                        valor = calcularDecimal(tipoOperacion, Float.valueOf(String.valueOf(valor)), Integer.valueOf(String.valueOf(ts.get(lexer.lexeme).valor)));
                                    }else if(ts.get(lexer.lexeme).getTokenTipoValor().equals(MyTokens.NumeroDecimal)){
                                        valor = calcularDecimal(tipoOperacion, Float.valueOf(String.valueOf(valor)), Float.valueOf(String.valueOf(ts.get(lexer.lexeme).valor)));
                                    }
                                }*/
                            }
                            
                            break;
                    }

                    tokens = lexer.yylex();
                    tipoOperacion = tokens;
                    
                }
                
                //MyTokens tokens = lexer.yylex();
                if (tokens == null) {
                    areaSemantico.setText(resultado);
                    return;
                }
                //System.out.println(tokens);
                switch (tokens) {
                    case Numero: case NumeroDecimal: case Texto:
                        valor = lexer.lexeme;
                        tipoUltimoValor = tokens;
                        asigna = false;
                        break;
                    case TrueFalse:
                        valor = lexer.lexeme;
                        tipoUltimoValor = tokens;
                        break;
                    case Entero:
                        tipo = lexer.yytext();
                        break;
                    case Decimal:
                        tipo = lexer.yytext();
                        break;
                    case Booleano:
                        tipo = lexer.yytext();
                        break;
                    case Caracter:
                        tipo = lexer.yytext();
                        break;
                    case Cadena:
                        tipo = lexer.yytext();
                        break;
                    /*case If:
                        tipo = lexer.yytext();
                        break;*/
                    case Identificador:
                        id = lexer.lexeme;
                        
                        if(tipo == ""){
                            if(asigna){
                                
                                valor = ts.get(id).valor;
                                tipoUltimoValor = ts.get(id).getTokenTipoValor();
                                asigna = false;
//                                ts.os.ids.add(ts.os.aux);
//                                ts.os.ids.add(id);
//
//                                ts.get(ts.os.aux).setValue(ts.get(id).valor);
//                                resultado += "Valor actualizado "+ts.get(ts.os.aux).toString();

                            }else{
                                if(ts.os.ids.isEmpty()){
                                    ts.os.aux = id;
                                }else{
                                    ts.os.aux = id;
                                    ts.os.ids.pop();
                                }
                            }
                            id="";
                            
                        }else{
                            if(ts.isContained(id)){
                                resultado += "No se añadió "+id+" , ya existe.\n";
                                ts.os.aux = id;
                            }else{
                                
                                ts.add(id, tipo);
                                resultado += "Se añadió "+ts.getLast().toString();
                                ts.os.aux = id;

                            }
                            lastIdAdded = id;
                            id = "";
                            tipo = "";
                            
                        }
                        break;
                    case Asigna:
                        asigna = true;
                        break;
                        
                    case Suma: case Resta: case Division: case Multiplicacion:
                        ts.os.symbols.add(lexer.lexeme);
                        break;
                    case Relacional: case OR: case AND:
                        ts.os.symbols.add(lexer.lexeme);
                        break;
                    case FinDeLinea:
                        
                        break;
                }
                
                
            }
            
         
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException ex) {
            System.out.println("Error de entrada");
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Tipo de dato erroneo. " + ex.getMessage());
            reset();
        }
        finally{
            new VentanaTb();
        }
        
        
        
        
    }//GEN-LAST:event_botonAnalizarSmActionPerformed
    
    public int calcularEntero(MyTokens mt, int a, int b){
        int operacion = 0;
        switch(mt){
            case Suma:
                operacion = a + b;
                break;
            case Resta:
                operacion = a - b;
                break;
            case Multiplicacion:
                operacion = a * b;
                break;
        }
        
        return operacion;
    }
    
    public float calcularDecimal(MyTokens mt, float a, int b){
        float operacion = 0;
        switch(mt){
            case Suma:
                operacion = a + b;
                break;
            case Resta:
                operacion = a - b;
                break;
            case Multiplicacion:
                operacion = a * b;
                break;
            case Division:
                operacion = a/b;                
                break;
        }
        
        return operacion;
    }
    
    public float calcularDecimal(MyTokens mt, int a, float b){
        float operacion = 0;
        switch(mt){
            case Suma:
                operacion = a + b;
                break;
            case Resta:
                operacion = a - b;
                break;
            case Multiplicacion:
                operacion = a * b;
                break;
            case Division:
                operacion = a/b;                
                break;
        }
        
        return operacion;
    }
    
    public float calcularDecimal(MyTokens mt, float a, float b){
        float operacion = 0;
        switch(mt){
            case Suma:
                operacion = a + b;
                break;
            case Resta:
                operacion = a - b;
                break;
            case Multiplicacion:
                operacion = a * b;
                break;
            case Division:
                operacion = a/b;
                break;
        }
        
        return operacion;
    }
    
    public float calcularDecimal(MyTokens mt, int a, int b){
        float operacion = 0.0f;
        switch(mt){
            case Division:
                operacion = a/b;
                break;
        }
        
        return operacion;
    }
    
    public String concatena(String a, String b){
        String resultado = "";
        resultado = a + b;
        return resultado;
    }
    
    public boolean calcularBool(String type, boolean a, boolean b){
        boolean resultado = false;
        switch(type){
            case "=":
                resultado = a == b;
                break;
            case "||":
                resultado = a || b;
                break;
            case "&&":
                System.out.println("a:" + a +"\tb:"+b);
                resultado = a && b;
                break;
        }
        
        return resultado;
    }
    
    public boolean calcularBool(String type, int a, int b){
        boolean resultado = false;
        switch(type){
            case "=":
                resultado = a == b;
                break;
            case ">":
                resultado = a > b;
                break;
            case "<":
                resultado = a < b;
                break;
        }
        
        return resultado;
    }
    
    class VentanaTb extends JFrame{
        JPanel paneltb;
        DefaultTableModel tbm;
        JTable tb;
        JScrollPane scroll;
        public VentanaTb(){
            paneltb = new JPanel();
            
            this.add(paneltb);
            this.setSize(500, 300);
            this.setTitle("Tabla de simbolos");
            this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

            String[] cols = new String[]{"tipo", "id", "valor"};
            String[][] datos = {};
            tbm = new DefaultTableModel(datos, cols);
            tb = new JTable(tbm);

            for(Variable v: ts.ts){
                tbm.addRow(new Object[]{v.tipo, v.id, v.valor});
            }
            
           scroll = new JScrollPane(tb);
           paneltb.add(scroll);
           this.setVisible(true);
           this.setLocationRelativeTo(null);
        }
    }
    
    
    
    private void botonLimpiarSmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarSmActionPerformed
        areaSemantico.setText("");
    }//GEN-LAST:event_botonLimpiarSmActionPerformed

    private void botonLimpiarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarSActionPerformed
        areaSintactico.setText("");
    }//GEN-LAST:event_botonLimpiarSActionPerformed

    private void botonAnalizarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnalizarSActionPerformed
       numRows.setText("Filas: " + areaCodigo.getLineCount()); 
       String codigo = areaCodigo.getText();
       Sintaxis s = new Sintaxis(new skelprototype.LexicoCup(new StringReader(codigo)));
       
       try{
           s.parse();
           areaSintactico.setText("Sintaxis Correcta");
            
           
       }catch (Exception ex){
           Symbol sym = s.getS();
           areaSintactico.setText("Error de sintaxis: Linea "+(sym.right + 1));
       }
    }//GEN-LAST:event_botonAnalizarSActionPerformed

    private void botonAnalizarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnalizarLActionPerformed
        numRows.setText("Filas: " + areaCodigo.getLineCount()); 
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(areaCodigo.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }
        
        try {
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexico lexer = new Lexico(lector);
            String resultado = "";
            while (true) {
                MyTokens tokens = lexer.yylex();
                if (tokens == null) {
                    areaLexico.setText(resultado);
                    return;
                }
                switch (tokens) {
                    case ERROR:
                        resultado += "Simbolo no encontrado\n";
                        break;
                    case Identificador: case Numero: case Clase: case NumeroDecimal: case Texto:
                    case Import: case MetodoVacio: case MetodoRetorno: case Retorno:
                        resultado += lexer.lexeme + " : Pertenece a " + tokens + "\n";
                        break;
                    default:
                        resultado += lexer.yytext() + " : Simbolo de " + tokens + "\n";
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException ex) {
            System.out.println("Error de entrada");
        }
    }//GEN-LAST:event_botonAnalizarLActionPerformed

    private void botonLimpiarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarLActionPerformed
        areaLexico.setText("");
    }//GEN-LAST:event_botonLimpiarLActionPerformed

    private void btnLimpiarAreaTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAreaTextoActionPerformed
        areaCodigo.setText("");
    }//GEN-LAST:event_btnLimpiarAreaTextoActionPerformed

    private void btnLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTablaActionPerformed
        reset();
        new VentanaTb();
    }//GEN-LAST:event_btnLimpiarTablaActionPerformed

    
    private void reset() {
        ts.resetTable();
        numRows.setText("Filas: " + areaCodigo.getLineCount()); 
    }
    
    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaCodigo;
    private javax.swing.JTextArea areaLexico;
    private javax.swing.JTextArea areaSemantico;
    private javax.swing.JTextArea areaSintactico;
    private javax.swing.JButton botonAbrir;
    private javax.swing.JButton botonAnalizarL;
    private javax.swing.JButton botonAnalizarS;
    private javax.swing.JButton botonAnalizarSm;
    private javax.swing.JButton botonLimpiarL;
    private javax.swing.JButton botonLimpiarS;
    private javax.swing.JButton botonLimpiarSm;
    private javax.swing.JButton btnLimpiarAreaTexto;
    private javax.swing.JButton btnLimpiarTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel numRows;
    private javax.swing.JPanel panelLexico;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSemantico;
    private javax.swing.JPanel panelSintactico;
    // End of variables declaration//GEN-END:variables
}
