package practica3;

import java.util.Random;

public class mexicano {
	String nam;
    String nam1;
    String ap;
    String am;
    char sexo;
    int day;
    int mes;
    int year;
    String direccion;
    String CURP;
    String RFC;
    private final String homoclave = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    
    public mexicano()
    {
        setNam(CapturaEntrada.capturarCadena("Primera nombre"));
        setNam1(CapturaEntrada.capturarCadena("Segundo nombre"));
        setAp(CapturaEntrada.capturarCadena("Apellido paterno"));
        setAm(CapturaEntrada.capturarCadena("Apellido materno"));
        setSexo(CapturaEntrada.capturarCadena("Sexo").charAt(0)); 
        setDia(CapturaEntrada.capturarEntero("Dia"));
        setMes(CapturaEntrada.capturarEntero("Meses"));
        setYear(CapturaEntrada.capturarEntero("Año"));
        setLugarr(CapturaEntrada.capturarCadena("Direccion"));
        generarCURP(generar());
        generarRFC(generar());
        
        
    }
    
    public void setNam(String nam)
    {
        this.nam = nam;
    }
    
    public String getNam()
    {
        return nam;
    }
    
    public void setNam1(String nam1)
    {
       this.nam1 = nam1;
    }
    
    public String getNam1()
    {
        return nam1;
    }
    
    public void setAm(String am)
    {
        this.am = am;
    }
    
    public String getAm()
    {
        return am;
    }
    
    public void setAp(String ap)
    {
        this.ap = ap;
    }
    
