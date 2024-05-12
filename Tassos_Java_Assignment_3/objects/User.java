package objects;

public class User {
    private String name;
    private String email;
    private String phone;
    private String appointmentDay;
    private String appointmentTime;

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    } // constructor

    // ===============>>
    // GETTERS
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getAppointmentTime(){
        return appointmentTime;
    }

    public String getAppointmentDay(){
        return appointmentDay;
    }

    // ===============>>
    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAppointmentTime(String appointmentTime ){
        this.appointmentTime = appointmentTime;
    }

    public void setAppointmentDay(String appointmentDay){
        this.appointmentDay = appointmentDay;
    }
} // class