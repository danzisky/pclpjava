public class Punct {
    private float x;
    private float y;

    public Punct(float a, float b) {
        this.x = a;
        this.y = b;
    }
    /* getters */
    public float getX() {
        return this.x;
    }
    public float getY() {
        return this.y;
    }

    /* setters */
    public void setX(float a) {
        this.x = a;
    }
    public void setY(float a) {
        this.y = a;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /* mmisc methods */
    public double distance(float x2, float y2) {
        double dist = Math.sqrt((this.x - x2)*2 + (this.y - y2)*2);
        return dist;
    }
    public double distance(Punct p1) {
        double dist = Math.sqrt((this.x - p1.getX())*2 + (this.y - p1.getY())*2);
        return dist;
    }
}
