public class QuizMain {
        
    public static void main(String[] args) {
        
        String acrobat1 = "Massil";
        String acrobat2 = "Raluca";
        String acrobat3 = "Hao";
        String acrobat4 = "3";
        Acrobat Massil = new Acrobat(acrobat1);
        Acrobat Raluca = new Acrobat(acrobat2);
        Acrobat Hao = new Acrobat(acrobat3);
        Acrobat Three = new Acrobat (acrobat4);
        System.out.println("There are "+Three.getName()+" Acrobats");
        System.out.println("They are named "+Massil.getName()+", "+Raluca.getName()
                           +", "+Hao.getName()+".");
        System.out.println(Raluca.clap(3));
        System.out.println(Massil.kneebend(3));
        Massil.kneebend(2);
        Hao.clap(2);
        System.out.println(Raluca.getName()+" has exercised "+ Raluca.getNumExercises()+
                           " times.");
        System.out.println(Hao.getName()+" has exercised "+ Hao.getNumExercises()+
                           " times.");
        System.out.println(Massil.getName()+" has exercised "+ Massil.getNumExercises()+
                           " times.");
    }
}
