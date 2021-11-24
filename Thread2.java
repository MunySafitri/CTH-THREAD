

public class Thread2 {
    Thread thread;
    int jumlah = 7;

    public static void main(String[] args) throws Exception {
        Thread2 test = new Thread2();
        test.satu();
        test.dua();

    }

    void satu(){
        thread = new Thread(){
            
            public void run(){
                try{
                    for(int i =1; i<=jumlah; i++){
                        System.out.println("Nomor "+ i);
                        sleep(1000);//waktu pending
                    }
                }catch(InterruptedException e){
                        e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    void dua(){
        thread = new Thread(){
            public void run(){
                try{
                    for(int i =1; i<=jumlah; i++){
                        System.out.println("salam dari Muny");
                        sleep(1000);//waktu pending
                    }
                }catch(InterruptedException e){
                        e.printStackTrace();
                }
            }
        };
        thread.start();
    }
    
}