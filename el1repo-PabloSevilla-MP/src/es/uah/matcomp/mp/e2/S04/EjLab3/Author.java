package es.uah.matcomp.mp.e2.S04.EjLab3;

public class Author {
    String name;
    String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Author [Name= "+name+", Email= "+email+"]";
    }
}
