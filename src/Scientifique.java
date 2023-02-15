/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yaël
 */
public class Scientifique {
    
    private final String display;
    private final String signe;
    
    public Scientifique (String value, String name){
        this.display = value;
        this.signe = name;
    }
    
    public double calculScientific(){
        double donner = Float.parseFloat(display);
        double resultat = 0;
        
        switch(signe){
            case "Cos" -> {
                if(donner == 90.0 || donner == 270.0){
                    resultat = 0.0;
                } else {
                    donner = Math.toRadians(donner);
                    resultat = Math.cos(donner);
                }
                break;
            }
            
            case "Sin" -> {
                if( donner != 180.0){
                    donner = Math.toRadians(donner);
                    resultat = Math.sin(donner);
                } else {
                    resultat = 0.0;
                break;
                }
                
            }
            case "√" -> {
                resultat = Math.sqrt(donner);
                break;
            }
            
            case "Tan" ->{
                donner = Math.toRadians(donner);
                resultat = Math.tan(donner);
                break;
            }
            
            case "Log" ->{
                resultat = Math.log10(donner);
                break;
            }
            
            case "Ln" ->{
                resultat = Math.log(donner);
                break;
            }
            
            case "n!" ->{
                donner = (int)donner;
                if(donner <= 1){
                    resultat = 1;
                } else{
                    resultat = 1;
                    for( int i = 1; i <= donner; i++){
                        resultat *= i;
                    }
                }
                break;
            }
            
        }
        return resultat;
    }
    
}
