public class Credential {
    String url, username, password;
    Credential(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
    public void print(){
        System.out.println("\nSuccessfuly saved your credential as follows : ");

        System.out.println("URL : "+this.url);
        System.out.println("Username : "+this.username);
        System.out.println("Password : "+this.password);

    }
}
