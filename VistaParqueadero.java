import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.WindowConstants;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import javax.swing.JDialog;


/**
 * Esta clase es la interfaz grï¿½fica GUI de un ejemplo sencillo 
 * para operar con objetos Telefonica. Se usa la clase JFrame proporcionada por Java.
 * @author (Milton Jesï¿½s Vera Contreras - mjvera@bari.ufps.edu.co) 
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) Enero 2008
 */
public class VistaParqueadero extends JFrame {

    /**Referencia a un objeto del modelo*/
    private Parqueadero parqueadero;
    
    //A continuaciï¿½n los elementos de la GUI
    
    private JButton cmdCambiarTarifas;
    private JButton cmdCambiarCupos;
    private JButton cmdParquearCarro;
    private JButton cmdParquearMoto;
    private JButton cmdRetirarCarro;
    private JButton cmdRetirarMoto;
    private JLabel lblImagen;
    private JLabel lblGanancias;
    private JLabel lblImpuestos;
    private JLabel lblCupoCarros;
    private JLabel lblCupoMotos;
    private JLabel lblMaximoCupoCarros;
    private JLabel lblMaximoCupoMotos;    
    private JLabel lblCarros;
    private JLabel lblMotos;        
    private JLabel lblIngresosCarros;
    private JLabel lblIngresosMotos;
    private JLabel lblTarifaCarros;
    private JLabel lblTarifaMotos;
    private JLabel lblTitulo;
    private JPanel panelBotones;
    private JPanel panelDatos;
    private JTextField txtGanancias;
    private JTextField txtImpuestos;
    private JTextField txtCupoCarros;
    private JTextField txtCupoMotos;
    private JTextField txtMaximoCupoCarros;
    private JTextField txtMaximoCupoMotos;    
    private JTextField txtCarros;
    private JTextField txtMotos;     
    private JTextField txtIngresosCarros;
    private JTextField txtIngresosMotos;
    private JTextField txtTarifaCarros;
    private JTextField txtTarifaMotos;  
    
