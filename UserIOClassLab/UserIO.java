package UserIOClassLab;

public class UserIO implements IO{

    @Override
    public void print(String m) {
        System.out.println(m);

    }

    @Override
    public String readString(String prompt) {
        return null;
    }

    @Override
    public int readInt(String prompt) {
        return 0;
    }

    @Override
    public int readInt(String p, int min, int max) {
        return 0;
    }

    @Override
    public double readDouble(String p) {
        return 0;
    }

    @Override
    public double readDouble(String p, double min, double max) {
        return 0;
    }

    @Override
    public float readFloat(String p) {
        return 0;
    }

    @Override
    public float readFloat(String p, float min, float max) {
        return 0;
    }

    @Override
    public long readLong(String p) {
        return 0;
    }

    @Override
    public long readLong(String p, int min, int max) {
        return 0;
    }
}
