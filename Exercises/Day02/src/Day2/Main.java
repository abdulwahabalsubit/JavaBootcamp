//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner input = new Scanner(System.in);
    System.out.println("enter your user name: ");
    String userName = input.nextLine();
    System.out.println("enter your password: ");
    String password = input.nextLine();
    System.out.println("enter your email: ");
    String email = input.nextLine();
    System.out.println("usernae is: " + (userName.trim().isBlank() || userName.length() > 5));
    System.out.println("password is: " + (password.length() > 4 || userName != password));
    System.out.println("email: " + email.contains("@"));
    System.out.println("userName is: " + email.substring(0, email.lastIndexOf("@")));


}


