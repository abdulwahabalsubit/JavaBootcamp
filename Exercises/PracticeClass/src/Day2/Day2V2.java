void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your firstName: ");
    String firstName = input.nextLine();

    System.out.println("Enter your lastName: ");
    String lastName = input.nextLine();

    System.out.println("Enter your phoneNumber: ");
    String phoneNumber = input.nextLine();

    System.out.println("Enter your email: ");
    String email = input.nextLine();

    System.out.println("Enter your isAdmin: ");
    boolean isAdmin = input.nextBoolean();

    System.out.println("Enter creationYear: ");
    int creationYear = input.nextInt();
    System.out.println(firstName + " " + lastName);
    System.out.println(lastName);
    System.out.println(phoneNumber);
    System.out.println(email);
    System.out.println(isAdmin);
    System.out.println(creationYear);
}