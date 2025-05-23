public class Student {
    private int marks;

    public void setMarks(int marks){
        if(marks < 0 || marks > 100){
            throw new IllegalArgumentException("Marks should be between 0 and 100");
        }
        this.marks = marks;
    }

    public int getMarks(){
        return marks;
    }

    public static void main(String[] args) {
        Student pavan = new Student();
        pavan.setMarks(85);

        System.out.println("Pavan scored: " + pavan.getMarks() + " marks");
    }
}
