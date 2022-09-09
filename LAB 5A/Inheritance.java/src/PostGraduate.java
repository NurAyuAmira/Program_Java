public class PostGraduate extends Student {
    
    private String thesisTitle, supervisor;
    private String pgProgram;
    private boolean isCompleted = false;



    public PostGraduate(String sName, String sID, String sFac, String thTitle, String svName){
        super(sName,sID,sFac);
        thesisTitle = thTitle;
        supervisor = svName;
        
    }

    public void setThesisStatus(boolean status){
        isCompleted = status;
    }

    public String getStatus(){
        String status;

        if(isCompleted){
            status = "Pass";
        }
        else{
            status = "Pending";
        }

        return status;
    }
}
