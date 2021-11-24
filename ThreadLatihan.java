public class ThreadLatihan{
    final int jumlah = 20;
    Thread thread;

    public static void main(String[] main){
        ThreadLatihan test = new ThreadLatihan();
        int a = 1;
        test.jalanA(a);
        int b = 2;
        test.jalanB(b);
    }

    void jalanA(int a){
        thread = new Thread(){
            public void run(){
                try{
                    for(int i = a; i<=jumlah; i=i+2){
                        System.out.println("Ini Adalah A-> no: "+ i);
                        sleep(1000);//waktu pending
                    }
                }catch(InterruptedException e){
                        e.printStackTrace();
                }
            }
        };
        thread.start();
    }
    
    void jalanB(int b){
        thread = new Thread(){
            public void run(){
                try{
                    for(int i = b; i<=jumlah; i=i+2){
                        System.out.println("Ini Adalah B-> no: "+ i);
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