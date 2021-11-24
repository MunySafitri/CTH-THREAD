public class TesString{
    public static void main(String[] args){
        String kar1 = "Delete from company where ";
    //  Menggabungkan 2 buah String
        //  String gabung = kar1.concat(" dan dia");
         
        // System.out.println("Hasil penggabungan = "+gabung+"\n");
        System.out.println(coba(kar1,"id = 10"));
        System.out.println(coba(kar1,"id =12"));
        System.out.println(coba(kar1,"mereka"));
        System.out.println(coba(kar1,"dia"));
        String jika = coba(kar1,"dia");
        //String sql = 

    }
    public static String  coba(String kar1, String a){
        String gabung;
        gabung = kar1.concat(a);
        return gabung;
    }
}