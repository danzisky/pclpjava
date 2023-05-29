package Tema9.Ex2;

import java.util.ArrayList;
import java.util.List;

class Student implements PersoanaInterface {
    private String nume;
    private List<Double> medii;

    public Student(String nume) {
        this.nume = nume;
        this.medii = new ArrayList<>();
    }

    public double calculMedieGenerala() {
        double sum = 0.0;
        for (Double medie : medii) {
            sum += medie;
        }
        return sum / medii.size();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void addMedie(double medie) {
        medii.add(medie);
    }

    @Override
    public int compareTo(PersoanaInterface persoana) {
        if (persoana instanceof Student) {
            Student student = (Student) persoana;
            int nameComparison = this.nume.compareTo(student.nume);
            if (nameComparison != 0) {
                return nameComparison;
            } else {
                return Double.compare(student.calculMedieGenerala(), this.calculMedieGenerala());
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", medii=" + medii +
                '}';
    }
}