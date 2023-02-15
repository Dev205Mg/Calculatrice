/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yaël
 */
//import java.util.*;
public class Convertion {
    private final String display;
    private final String base;
    
    public Convertion(String value, String name){
        this.display = value;
        this.base = name;
    }
    
    public String convertir(){
        String resultat = null;
        int donner = Integer.parseInt(display);

 
        switch (base){
            case "Bin" ->  {
                resultat = Integer.toBinaryString(donner);
                break;
            }
            case "Octa" ->  {
                resultat = Integer.toOctalString(donner);
                break;
            }
            case "Hexa" ->  {
                resultat = Integer.toHexString(donner);
                resultat = resultat.toUpperCase();
                break;
            }
        }
        return resultat;
    }
    //*********************************
//    public static String suprimeAvantEtDernier(String str) {
//		str = str.substring(1, str.length() -1);
//		return str;
//	}
    //******************************************
    //                int index = 0;
//                do{
//                   arrayOfIndex[index] = donner % 16;
//                   donner /= 16;
//                   index++; 
//                }
//                while(donner != 0);
//                Collections.reverse(Arrays.asList(arrayOfIndex)); 
//		for(int t = 0; t < arrayOfIndex.length; t++) {
//                    if(arrayOfIndex[t] == null) {
//                            arrayOfIndex[t] = 0;
//                    }
//		}
//                String temp = Arrays.toString(arrayOfIndex);
//		String newArray[] = temp.split(",");
//		String res = "";
//		for(String str : newArray) {
//			res += str;
//		}
    
    //*************************
    //        int oct = 0;
//        if(donner < 16){
//            oct = 4;
//        } else if(donner < Math.pow(16, 2)){
//            oct = 8;
//        } else if(donner < Math.pow(16, 3)){
//            oct = 12;
//        }else if(donner < Math.pow(16, 4)){
//            oct = 16;
//        }else{
//            oct = 20;
//        }
//        Integer arrayOfIndex[];
//        arrayOfIndex = new Integer[oct];
}
