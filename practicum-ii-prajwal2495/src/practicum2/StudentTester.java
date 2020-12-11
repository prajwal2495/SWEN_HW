package practicum2;

public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student("John","Doe",3.94,341123);
        Student s2 = new Student("Harry","Potter",0);
        Student s3 = new Student("Prajwal", "Krishna",1.88);
        Student s4 = new Student("John","Doe",1,341123);

        System.out.println("Student details are as follows: ");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());


        System.out.println("Working of equals method");
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s2));

        System.out.println("Grades:");
        s1.addGrade(s1.getPoints());
        s2.addGrade(s2.getPoints());
        s3.addGrade(s3.getPoints());

        System.out.println(s1.getFirstName()+ " got an "+s1.getGrades()+ ": "+ s1.getPoints());
        System.out.println(s2.getFirstName()+ " got an "+s2.getGrades()+ ": "+ s2.getPoints());
        System.out.println(s3.getFirstName()+ " got an "+s3.getGrades()+ ": "+ s3.getPoints());


        s3.setPoints(4.0);
        s1.setPoints(1);
        s2.setPoints(0);

        System.out.println(s1.getFirstName()+ " got an "+s1.getGrades()+ ": "+ s1.getPoints());
        System.out.println(s2.getFirstName()+ " got an "+s2.getGrades()+ ": "+ s2.getPoints());
        System.out.println(s3.getFirstName()+ " got an "+s3.getGrades()+ ": "+ s3.getPoints());




    }


}
