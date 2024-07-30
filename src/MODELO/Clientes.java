package MODELO;

public class Clientes {

    //Atributos
    private int idclientes;
    private String nombrecli;
    private String apellidocli;
    private String sexocli;
    private String dnicli;
    private String emailcli;
    private String direccioncli;
    private String telefonocli;
    private String ruccli;
    private String indicadorCli;
    
    private String fechaventa;
    /*private static int cont=0;*/
    
    //Constructor

    public Clientes() {
        
        /*this.nombre = nombre;
        this.apellido=apellido;
        this.sexo = sexo;
        this.dni = dni;
        this.emai = emai;
        this.direccion = direccion;
        this.telefono=telefono;
        this.ruc=ruc;
        cont++;
        DecimalFormat df= new DecimalFormat("CC000");
        codCli=df.format(cont);*/
    }
    
    //Metodos Getters y Setters
    public int getIdclientes()                     {return idclientes;}
    public void setIdclientes(int idclientes)      {this.idclientes = idclientes;}
    public String getNombrecli()                   {return nombrecli;}
    public void setNombrecli(String nombrecli)     {this.nombrecli = nombrecli;}
    public String getApellidocli()                 {return apellidocli;}
    public void setApellidocli(String apellidocli) {this.apellidocli = apellidocli;}
    public String getSexocli()                     {return sexocli;}
    public void setSexocli(String sexocli)         {this.sexocli = sexocli;}
    public String getDnicli()                      {return dnicli;}
    public void setDnicli(String dnicli)           {this.dnicli = dnicli;}
    public String getEmailcli()                    {return emailcli;}
    public void setEmailcli(String emailcli)       {this.emailcli = emailcli;}
    public String getDireccioncli()                {return direccioncli;}
    public void setDireccioncli(String direccioncli) {this.direccioncli = direccioncli;}
    public String getTelefonocli()                    {return telefonocli;}
    public void setTelefonocli(String telefonocli) {this.telefonocli = telefonocli;}
    public String getRuccli()                     {return ruccli;}
    public void setRuccli(String reuccli)         {this.ruccli = reuccli;}
    public String getIndicadorCli()                  {return indicadorCli;}
    public void setIndicadorCli(String indicadorCli) {this.indicadorCli = indicadorCli;}
    
    public String getFechaVenta()                  {return fechaventa;}
    public void setFechaVenta(String fechaventa) {this.fechaventa = fechaventa;}
    
    //Metodo propio que retorna un arreglo de tipo object[] para que sea agragado en el jTable
    public Object[] RegistrDatosCli(int numeracionCli){
        Object [] fila={numeracionCli,idclientes,nombrecli,apellidocli,sexocli,dnicli,
                        emailcli,direccioncli,telefonocli,ruccli,};
        return fila;
    }
}
    
   
    


