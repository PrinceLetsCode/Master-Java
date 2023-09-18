package Bit_manipulation;

public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        String s = "LLLALL";
        System.out.println(checkRecord(s));

    }

    private static boolean checkRecord(String s) {
        char[] attendance = s.toCharArray();
        int absentCount = 0;
        int lateCount = 0;

        for (int i =0; i < attendance.length;i++){
            if(attendance[i] == 'A'){
                absentCount++;
                if (absentCount>1){
                    return false;
                }
                lateCount=0;
            }else if (attendance[i] == 'L'){
                lateCount++;
                if(lateCount>2){
                    return false;
                }
            } else{
                lateCount=0;
            }
        }

        return absentCount<=1 && lateCount<=2;
    }
}
