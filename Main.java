package StudentPr;
public class Main {
    public static <GroupOverflowException extends Throwable> void main(String[] args) {
        Student student1 = new Student("1","APupkin1",Gender.Male,1,"Java OOP");
        Student student2 = new Student("2","XPupkin2",Gender.Male,2,"Java OOP");
        Student student3 = new Student("3","VPupkin3",Gender.Female,3,"Java OOP");
        Student student4 = new Student("4","BPupkin4",Gender.Female,4,"Java OOP");
        Student student5 = new Student("5","KPupkin5",Gender.Male,5,"Java OOP");
        Student student6 = new Student("6","Lupkin6",Gender.Male,6,"Java OOP");
        Student student7 = new Student("7","MPupkin7",Gender.Male,7,"Java OOP");
        Student student8 = new Student("8","NjPupkin8",Gender.Male,8,"Java OOP");
        Student student9 = new Student("9","OkPupkin9",Gender.Male,9,"Java OOP");
        Student student10 = new Student("10","RlPupkin10",Gender.Male,10,"Java OOP");
        Student student11 = new Student("11","TmPupkin11",Gender.Male,11,"Java OOP");
       Group group1 = new Group("12");
        try {
            group1.addStudent(student1);
            group1.addStudent(student2);
            group1.addStudent(student3);
            group1.addStudent(student4);
            group1.addStudent(student5);
            group1.addStudent(student6);
            group1.addStudent(student7);
            group1.addStudent(student8);
            group1.addStudent(student9);
            group1.addStudent(student10);
            //group1.addStudent(student11);
        } catch ( GroupOverflowExceprion e){
            e.printStackTrace();
        }
        System.out.println(group1);
        try {
            Student student =group1.searchStudentByLastName("APupkin1");
        }catch (StudentNotFoundException e){
            e.printStackTrace();
        }
    }
}




