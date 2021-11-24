public class App {
    public static void main(String[] args) throws Exception {
        // ini untuk menjalankan program hitung
        int jumlah = 10;
        Thread thread = new Thread(){
        @Override
            public void run(){
                try{
                    for(int i =1; i<=jumlah; i++){
                        System.out.println("Nomor+ "+ i);
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