    /** La vista recibe un objeto del modelo*/
    public VistaParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
        initComponents();
        actualizarGUI();
    }
    
    /** 
     * Inicializa la GUI, se encarga de crear los botones
     * y las etiquetas de texto y definir la apariencia de la ventana
     */
    private void initComponents() {

        lblImagen = new JLabel();
        lblTitulo = new JLabel();
        panelBotones = new JPanel();
        cmdParquearCarro = new JButton();
        cmdParquearMoto = new JButton();
        cmdRetirarCarro = new JButton();
        cmdRetirarMoto = new JButton();        
        cmdCambiarTarifas = new JButton();
        cmdCambiarCupos = new JButton();        
        panelDatos = new JPanel();
        lblTarifaCarros = new JLabel();
        txtTarifaCarros = new JTextField();
        lblTarifaMotos = new JLabel();
        txtTarifaMotos = new JTextField();
        lblIngresosCarros = new JLabel();
        txtIngresosCarros = new JTextField();
        lblCupoCarros = new JLabel();
        txtCupoCarros = new JTextField();
        lblIngresosMotos = new JLabel();
        txtIngresosMotos = new JTextField();
        lblCupoMotos = new JLabel();
        txtCupoMotos = new JTextField();
        lblGanancias = new JLabel();
        txtGanancias = new JTextField();
        lblImpuestos = new JLabel();
        txtImpuestos = new JTextField();
        
        lblMaximoCupoCarros = new JLabel();
        txtMaximoCupoCarros = new JTextField();        
        lblMaximoCupoMotos = new JLabel();
        txtMaximoCupoMotos = new JTextField();        
        lblCarros = new JLabel();
        txtCarros = new JTextField();        
        lblMotos = new JLabel();
        txtMotos = new JTextField();                

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblImagen.setIcon(new ImageIcon(getClass().getResource("parqueadero.jpg"))); // NOI18N
        getContentPane().add(lblImagen, BorderLayout.EAST);

        lblTitulo.setFont(new Font("Verdana", 1, 24));
        lblTitulo.setText("Sistema Parqueadero Simple");
        getContentPane().add(lblTitulo, BorderLayout.NORTH);

        panelBotones.setLayout(new GridLayout(1, 6));

        cmdParquearCarro.setFont(new Font("Verdana", 1, 12));
        cmdParquearCarro.setText("Parquear Carro");
        panelBotones.add(cmdParquearCarro);
        
        cmdParquearMoto.setFont(new Font("Verdana", 1, 12));
        cmdParquearMoto.setText("Parquear Moto");
        panelBotones.add(cmdParquearMoto);
        
        cmdRetirarCarro.setFont(new Font("Verdana", 1, 12));
        cmdRetirarCarro.setText("Retirar Carro");
        panelBotones.add(cmdRetirarCarro);
        
        cmdRetirarMoto.setFont(new Font("Verdana", 1, 12));
        cmdRetirarMoto.setText("Retirar Moto");
        panelBotones.add(cmdRetirarMoto);        

        cmdCambiarCupos.setFont(new Font("Verdana", 1, 12));
        cmdCambiarCupos.setText("Cambiar Cupos");
        panelBotones.add(cmdCambiarCupos);

        cmdCambiarTarifas.setFont(new Font("Verdana", 1, 12));
        cmdCambiarTarifas.setText("Cambiar Tarifas");
        panelBotones.add(cmdCambiarTarifas);

        
        getContentPane().add(panelBotones, BorderLayout.SOUTH);

        panelDatos.setLayout(new GridLayout(6, 4));        

        lblTarifaCarros.setFont(new Font("Verdana", 1, 10));
        lblTarifaCarros.setText("$ Tarifa Carros");
        lblTarifaCarros.setHorizontalTextPosition(SwingConstants.CENTER);
        panelDatos.add(lblTarifaCarros);

        txtTarifaCarros.setBackground(new Color(255, 255, 255));
        txtTarifaCarros.setEditable(false);
        txtTarifaCarros.setFont(new Font("Verdana", 0, 10));
        txtTarifaCarros.setHorizontalAlignment(JTextField.CENTER);
        txtTarifaCarros.setText("0");
        panelDatos.add(txtTarifaCarros);

        lblTarifaMotos.setFont(new Font("Verdana", 1, 10));
        lblTarifaMotos.setText("$ Tarifa Motos");
        lblTarifaMotos.setHorizontalTextPosition(SwingConstants.CENTER);
        panelDatos.add(lblTarifaMotos);

        txtTarifaMotos.setBackground(new Color(255, 255, 255));
        txtTarifaMotos.setEditable(false);
        txtTarifaMotos.setFont(new Font("Verdana", 0, 10));
        txtTarifaMotos.setHorizontalAlignment(JTextField.CENTER);
        txtTarifaMotos.setText("0");
        panelDatos.add(txtTarifaMotos);

        lblMaximoCupoCarros.setFont(new Font("Verdana", 1, 10));
        lblMaximoCupoCarros.setText("Máximo Cupos para Carros");
        lblMaximoCupoCarros.setHorizontalTextPosition(SwingConstants.CENTER);
        panelDatos.add(lblMaximoCupoCarros);
        
        txtMaximoCupoCarros.setBackground(new Color(255, 255, 255));
        txtMaximoCupoCarros.setEditable(false);
        txtMaximoCupoCarros.setFont(new Font("Verdana", 0, 10));
        txtMaximoCupoCarros.setHorizontalAlignment(JTextField.CENTER);
        txtMaximoCupoCarros.setFont(new Font("Verdana", 1, 10));                        
        txtMaximoCupoCarros.setText("0");
        panelDatos.add(txtMaximoCupoCarros);
        
        lblMaximoCupoMotos.setFont(new Font("Verdana", 1, 10));
        lblMaximoCupoMotos.setText("Máximo Cupos para Motos");
        lblMaximoCupoMotos.setHorizontalTextPosition(SwingConstants.CENTER);
        panelDatos.add(lblMaximoCupoMotos);
        
        txtMaximoCupoMotos.setBackground(new Color(255, 255, 255));
        txtMaximoCupoMotos.setEditable(false);
        txtMaximoCupoMotos.setFont(new Font("Verdana", 0, 10));
        txtMaximoCupoMotos.setHorizontalAlignment(JTextField.CENTER);
        txtMaximoCupoMotos.setFont(new Font("Verdana", 1, 10));                                
        txtMaximoCupoMotos.setText("0");
        panelDatos.add(txtMaximoCupoMotos);        
        
        lblCarros.setFont(new Font("Verdana", 1, 10));
        lblCarros.setText("Carros Parqueados");
        lblCarros.setHorizontalTextPosition(SwingConstants.CENTER);
        panelDatos.add(lblCarros);
        
        txtCarros.setBackground(new Color(255, 255, 255));
        txtCarros.setEditable(false);
        txtCarros.setFont(new Font("Verdana", 0, 10));
        txtCarros.setHorizontalAlignment(JTextField.CENTER);
        txtCarros.setForeground(new Color(255, 0, 0));        
        txtCarros.setFont(new Font("Verdana", 1, 10));                        
        txtCarros.setText("0");
        panelDatos.add(txtCarros);
        
        lblMotos.setFont(new Font("Verdana", 1, 10));
        lblMotos.setText("Motos Parqueadas");
        lblMotos.setHorizontalTextPosition(SwingConstants.CENTER);
        panelDatos.add(lblMotos);
        
        txtMotos.setBackground(new Color(255, 255, 255));
        txtMotos.setEditable(false);
        txtMotos.setFont(new Font("Verdana", 0, 10));
        txtMotos.setHorizontalAlignment(JTextField.CENTER);
        txtMotos.setForeground(new Color(255, 0, 0));                
        txtMotos.setFont(new Font("Verdana", 1, 10));                
        txtMotos.setText("0");
        panelDatos.add(txtMotos);        

        lblCupoCarros.setFont(new Font("Verdana", 1, 10));
        lblCupoCarros.setText("Cupos para Carros");
        lblCupoCarros.setHorizontalTextPosition(SwingConstants.CENTER);
        panelDatos.add(lblCupoCarros);

        txtCupoCarros.setBackground(new Color(255, 255, 255));
        txtCupoCarros.setEditable(false);
        txtCupoCarros.setFont(new Font("Verdana", 0, 10));
        txtCupoCarros.setHorizontalAlignment(JTextField.CENTER);
        txtCupoCarros.setForeground(new Color(0, 196, 49));                        
        txtCupoCarros.setFont(new Font("Verdana", 1, 10));                
        txtCupoCarros.setText("0");
        panelDatos.add(txtCupoCarros);

        lblCupoMotos.setFont(new Font("Verdana", 1, 10));
        lblCupoMotos.setText("Cupos para Motos");
        lblCupoMotos.setHorizontalTextPosition(SwingConstants.CENTER);
        panelDatos.add(lblCupoMotos);

        txtCupoMotos.setBackground(new Color(255, 255, 255));
        txtCupoMotos.setEditable(false);
        txtCupoMotos.setFont(new Font("Verdana", 0, 10));
        txtCupoMotos.setHorizontalAlignment(JTextField.CENTER);
        txtCupoMotos.setForeground(new Color(0, 196, 49));                                
        txtCupoMotos.setFont(new Font("Verdana", 1, 10));        
        txtCupoMotos.setText("0");
        panelDatos.add(txtCupoMotos);        

        lblIngresosCarros.setFont(new Font("Verdana", 1, 10));
        lblIngresosCarros.setText("$ Ingresos Carros");
        lblIngresosCarros.setHorizontalTextPosition(SwingConstants.CENTER);
        panelDatos.add(lblIngresosCarros);

        txtIngresosCarros.setBackground(new Color(255, 255, 255));
        txtIngresosCarros.setEditable(false);
        txtIngresosCarros.setFont(new Font("Verdana", 0, 10));
        txtIngresosCarros.setHorizontalAlignment(JTextField.CENTER);
        txtIngresosCarros.setText("0");
        panelDatos.add(txtIngresosCarros);

        lblIngresosMotos.setFont(new Font("Verdana", 1, 10));
        lblIngresosMotos.setText("$ Ingresos Motos");
        lblIngresosMotos.setHorizontalTextPosition(SwingConstants.CENTER);
        panelDatos.add(lblIngresosMotos);

        txtIngresosMotos.setBackground(new Color(255, 255, 255));
        txtIngresosMotos.setEditable(false);
        txtIngresosMotos.setFont(new Font("Verdana", 0, 10));
        txtIngresosMotos.setHorizontalAlignment(JTextField.CENTER);
        txtIngresosMotos.setText("0");
        panelDatos.add(txtIngresosMotos);

        lblGanancias.setFont(new Font("Verdana", 1, 10));
        lblGanancias.setText("Total $ Ganancias");
        lblGanancias.setHorizontalTextPosition(SwingConstants.CENTER);
        panelDatos.add(lblGanancias);

        txtGanancias.setBackground(new Color(255, 255, 255));
        txtGanancias.setEditable(false);
        txtGanancias.setFont(new Font("Verdana", 1, 10));
        txtGanancias.setForeground(new Color(0, 196, 49));
        txtGanancias.setHorizontalAlignment(JTextField.CENTER);
        txtGanancias.setText("0");
        panelDatos.add(txtGanancias);
        
        lblImpuestos.setFont(new Font("Verdana", 1, 10));
        lblImpuestos.setText("Total $ Impuestos");
        lblImpuestos.setHorizontalTextPosition(SwingConstants.CENTER);
        panelDatos.add(lblImpuestos);

        txtImpuestos.setBackground(new Color(255, 255, 255));
        txtImpuestos.setEditable(false);
        txtImpuestos.setFont(new Font("Verdana", 1, 10));
        txtImpuestos.setForeground(new Color(255, 0, 0));
        txtImpuestos.setHorizontalAlignment(JTextField.CENTER);
        txtImpuestos.setText("0");
        panelDatos.add(txtImpuestos);        

        getContentPane().add(panelDatos, BorderLayout.CENTER);
        setTitle("Sistema Parqueadero Simple");
        
        cmdParquearCarro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdParquearCarroActionPerformed(evt);
            }
        });
        
        cmdParquearMoto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdParquearMotoActionPerformed(evt);
            }
        });
        
        cmdRetirarCarro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdRetirarCarroActionPerformed(evt);
            }
        });        
        
        cmdRetirarMoto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdRetirarMotoActionPerformed(evt);
            }
        });
        
        cmdCambiarTarifas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdCambiarTarifasActionPerformed(evt);
            }
        });        

       
        cmdCambiarCupos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdCambiarCuposActionPerformed(evt);
            }
        });    
        
        pack();
        setVisible(true);
        
        //cmdCambiarCuposActionPerformed(null);
        
        //cmdCambiarTarifasActionPerformed(null);
        
        actualizarGUI();
    }//fin initComponents

    
    
    /**Evento click cmdParquearCarro*/
    private void cmdParquearCarroActionPerformed(ActionEvent evt) 
    {
      if(this.parqueadero.parquearCarro( )) {
       actualizarGUI();
       JOptionPane.showMessageDialog(this, "Carro Parqueado OK");
      }
      else JOptionPane.showMessageDialog(this, "No se puede Parquear el Carro");
    }//fin cmdParquearCarroActionPerformed
    
    /**Evento click cmdParquearMoto*/
    private void cmdParquearMotoActionPerformed(ActionEvent evt) 
    {
      if(this.parqueadero.parquearMoto()){
       actualizarGUI();          
       JOptionPane.showMessageDialog(this, "Moto Parqueada OK");
      }
      else JOptionPane.showMessageDialog(this, "No se puede Parquear la Moto");
    }//fin cmdParquearMotoActionPerformed
    
    /**Evento click cmdRetirarCarro*/
    private void cmdRetirarCarroActionPerformed(ActionEvent evt) 
    {
      String horaEntrada=null, horaSalida=null;
      while(horaEntrada==null || horaSalida==null) 
      {
        horaEntrada = JOptionPane.showInputDialog(this, "Escriba la hora de Entrada");
        horaSalida = JOptionPane.showInputDialog(this, "Escriba la hora de Salida");
      }
      if(this.parqueadero.retirarCarro(Integer.parseInt(horaEntrada), Integer.parseInt(horaSalida))) {
        actualizarGUI();          
        JOptionPane.showMessageDialog(this, "Carro Salió OK");
      }
      else JOptionPane.showMessageDialog(this, "No se puede Retirar el Carro");
    }//fin cmdRetirarCarroActionPerformed
    
    /**Evento click cmdRetirarMoto*/
    private void cmdRetirarMotoActionPerformed(ActionEvent evt) 
    {
      String horaEntrada=null, horaSalida=null;
      while(horaEntrada==null || horaSalida==null) 
      {
        horaEntrada = JOptionPane.showInputDialog(this, "Escriba la hora de Entrada");
        horaSalida = JOptionPane.showInputDialog(this, "Escriba la hora de Salida");
      }
      if(this.parqueadero.retirarMoto(Integer.parseInt(horaEntrada), Integer.parseInt(horaSalida))){
        actualizarGUI();
        JOptionPane.showMessageDialog(this, "Moto Salió OK");
      }
      else JOptionPane.showMessageDialog(this, "No se puede Retirar la Moto");
    }//fin cmdRetirarMotoActionPerformed

    /**Evento click cmdCambiarTarifas*/
    private void cmdCambiarTarifasActionPerformed(ActionEvent evt) {
     DialogoParqueadero guiTarifas=new DialogoParqueadero(this, "Tarifas");
     if(guiTarifas.ok()){
      this.parqueadero.setTarifaCarros(guiTarifas.getCifraCarros());
      this.parqueadero.setTarifaMotos(guiTarifas.getCifraMotos());      
      actualizarGUI();
      JOptionPane.showMessageDialog(this,"Tarifas Modificadas correctamente.\nEstas Tarifas rigen para los carros que ingresen desde ahora");
     }
     else
      JOptionPane.showMessageDialog(this,"No se pudieron Modificar las Tarifas");
    }//fin cmdCambiarTarifasActionPerformed

    
    /**Evento click cmdCambiarCupos*/
    private void cmdCambiarCuposActionPerformed(ActionEvent evt) {
     DialogoParqueadero guiCupos=new DialogoParqueadero(this,"Cupos");
     if(guiCupos.ok()){
      this.parqueadero.setMaximoCupoCarros(guiCupos.getCifraCarros());
      this.parqueadero.setMaximoCupoMotos(guiCupos.getCifraMotos());      
      actualizarGUI();
      JOptionPane.showMessageDialog(this,"Capacidad Modificada correctamente.");
     }
     else
      JOptionPane.showMessageDialog(this,"No se pudieron Modificar la Cupos");
    }//fin cmdCambiarTarifasActionPerformed

    
    private void actualizarGUI()
    {
    txtTarifaCarros.setText(String.valueOf(parqueadero.getTarifaCarros()));
    txtTarifaMotos.setText(String.valueOf(parqueadero.getTarifaMotos()));
    txtCupoCarros.setText(String.valueOf(parqueadero.getCupoCarros()));
    txtCupoMotos.setText(String.valueOf(parqueadero.getCupoMotos()));
    txtMaximoCupoCarros.setText(String.valueOf(parqueadero.getMaximoCupoCarros()));
    txtMaximoCupoMotos.setText(String.valueOf(parqueadero.getMaximoCupoMotos()));    
    txtCarros.setText(String.valueOf(parqueadero.getCarros()));
    txtMotos.setText(String.valueOf(parqueadero.getMotos()));    
    txtIngresosCarros.setText(String.valueOf(parqueadero.getIngresosCarros()));
    txtIngresosMotos.setText(String.valueOf(parqueadero.getIngresosMotos()));
    txtGanancias.setText(String.valueOf(parqueadero.getGanancias()));
    txtImpuestos.setText(String.valueOf(parqueadero.getImpuestos()));
    }
   
    
    /***********************************************************************************/
    /* Se declara como una clase interna el Cuadro de Diálogo para Cambiar las Tarifas y Cupos*/
     public class DialogoParqueadero extends JDialog{
      private JLabel lblTarifaCarros;
      private JLabel lblTarifaMotos;
      private JTextField txtTarifaCarros;
      private JTextField txtTarifaMotos;
      private JButton cmdAceptar;
      private JButton cmdCancelar;      
      private boolean ok;
      
      public DialogoParqueadero(JFrame owner, String prefijoTitulo){
        super(owner,true);
        lblTarifaCarros = new JLabel();
        lblTarifaMotos=new JLabel();
        txtTarifaCarros= new JTextField();
        txtTarifaMotos= new JTextField();
        cmdAceptar = new JButton();
        cmdCancelar = new JButton();
                
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setLayout(new GridLayout(3,2));
        
        lblTarifaCarros.setFont(new Font("Verdana", 1, 10));
        lblTarifaCarros.setText(prefijoTitulo+" Carros");
        lblTarifaCarros.setHorizontalTextPosition(SwingConstants.CENTER);
        add(lblTarifaCarros);

        txtTarifaCarros.setBackground(new Color(255, 255, 255));
        txtTarifaCarros.setFont(new Font("Verdana", 0, 10));
        txtTarifaCarros.setHorizontalAlignment(JTextField.CENTER);
        txtTarifaCarros.setText("0");
        add(txtTarifaCarros);
        
        lblTarifaMotos.setFont(new Font("Verdana", 1, 10));
        lblTarifaMotos.setText(prefijoTitulo+" Motos");
        lblTarifaMotos.setHorizontalTextPosition(SwingConstants.CENTER);
        add(lblTarifaMotos);

        txtTarifaMotos.setBackground(new Color(255, 255, 255));
        txtTarifaMotos.setFont(new Font("Verdana", 0, 10));
        txtTarifaMotos.setHorizontalAlignment(JTextField.CENTER);
        txtTarifaMotos.setText("0");
        add(txtTarifaMotos);  
        
        cmdAceptar.setFont(new Font("Verdana", 1, 12));
        cmdAceptar.setText("Aceptar");
        add(cmdAceptar);
        cmdCancelar.setFont(new Font("Verdana", 1, 12));
        cmdCancelar.setText("Cancelar");
        add(cmdCancelar);        
        
        //clase anï¿½nima para eventos de boton cmdIniciarDia, esto genera GUIApuesta$1.class
        cmdAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdAceptarActionPerformed(evt);
            }
        });        

        //clase anï¿½nima para eventos de boton cmdIniciarDia, esto genera GUIApuesta$2.class
        cmdCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });        
        
        pack();
        setResizable(false);
        setLocation(owner.getWidth()/2 - this.getWidth()/2, owner.getHeight()/2 - this.getHeight()/2);
        setTitle("Ingrese " + prefijoTitulo);
        setVisible(true);        
      }//fin constructor clase interna GUIApuesta
      
    /**Evento click cmdAceptar*/
    private void cmdAceptarActionPerformed(ActionEvent evt) {
      this.ok = true;
      this.setVisible(false);
    }//fin cmdAceptarActionPerformed
    
    /**Evento click cmdCancelar*/
    private void cmdCancelarActionPerformed(ActionEvent evt) {
      this.ok = false;
      this.setVisible(false);
    }//fin cmdCancelarActionPerformed
        
    public int getCifraCarros(){return Integer.parseInt(txtTarifaCarros.getText());}
    public int getCifraMotos(){return Integer.parseInt(txtTarifaMotos.getText());}      
    public boolean ok(){return this.ok;}
}//fin class DialogoTarifa

    
    
}//fin clase