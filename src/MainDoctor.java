public class MainDoctor {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        //myDoctor.id = 1;
        myDoctor.name = "ALejandro Rodríguez";
        myDoctor.showName();
        myDoctor.showId();

        System.out.println();

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.name = "Annahi";
        myDoctorAnn.showName();
        myDoctorAnn.showId();

        System.out.println();

        //myDoctor.showName();
        //myDoctor.showId();
    }
}
