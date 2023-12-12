public class Main {
    public static void main(String[] args) throws Exception {
        int i;
        String [] cotxe = {"mercedes","BMW"};
        
    
        imp_NomAlumne("alumne principal");

        for(i=0; i < cotxe.length ; i++){
            System.out.println(cotxe[i]);
        }
        imp_NomAlumne2();
    }

   
    public static void imp_NomAlumne(String alumne){
        alumne = " Olau";
        System.out.println("Els cotxes preferits de l'alumne " + alumne);
    }
    public static void imp_NomAlumne2() {
        String alumne = "Olau";
    
        System.out.println(alumne);
        System.out.println(alumne);




    }
}


