public class Main {
    public static void main(String[] args) throws Exception {
        Karyawan Abner = new Karyawan("23210002", "Abner Boas");
        Abner.getInfo();
        Abner.absenPagi();
        Abner.kerja();
        Abner.absenPulang();
     

        System.out.println();
        
        Karyawan Andre = new Karyawan("23210020", "Andre");
        Andre.getInfo();
        Andre.absenPagi();
        Andre.kerja();
        Andre.absenPulang();
        

        System.out.println();


         Dosen Rina = new Dosen("2323", "2121", "Rina");
         Rina.getInfo();
         Rina.absenPagi();
         Rina.kerja();
         Rina.ngajar();
         Rina.absenPulang();

         System.out.println();
         
         Dosen buion = new Dosen ("112233", "1133", "Bu Ion");
         buion.getInfo();
         buion.absenPagi();
         buion.kerja();
         buion.ngajar();
         buion.absenPulang();

    }
}