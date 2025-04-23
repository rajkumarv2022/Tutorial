package AttendanceLoggingModule;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AttendanceLoggingModule {
    public void logAttendance(String employeeID, boolean isSuccess) {
        try (FileWriter writer = new FileWriter("attendance_log.txt", true)) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String status = isSuccess ? "Present" : "Absent";
            writer.write("Employee ID: " + employeeID + " | Timestamp: " + timestamp + " | Status: " + status + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


