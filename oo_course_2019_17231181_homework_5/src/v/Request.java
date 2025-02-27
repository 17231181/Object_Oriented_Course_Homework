package v;

public class Request {
    private int id0;
    private int from0;
    private int to0;
    private int direction0;

    Request(int id, int from, int to) {
        id0 = id;
        from0 = from;
        to0 = to;
        if (from > to) {
            direction0 = 0;
        }
        else {
            direction0 = 1;
        }
    }

    public int id() {
        return id0;
    }

    public int from() {
        return from0;
    }

    public int to() {
        return to0;
    }

    public int direction() {
        return direction0;
    }

}
