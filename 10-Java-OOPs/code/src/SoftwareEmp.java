public class SoftwareEmp extends  Employee{
    int salaryInc;
    SoftwareEmp(int i, int s, int si) {
        super(i, s);
        salaryInc = si;
    }

    public static void main(String[] args) {
        SoftwareEmp pavan = new SoftwareEmp(101, 50000, 20000);
        System.out.println(pavan.salary);
        System.out.println(pavan.id);
        System.out.println(pavan.salaryInc);
    }
}
