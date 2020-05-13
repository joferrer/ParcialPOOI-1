
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.*;

public class ControladorParqueadero {

    @FXML
    private TextField txtTarifaCarros;

    @FXML
    private TextField txtMaximoCuposCarros;

    @FXML
    private TextField txtCarrosParqueados;

    @FXML
    private TextField txtCuposCarros;

    @FXML
    private TextField txtIngresoCarros;

    @FXML
    private TextField txtGanancias;

    @FXML
    private TextField txtTarifaMotos;

    @FXML
    private TextField txtMaximoCuposMotos;

    @FXML
    private TextField txtMotosParqueadas;

    @FXML
    private TextField txtCuposMotos;

    @FXML
    private TextField txtIngresosMotos;

    @FXML
    private TextField txtImpuestos;

    @FXML
    private Button btnParquearCarro;

    @FXML
    private Button btnRetirarCarro;

    @FXML
    private Button btnParquearMoto;

    @FXML
    private Button btnRetirarMoto;

    @FXML
    private Button btnCambiarCuposMaximos;

    @FXML
    private Button btnCambiarTarifa;
    
    private Parqueadero parqueadero;
    
    public ControladorParqueadero(){
        parqueadero= new Parqueadero();
    }

    @FXML
    void cambiarCuposMaximos() {
        try{
       
        String resp = desplegarOpciones("Carros", "Motos","Seleccionar",
        "A continuación escoja a que vehiculo desea incrementar el cupo maximo","Escoja una opción:");
        int cupos= Integer.parseInt(desplegarInput("Ingrese el nuevo numero de cupos:", "Cambiar Cupos Maximos"));
        switch(resp){
            case "Carros":
            int ant = parqueadero.getMaximoCupoCarros();
            parqueadero.setMaximoCupoCarros(cupos);
            if(ant==parqueadero.getMaximoCupoCarros())throw new RuntimeException("Oh no :(");
            
            break;
            
            case "Motos":
             int ant2 = parqueadero.getMaximoCupoMotos();
             parqueadero.setMaximoCupoMotos(cupos);
             if(ant2==parqueadero.getMaximoCupoMotos())throw new RuntimeException("Oh no :(");
            break;
        }
        desplegarInfo("El valor maximo fue cambiado con exito :)", "Respuesta");
        actualizarPantalla();
        
       
    }
    catch(Exception e){
        desplegarError("A ocurrido un error, posiblemente el valor asignado no cumple con los requisitos", "Error :(");
    }

    }

    @FXML
    void cambiarTarifa() {
        try{
         String resp = desplegarOpciones("Carros", "Motos","Seleccionar",
        "A continuación escoja a que vehiculo desea cambiarle la tarifa","Escoja una opción:");
        int tarifa= Integer.parseInt(desplegarInput("Ingrese la nueva tarifa:", "Cambiar Tarifa"));
        if(tarifa<=0)throw new RuntimeException("Oh no :(");
        switch(resp){
            case "Carros":
            parqueadero.setTarifaCarros(tarifa);          
            break;
            
            case "Motos":
            parqueadero.setTarifaMotos(tarifa);
            break;
        }
        desplegarInfo("El valor maximo fue cambiado con exito :)", "Respuesta");
        actualizarPantalla();
    }
      catch(Exception e){
        desplegarError("A ocurrido un error, posiblemente el valor asignado no cumple con los requisitos", "Error :(");
    }

    }

    @FXML
    void parquearCarro() {
        try{
       if(!parqueadero.parquearCarro())throw new RuntimeException("Oh no :(");
        actualizarPantalla();
    }
      catch(Exception e){
        desplegarError("A ocurrido un error, posiblemente el parqueadero ya está lleno", "Error :(");
    }
    }

    @FXML
    void parquearMoto() {
           try{
       if(!parqueadero.parquearMoto())throw new RuntimeException("Oh no :(");
        actualizarPantalla();
    }
      catch(Exception e){
        desplegarError("A ocurrido un error, posiblemente el parqueadero ya está lleno", "Error :(");
    }
    }

    @FXML
    void retirarCarro() {
        try{
            int horaEntrada=Integer.parseInt(desplegarInput("Ingresar hora de entrada:", "Hora de Entrada"));
            int horaSalida= Integer.parseInt(desplegarInput("Ingresar hora de salida", "Hora de Salida"));
        
            if(parqueadero.retirarCarro(horaEntrada, horaSalida)==false)throw new RuntimeException("Oh no :(");
            actualizarPantalla();
        }
        catch(Exception e){
        desplegarError("A ocurrido un error, posiblemente el valor asignado no cumple con los requisitos", "Error :(");
    }
    }

    @FXML
    void retirarMoto() {
        try{
            int horaEntrada=Integer.parseInt(desplegarInput("Ingresar hora de entrada:", "Hora de Entrada"));
            int horaSalida= Integer.parseInt(desplegarInput("Ingresar hora de salida", "Hora de Salida"));
        
            if(parqueadero.retirarMoto(horaEntrada, horaSalida)==false)throw new RuntimeException("Oh no :(");
            actualizarPantalla();
        }
        catch(Exception e){
        desplegarError("A ocurrido un error, posiblemente el valor asignado no cumple con los requisitos", "Error :(");
    }
    }
    public void actualizarPantalla(){
        
        txtCarrosParqueados.setText(String.valueOf(parqueadero.getCarros()));
        txtCuposCarros.setText(String.valueOf(parqueadero.getCupoCarros()));
        txtCuposMotos.setText(String.valueOf(parqueadero.getCupoMotos()));
        txtGanancias.setText(String.valueOf(parqueadero.getGanancias()));
        txtImpuestos.setText(String.valueOf(parqueadero.getImpuestos()));
        txtIngresoCarros.setText(String.valueOf(parqueadero.getIngresosCarros()));
        txtIngresosMotos.setText(String.valueOf(parqueadero.getIngresosMotos()));
        txtMaximoCuposCarros.setText(String.valueOf(parqueadero.getMaximoCupoCarros()));
        txtMaximoCuposMotos.setText(String.valueOf(parqueadero.getMaximoCupoMotos()));
        txtMotosParqueadas.setText(String.valueOf(parqueadero.getMotos()));
        txtTarifaCarros.setText(String.valueOf(parqueadero.getTarifaCarros()));
        txtTarifaMotos.setText(String.valueOf(parqueadero.getTarifaMotos()));
        
    }
     public String desplegarInput(String msg,String titulo){
        String resp="";
       TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle(titulo);
        dialog.setHeaderText(titulo);
        dialog.setContentText(msg);
        
       
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){       
         resp= result.get();
        }
        return resp;
               
    }
    public void desplegarError(String msg, String titulo ){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(titulo);

        alert.setContentText(msg);

        alert.showAndWait();
    }
    public void desplegarInfo(String msg, String titulo ){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(titulo);

        alert.setContentText(msg);

        alert.showAndWait();
    }
    /**
     * Este metodo muestra una alert con dos opciones solamente.
    **/
    public String desplegarOpciones(String op1,String op2,String titulo,String descripcion,String msg){
       
        String opciones[]={op1,op2};
        
        ChoiceDialog<String> dialog = new ChoiceDialog<>(opciones[0], opciones);
        dialog.setTitle(titulo);
        dialog.setHeaderText(descripcion);
        dialog.setContentText(msg);

        dialog.showAndWait();
        return dialog.getSelectedItem();
      
    }

}
