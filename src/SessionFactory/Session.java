package SessionFactory;

//Abstract product class
public abstract class Session {
    protected int Uid;

    public int getUid() {
        return Uid;
    }

    public void setUid(int Uid) {
        this.Uid = Uid;
    }

    abstract public String getSessionType();
}
