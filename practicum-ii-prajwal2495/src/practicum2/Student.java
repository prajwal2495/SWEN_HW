package practicum2;

public class Student {
    private long ID = 100001;
    private String firstName;
    private String lastName;
    private double points;
    private Grade grades;



    public Student(String firstName, String lastName, double pointValue, long ID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = pointValue;
        this.ID = ID;
    }



    public Student(String firstName, String lastName, double pointValue){
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = pointValue;
        this.ID = this.ID;
        this.ID++;
    }

    public long getID() {
        return ID;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public Grade getGrades() {
        return grades;
    }

    public void setGrades(Grade grades) {
        this.grades = grades;
    }

    public void addGrade(double pointValue){
        if(pointValue > 3.67 && pointValue <= 4.0){
            this.setGrades(Grade.A);
        }else if(pointValue <=3.67 && pointValue > 3.33){
            this.setGrades(Grade.A_Minus);
        }else if(pointValue <= 3.33 && pointValue > 3.0){
            this.setGrades(Grade.B_Plus);
        }else if(pointValue <= 3.0 && pointValue > 2.0){
            this.setGrades(Grade.B);
        }else if(pointValue <= 2.0 && pointValue > 1){
            this.setGrades(Grade.C);
        }else if(pointValue <= 1 && pointValue > 0){
            this.setGrades(Grade.D);
        }else if(pointValue == 0){
            this.setGrades(Grade.F);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", GPA=" + grades +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }else if(obj instanceof Student){
            Student ob = (Student) obj;
            return (this.ID == ob.ID);
        }
        return false;
    }




}
