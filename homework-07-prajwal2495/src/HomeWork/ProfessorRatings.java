package HomeWork;

// class ProfessorRatings begins
public class ProfessorRatings {

    //private fields
    private String name,last_name,uni_name,subject;
    private double quality_rating, level_of_difficulty,overall_average_rating;

    //constructor to set the fields values to default
    public ProfessorRatings(){
        this.name = "John";
        this.last_name = "Doe";
        this.uni_name = "None";
        this.subject = "None";
        this.quality_rating = 0.0;
        this.level_of_difficulty = 0.0;
        this.overall_average_rating = 0.0;
    }

    // constructor to set the values to the fields
    ProfessorRatings(String name, String last_name, String uni_name, String subject){
        this.name = name;
        this.last_name = last_name;
        this.uni_name = uni_name;
        this.subject = subject;
    }

    //Mutator to set the value to field name
    public void setName(String name){
        this.name = name;
    }
    // accessor to get the value of the field name
    public void getName(){
        System.out.println(this.name);
    }

    //Mutator to set the value to field last_name
    public void setLast_name(String last_name){
        this.last_name = last_name;
    }
    // accessor to get the value of the field last_name
    public void getLast_name(){
        System.out.println(this.last_name);
    }

    //Mutator to set the value to field uni_name
    public void setUni_name(String uni_name){
        this.uni_name = uni_name;
    }
    // accessor to get the value of the field uni_name
    public void getUni_name(){
        System.out.println(this.uni_name);
    }

    //Mutator to set the value to field subject
    public void setSubject(String subject){
        this.subject = subject;
    }
    // accessor to get the value of the field subject
    public void getSubject(){
        System.out.println(this.subject);
    }

    public void addRatings(double quality_rating, double level_of_difficulty){
        this.quality_rating = quality_rating;
        this.level_of_difficulty = level_of_difficulty;
    }

    public void setOverall_average_rating(){
        this.overall_average_rating = (this.quality_rating + this.level_of_difficulty) / 2;
    }

    @Override
    public String toString(){
        return "[Name:"+this.name+"\nLast_name:"+this.last_name+"\nUniversity name:"+this.uni_name+"\nSubject:"+this.subject+"\nQuality rating:"+this.quality_rating
                +"\nLevel of difficulty:"+this.level_of_difficulty
                +"\nOverall rating:"+(this.overall_average_rating)+"]\n";
    }



}
// end of class ProfessorRatings