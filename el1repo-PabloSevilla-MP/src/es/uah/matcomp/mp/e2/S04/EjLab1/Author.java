package es.uah.matcomp.mp.e2.S04.EjLab1;

public class Author {
    String name;
    String email;
    char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        String frase="Author [name= "+name+", email= "+email+", gender= "+gender+"]";
        return frase;
    }
}
