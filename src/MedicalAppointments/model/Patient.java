package MedicalAppointments.model;

public class Patient extends User {
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;

    public Patient(String name, String email) {
        super(name, email);
        System.out.println("Patient's name: " + name);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + ", Weight: " + weight +
                ", \nHeight: " + height + ", Blood Type: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente que lleva 30 años en este hospital");
    }
}
