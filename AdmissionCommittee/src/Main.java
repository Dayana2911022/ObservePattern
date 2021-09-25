public class Main {

    public static void main(String[] args) {

        AdmissionCommittee admissionCommittee= new AdmissionCommittee();
        Student Alua=new Student("Alua");
        admissionCommittee.register(Alua);
        admissionCommittee.addGrants("software engineering");
        }
    }

