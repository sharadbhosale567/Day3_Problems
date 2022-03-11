package Practice;

public class EmpWageBuilderSwitchCaseUC5 {
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int IS_PART_TIME = 2;
    public static final int WORK_DAY_PER_MONTH = 20;
    public static final int empWage = 0;
    public static final int totalEmpWage =0;

    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        int partTimeHrs = 0;
        int partTimeEmpWage = 0;
        int totalEmpWage =0;

        for (int day=0; day<= WORK_DAY_PER_MONTH; day++ ) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    partTimeHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Emp Wage : " +empWage);
        }
        System.out.println("Total Emp Wage : " + totalEmpWage);
    }
}
