import java.lang.*;
import java.util.*;


public class ContohRunable implements Runnable{
    int jumlah = 10;
    static String kotak[][] = new String[20][20];
    static String key;
    Thread thread;
    Scanner in;
    static int posisiX = 2;
    static int posisiY = 2;
    static String sim = "O";
    static String musuh = "X";
    static int randomBaris;
    static int randomKolom;
    
    public static void main(String[] args){
        for(int i = 0 ; i < kotak.length; i++){
            for(int j = 0 ; j < kotak[i].length; j++){
                kotak[i][j] = " ";
            }
        }
        ContohRunable test = new ContohRunable();
        test.jalan();
        test.run();
        
    }
    @Override
    public void run(){//musuh
        try{
            for(int k =1; ; k++){
                
                for(int i = 0 ; i < kotak.length; i++){
                    for(int j = 0 ; j < kotak[i].length; j++){
                        System.out.print(kotak[i][j]+"| ");
                        if("O".equals(kotak[i][j])){
                            if("X".equals(kotak[i][j])){
                                System.out.println("Anda Mati");
                                System.exit(0);
                            }
                            continue;    
                        }
                        kotak[i][j] = " ";      
                    }
                    System.out.print("\n");
                }

                randomBaris = (int) Math.floor(Math.random() * 20);
                randomKolom = (int) (Math.random()* 20);
                Thread.sleep(700);//waktu pending
                
                if( kotak[randomBaris][randomKolom]== musuh) continue;
                kotak[randomBaris][randomKolom]= musuh;
                clearScreen();
            }
        }catch(InterruptedException e){
                e.printStackTrace();
        }
    }

    public void jalan(){//control O
        in = new Scanner(System.in);
        thread = new Thread(){
            
            public void run(){
                kotak[posisiY][posisiX]= sim;
                    while(true){      
                        key = in.nextLine();
                        kotak[posisiY][posisiX] = " ";
                        clearScreen();
                        
                        try{
                        switch (key) {
                            case "w":  
                               // System.out.println("ini adalah a");
                                kotak[--posisiY][posisiX] = sim;
                                break;
                            case "a":
                                //System.out.println("ini adalah w");
                                kotak[posisiY][--posisiX] = sim;
                                break;
                            case "d": 
                               // System.out.println("ini adalah s");
                                kotak[posisiY][++posisiX] = sim;
                                break;
                            case "s": 
                                //System.out.println("ini adalah d");
                                kotak[++posisiY][posisiX] = sim;
                                break;
                            default:
                               // System.out.println("ini salah");
                                kotak[posisiY][posisiX] = sim;
                                break;
                        }
                        }catch(Exception e){
                            if(kotak[posisiY][posisiX] == null){
                                System.out.println("samapai disini");
                            } 
                            continue;
                        }
                    }
            }
        };
        thread.start();
    }

static void clearScreen(){
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033\143");
            }
        }catch (Exception e){
            System.err.println("Tidak bisa clear screen");
        }
    }
       
}