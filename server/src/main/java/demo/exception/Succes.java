package demo.exception;

public class Succes {
    private String message;
    
    public Succes(String message) {
        this.message = message;
    }
    public String getmessage() {
        return this.message;
    }
    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder("{\n");
        stb.append("\"message\":").append('"'+this.message+'"');
        stb.append("\n}");
        return stb.toString();
    
    }
    
}
