package _20210311_JDBC;
//javabean
public class user1 {
    private String username;
    private String password;

    public user1(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public user1() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user1{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