    public String getAp()
    {
        return ap;
    }
    
    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }
    
    public char getSexo()
    {
        return sexo;
    }
    
    public void setDia(int dia)
    {
        this.day = dia;
    }
    
    public int getDia()
    {
        return day;
    }
    
    public void setMes(int mes)
    {
        this.mes = mes;
    }
    
    public int getMes()
    {
        return mes;
    }
        
    public void setYear(int year)
    {
        this.year = year;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public void setLugarr(String lugaar)
    {
        lugaar = lugaar.trim().toLowerCase(); 
        switch(lugaar) 
        {
            case "aguascalientes" ->
            {
            	direccion = "AS";            
            }
            case "baja california" ->
            {
            	direccion = "BC";             
            }
            case "baja california sur" ->
            {
            	direccion = "BS";            
            }
            case "campeche" ->
            {
            	direccion = "CC";           
            }
            case "coahuila" ->
            {
            	direccion = "CL";           
            }
            case "colima" ->
            {
            	direccion = "CM";           
            }
            case "chiapas" ->
            {
            	direccion = "CS";          
            }
            case "chihuahua" ->
            {
            	direccion = "CH";           
            }
            case "distrito federal" ->
            {
            	direccion = "DF";           
            }
            case "durango" -> 
            {
            	direccion = "DG";            
            }
            case "guanajuato" -> 
            {
            	direccion = "GT";            
            }
            case "guerrero" ->
            {
            	direccion = "GR";           
            }
            case "hidalgo" ->  
            {
            	direccion = "HG";           
            }
            case "jalisco" ->         
            {
            	direccion = "JC";          
            }
            case "mexico" ->           
            {
            	direccion = "MC";             
            }
            case "michoacan" ->         
            {
            	direccion = "MN";           
            }
            case "morelos" ->           
            {
            	direccion = "MS";            
            }
            case "nayarit" ->           
            {
            	direccion = "NT";           
            }
            case "nuevo leon" ->           
            {
            	direccion = "NL";         
            }
            case "oaxaca" ->            
            {
            	direccion = "OC";           
            }
            case "puebla" ->             
            {
            	direccion= "PL";           
            }
            case "queretaro" ->            
            {
            	direccion = "QT";           
            }
            case "quintana roo" ->          
            {
            	direccion = "QR";           
            }
            case "san luis potosi" ->         
            {
            	direccion = "SP";            
            }
            case "sinaloa" ->           
            {
            	direccion = "SL";           
            }
            case "sonora" ->            
            {
            	direccion = "SR";          
            }
            case "tabasco" ->            
            {
            	direccion ="TC";           
            }
            case "tamaulipas" ->          
            {
            	direccion = "TS";           
            }
            case "tlaxcala" ->            
            {
            	direccion = "TL";           
            }
            case "veracruz" ->            
            {
            	direccion = "VZ";            
            }
            case "yucatan" ->            
            {
            	direccion = "YN";            
            }
            case "zacatecas" ->
            {
            	direccion = "ZC";            
            }
            case "nacido en el extranjero" ->
            {
                direccion = "NE";            
            }
        }
    }
    
    public String generar() 
    {
        String curpp;
        if(ap.toLowerCase().charAt(0) == 'ñ') 
        {
             curpp = "X"; 
        }
        else
        {
             curpp = String.valueOf(ap.toLowerCase().charAt(0)); 
         }
        for(int i = 1; i< ap.length();i++)
        {
            if(ap.charAt(i) == 'a'|| ap.charAt(i) == 'e' || ap.charAt(i) == 'i'|| ap.charAt(i) == 'o'|| ap.charAt(i) == 'u')
            {
                curpp+= String.valueOf(ap.charAt(i));
                break; 
            }
        }
        if(am.equals("0")) 
        {
            curpp+="x"; 
        }
        else
        {
            curpp+= am.charAt(0); 
        }
        if(nam.trim().toLowerCase().equals("maria")|| nam.trim().toLowerCase().equals("jose"))
        {
            curpp+= String.valueOf(nam1.charAt(0)); 
        }
        else
        {
            curpp+= String.valueOf(nam.charAt(0)); 
        }
        if(curpp.toLowerCase().equals("popo")|| curpp.toLowerCase().equals("hola")| curpp.toLowerCase().equals("pipi")||curpp.toLowerCase().equals("tonto"))
        {
           curpp = String.valueOf(curpp.charAt(0)) + String.valueOf(curpp.charAt(1)) + String.valueOf(curpp.charAt(2)) + "X";
        }
        String yearr = String.valueOf(year);
        curpp+= String.valueOf(yearr.charAt(yearr.length()-2)) + String.valueOf(yearr.charAt(yearr.length()-1)); 
        if(mes >= 1 && mes <= 9) 
        {
            curpp+= "0" + String.valueOf(mes); 
        }
        else
        {
            curpp+= String.valueOf(mes);
        }
        if(day >= 1 && day <= 9)
        {
            curpp+= "0" + String.valueOf(day); 
        }
        else
        {
            curpp+= String.valueOf(day);
        }
        return curpp; 
        
    }
    
    public void generarCURP(String curp)  
    {
        curp = curp.toLowerCase(); 
        curp += String.valueOf(sexo); 
        curp+= direccion;
        for(int i = 1; i< ap.length();i++)
        {
            if(ap.toLowerCase().charAt(i) != 'a' && ap.toLowerCase().charAt(i) != 'e' && ap.toLowerCase().charAt(i) != 'i' && ap.toLowerCase().charAt(i) != 'o' && ap.toLowerCase().charAt(i) != 'u')
            { 
                if(ap.toLowerCase().charAt(i) == 'ñ')
                {
                    curp+="x"; 
                }
                else
                {
                    curp+= String.valueOf(ap.charAt(i)); 
                    
                }
                break; 
            }
        }
        if(am.equals("0"))
        {
            curp+="x"; 
        }
        else
        {
            for(int i = 1; i< am.length();i++)
            {
                if(am.charAt(i) != 'a' && am.charAt(i) != 'e' && am.charAt(i) != 'i'&& am.charAt(i) != 'o'&& am.charAt(i) != 'u')
                {
                    curp+= String.valueOf(am.charAt(i)); 
                    break; 
                }
            }
        }
        for(int i = 1; i< nam.length();i++)
        {
            if(nam.charAt(i) != 'a' && nam.charAt(i) != 'e' && nam.charAt(i) != 'i' && nam.charAt(i) != 'o'&& nam.charAt(i) != 'u')
            {
                curp+= String.valueOf(nam.charAt(i)); 
                break; 
            }
        }
        StringBuilder homo = new StringBuilder(); 
        Random aleatorio = new Random(); 
        while (homo.length() < 2)
        {
            int index = (int) (aleatorio.nextFloat() * homoclave.length());
            homo.append(homoclave.charAt(index));
        }
         curp+= homo.toString();
        CURP = curp.toUpperCase();
    }
    
    public void generarRFC(String rfc)
    {
        StringBuilder homo = new StringBuilder(); 
        Random aleatorio = new Random(); 
        while (homo.length() < 3) 
        {
            int index = (int) (aleatorio.nextFloat() * homoclave.length());
            homo.append(homoclave.charAt(index));
        }
         rfc+= homo.toString();
        RFC = rfc.toUpperCase();
    }
    public String getCURP()
    {
        return CURP;
    }
    public String getRFC()
    {
        return RFC;
    }
    
    
    
    
    
    



}
