public class UnderGraduate extends Student {
    
    private String course;
    private double cgpa;


    public UnderGraduate(String sName, String sID, String sFac, String course, double cgpa){
        super(sName, sID, sFac);
        this.course = course;
        this.cgpa = cgpa;
    }

    public String getStatus(){
        String status = " ";
        if(cgpa>=3.50 && cgpa <=4.00){
            status = "Pass with Distiction";
        }
        else if(cgpa >=3.00){
            status = "Pass with Credit";
        }
        else if(cgpa >=2.00){
            status = "Pass";
        }
        else{
            status = "Fail";
        }

        return status;
    }
}
