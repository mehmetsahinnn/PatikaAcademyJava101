package classes.ogrs;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int sozMat, int sozFiz, int sozKim) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = ((int) (mat * 0.8));
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = ((int) (fizik * 0.8));
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = ((int) (kimya * 0.8));
        }


        if (sozMat >= 0 && sozMat <= 100) {
            this.mat.sozNot = ((int) (sozMat * 0.2));
        }

        if (sozFiz >= 0 && sozFiz <= 100) {
            this.fizik.sozNot = ((int) (sozFiz * 0.2));
        }

        if (sozKim >= 0 && sozKim <= 100) {
            this.kimya.sozNot = ((int) (sozKim * 0.2));
        }
    }


    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.kimya.sozNot == 0 || this.fizik.sozNot == 0 || this.mat.sozNot == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (double) (this.fizik.note + this.fizik.sozNot + this.kimya.note + this.kimya.sozNot + this.mat.note + this.mat.sozNot) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + (this.mat.note + this.mat.sozNot));
        System.out.println("Fizik Notu : " + (this.fizik.note + this.fizik.sozNot));
        System.out.println("Kimya Notu : " + (this.kimya.sozNot + this.fizik.sozNot));
    }

}