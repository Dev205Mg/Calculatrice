/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yaël
 */
public class Calculator {
    private String signe;
    private String displayValue;
    
//    public void setSigne(String signe){ // fomba fanovana private signe avy @ class hafa
//        this.signe = signe;
//    }
    
    public Calculator(String signe, String display){
        this.signe = signe;
        this.displayValue = display;
        if(null != this.signe)switch (this.signe) {
            case "+":
                this.signe = "\\+";
                break;
            case "*":
                this.signe = "\\*";
                break;
            case "^":
                this.signe = "\\^";
                break;
            default:
                break;
        }  
    }
    
    public float egal(){
        float response = 0;
        String[] arrayOfDisplay = this.displayValue.split(this.signe, 2);
        float beginsValue = Float.parseFloat(arrayOfDisplay[0]);
        float endingValue = Float.parseFloat(arrayOfDisplay[1]);
        
        switch(signe){
            case "\\+" -> {
                response = beginsValue + endingValue;
                break;
            }
            case "-" -> {
                response = beginsValue - endingValue;
                break;
            }
            case "\\*" -> {
                response = beginsValue * endingValue;
                break;
            }
            case "/" -> {
                  response = beginsValue / endingValue;
                  break;
            }
            case "\\^" -> {
                response = (float) Math.pow(beginsValue, endingValue);
            }
        }
        return response;
    } 
    
//    public String getSigne(){ // fomba fakana valeurany private signe hampiasaina @ class hafa
//        return (this.signe);
//    }
}
