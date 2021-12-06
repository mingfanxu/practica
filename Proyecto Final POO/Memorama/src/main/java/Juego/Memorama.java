/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author Alain
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Memorama extends JFrame implements ActionListener{
   
    //Atributos
    JFrame Ventana;
    //Presentacion
    JPanel Panel;
    JLabel Fondo;
    JLabel Boton;   
    //Juego
    JPanel PanelJuego;
    JLabel FondoJuego;
    JLabel matriz[][];
    int mat[][];
    int matAux[][];
    String jugador;
    Random aleatorio;
    JLabel nombre;
    Timer time;
    JLabel cronometro;
    int min;
    int seg;
    int contador;
    Timer TiempoEspera;
    int contSegEsp;
    Timer TiempoEspera1;
    int ban;
    int ban1;
    int antnum;
    int antx;
    int anty;
    int actualnum;
    int actualx;
    int actualy;
    
    //Constructor
    public Memorama(){
        //Ventana
        Ventana = new JFrame("Memorama");
        Ventana.setSize(600, 600);
        Ventana.setLayout(null);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setLocationRelativeTo(null);
        Ventana.setResizable(false);
        
        //JpanelPresen
        Panel = new JPanel();
        Panel.setSize(Ventana.getWidth(), Ventana.getHeight());
        Panel.setLocation(0, 0);
        Panel.setLayout(null);
        Panel.setVisible(true);
        
        
        //FondoPresen
        Fondo = new JLabel();
        Fondo.setSize(Ventana.getWidth(), Ventana.getHeight());
        Fondo.setLocation(0, 0);
        Fondo.setIcon(new ImageIcon("Imagenes/Portada.png"));
        Fondo.setVisible(true);
        Panel.add(Fondo,0);
        
        
        //Boton
        Boton = new JLabel();
        Boton.setSize(110, 130);
        Boton.setLocation(250, 200);
        Boton.setIcon(new ImageIcon("Imagenes/Boton.png"));
        Boton.setVisible(true);
        Panel.add(Boton,0);
        
        //Jpanel Juego
        PanelJuego = new JPanel();
        PanelJuego.setSize(Ventana.getWidth(), Ventana.getHeight());
        PanelJuego.setLocation(0, 0);
        PanelJuego.setLayout(null);
        PanelJuego.setVisible(true);
        
        //Fondo
        FondoJuego = new JLabel();
        FondoJuego.setSize(Ventana.getWidth(), Ventana.getHeight());
        FondoJuego.setLocation(0, 0);
        FondoJuego.setIcon(new ImageIcon("Imagenes/Fondo.png"));
        FondoJuego.setVisible(true);
        PanelJuego.add(FondoJuego,0);
        
        //nombre del jugador
        nombre = new JLabel();
        nombre.setSize(150, 20);
        nombre.setLocation(100, 10);
        nombre.setForeground(Color.BLACK);
        nombre.setVisible(true);
        PanelJuego.add(nombre,0);
        
        //Nombre del jugador
        cronometro = new JLabel();
        cronometro.setSize(150, 20);
        cronometro.setLocation(Ventana.getWidth()-200, 10);
        cronometro.setForeground(Color.BLACK);
        cronometro.setVisible(true);
        PanelJuego.add(cronometro,0);
        
        //Matriz logica
        mat = new int[4][5];
        matAux = new int[4][5];
        aleatorio = new Random();
        this.NumAleatorio();
        
        
        //Matriz de imagenes
        matriz = new JLabel[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = new JLabel();
                matriz[i][j].setBounds(155+(j*56), 175+(i*67), 56, 67);
                matriz[i][j].setIcon(new ImageIcon("Imagenes/"+matAux[i][j]+".png"));
                matriz[i][j].setVisible(true);
                PanelJuego.add(matriz[i][j],0);
            }
        } 
        
        //tiempo
        min = 0;
        seg = 0;
        
        time = new Timer (1000, new ActionListener () 
        { 
            public void actionPerformed(ActionEvent e) 
            {
                seg++;
                if(seg == 60 ){
                    min++;
                    seg = 0;
                }               
                cronometro.setText("Tiempo: "+min+":"+seg);          
        }});
        
        
        //tiempo de espera
        contSegEsp = 0;
        TiempoEspera = new Timer (1000, new ActionListener () 
        { 
            public void actionPerformed(ActionEvent e) 
            {
                 contSegEsp++;        
        }});
        TiempoEspera.start();
        TiempoEspera.stop();
        contSegEsp = 0;
        ban = 0;
        ban1 = 0;
        
        //Click de las cartas
        contador = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed( MouseEvent e){
                        for (int k = 0; k < 4; k++) {
                            for (int l = 0; l < 5; l++) {
                                if(e.getSource() == matriz[k][l]){                     
                                    
                                    if( matAux[k][l] == 0 && contador !=2){
                                        
                                        matAux[k][l] = mat[k][l];
                                        matriz[k][l].setIcon(new ImageIcon("Imagenes/"+matAux[k][l]+".png"));
                                        contador++;
                                        actualnum = mat[k][l];
                                        actualx = k;
                                        actualy = l;
                                        if(contador == 1){
                                            antnum = mat[k][l];
                                            antx = k;
                                            anty = l;
                                        }
                                                                                
                                        TiempoEspera1 = new Timer (500, new ActionListener () 
                                        { 
                                        public void actionPerformed(ActionEvent e) 
                                        {
                        
                                            
                                            if(contador == 2 && ban1 == 0 ){
                                                TiempoEspera.restart();
                                                ban1=1;
                                            }
                                            if( contador == 2 && contSegEsp == 2 ){
                                                TiempoEspera.stop();
                                                contSegEsp = 0;
                                                if( matAux[actualx][actualy] == matAux[antx][anty] ){
                                                    matAux[actualx][actualy] = -1;
                                                    matAux[antx][anty] = -1;
                                                    matriz[actualx][actualy].setIcon(new ImageIcon("Imagenes/"+matAux[actualx][actualy]+".png"));
                                                    matriz[antx][anty].setIcon(new ImageIcon("Imagenes/"+matAux[antx][anty]+".png"));
                                                    contador = 0;
                                                    //Funcion para ganar
                                                    int acum = 0;
                                                    for (int m = 0; m < 4; m++) {
                                                        for (int n = 0; n < 5; n++) {
                                                            if(matAux[m][n] == -1)
                                                                acum++;
                                                        }
                                                    }
                                                    if(acum == 20 ){
                                                        time.stop();
                                                        JOptionPane.showMessageDialog(Ventana, "Felicidades, ganaste con un tiempo de: "+min+":"+seg);
                                                        
                                                        for (int m = 0; m < 4; m++) {
                                                            for (int n = 0; n < 5; n++) {
                                                                mat[m][n] = 0;
                                                                matAux[m][n] = 0;
                                                                matriz[m][n].setIcon(new ImageIcon("Imagenes/"+matAux[m][n]+".png"));
                                                            }  
                                                        }
                                                        NumAleatorio();
                                                        min = 0;
                                                        seg = 0;
                                                        time.restart();
                                                        
                                                    }
                                                }
                                               
                                                for (int m = 0; m < 4; m++) {
                                                    for (int n = 0; n < 5; n++) {
                                                        System.out.print(matAux[m][n]+" ");
                                                        if( matAux[m][n] != 0 && matAux[m][n]!=-1 ){
                                                            matAux[m][n] = 0;
                                                            matriz[m][n].setIcon(new ImageIcon("Imagenes/"+matAux[m][n]+".png"));
                                                            System.out.println("Adios carta");
                                                            contador = 0;
                                                        }
                                                    }
                                                    System.out.println("");
                                                }
                                                TiempoEspera1.stop();
                                                ban1=0;
                                            }
                                        }});
                                        if( ban == 0 ){
                                            TiempoEspera1.start();
                                            ban = 1;
                                        }    
                                        if(contador == 2)
                                            TiempoEspera1.restart();
                                          
                                    }
                                    
                                    
                                    
                                }
                                
                            }   
                        }
                    
                    }
                });
                
            }  
        }
       
        Boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
               
                
                jugador = JOptionPane.showInputDialog(Ventana, "Jugador", "Por favor, escribe tu nombre" );     
                while(jugador == null || jugador.compareTo("Escribe aqui")==0 || jugador.compareTo("")==0){
                    jugador = JOptionPane.showInputDialog(Ventana, "Debes ingresar tu nombre","Por favor, escribelo");
                }
                nombre.setText("Jugador: "+jugador );
                time.start();
                Panel.setVisible(false);
                Ventana.add(PanelJuego);
                PanelJuego.setVisible(true);
     
            }});
        
        
        
        
        
        
        Ventana.add(Panel);
        Ventana.setVisible(true);
    }
    public void NumAleatorio(){
    int acumulador = 0;
        for (int i = 0; i < 4; i++) 
            for (int j = 0; j < 5; j++){ 
                mat[i][j] = 0;
                matAux[i][j] = 0;
            }    
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = aleatorio.nextInt(10)+1;
                do{
                    acumulador = 0;
                    for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 5; l++) {
                            if( mat[i][j] == mat[k][l] ){
                                acumulador +=1;
                            } 
                        }
                    }
                    if(acumulador == 3){
                        mat[i][j] = aleatorio.nextInt(10)+1;
                    }
                }while( acumulador == 3 );    
            }
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}

                    
    
