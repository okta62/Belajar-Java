public class dynamicbindingdemo {
    public static void main(String[] args) {
        // Memanggil metode m dengan berbagai objek
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }

    public static void m(Object x) {
        // Menggunakan dynamic binding untuk memanggil metode toString sesuai tipe objek
        System.out.println(x.toString());
    }
}

// Kelas GraduateStudent yang merupakan subclass dari Student
class GraduateStudent extends Student {
    @Override
    public String toString() {
        return "Graduate Student";
    }
}

// Kelas Student yang merupakan subclass dari Person
class Student extends Person {
    @Override
    public String toString() {
        return "Student";
    }
}

// Kelas Person yang merupakan subclass dari Object
class Person extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}