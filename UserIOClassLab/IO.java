package UserIOClassLab;

public interface IO {
    public void print (String m);
    public String readString (String prompt);

    public int readInt(String prompt);
    public int readInt(String p, int min, int max);

    public double readDouble (String p);
    public double readDouble (String p, double min, double max);

    float readFloat(String p);
    float readFloat (String p, float min, float max);

    long readLong (String p);
    long readLong (String p, int min, int max);
}
