package forums;

public class Forum {
    int idF;
    String nomF;

    public Forum() {
    }

    public Forum(int idF, String nomF) {
        this.idF = idF;
        this.nomF = nomF;
    }

    public Forum add (Theme T){
        return new Forum() ;
    }
}
