import java.util.Arrays;

public class Pointer3D extends Pointer2D{
    private float z = 0f;
    public Pointer3D() {

    }
    public Pointer3D(float x, float y,float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public  void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[] {super.getX(), super.getY(), z};
    }
    @Override
    public String toString() {
        return "(x, y, z) = " + Arrays.toString(getXYZ());
    }
}
