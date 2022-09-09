public class TestProgram {
    public static void main(String[]args){
        PostGraduate po = new PostGraduate("Amanda", "20091123", "Business Management","The Impach of Social Media in Education","Dr. Adibah");

        po.setThesisStatus(true);
        System.out.println(po.getStatus());

        UnderGraduate un = new UnderGraduate("Patrick", "20096544", "Computer Science", "Software Engineering", 3.43);
        System.out.println(un.getStatus());


    }
}
