public class Main {

    public static void main(String[] args) {
        IdAndPasswords iDandPasswords = new IdAndPasswords();

        LoginPage loginPage = new LoginPage(iDandPasswords.getLoginInfo());
    }
}
