package week12d02;

import java.util.List;

public class FenceRegister {

    private Fence fence;
    private int number;

    public FenceRegister(Fence fence, int number) {

        this.fence = fence;
        this.number = number;
    }

    @Override
    public String toString() {
        return "(Fence type: " + fence + ", Number of sites: " + number + ")";
    }

    public Fence getFence() {
        return fence;
    }

    public int number() {
        return number;
    }
}
