package model;

public abstract class User {
    protected String user_id;
    protected String user_name;
    protected String user_fullname;
    protected float user_cosalary;

    public User() {
    }

    public User(String user_id, String user_name, String user_fullname, float user_cosalary) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_fullname = user_fullname;
        this.user_cosalary = user_cosalary;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_fullname() {
        return user_fullname;
    }

    public void setUser_fullname(String user_fullname) {
        this.user_fullname = user_fullname;
    }

    public float getUser_cosalary() {
        return user_cosalary;
    }

    public void setUser_cosalary(float user_cosalary) {
        this.user_cosalary = user_cosalary;
    }

    @Override
    public String toString() {
        return "{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_fullname='" + user_fullname + '\'' +
                ", user_cosalary=" + user_cosalary+", "
                ;
    }

    public abstract float getSalary();
}
