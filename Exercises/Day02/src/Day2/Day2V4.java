void main() {
    Scanner input = new Scanner(System.in);

    System.out.println("enter your name: ");
    String name = input.nextLine();
    System.out.println("enter S if your nationalty is suadi: ");
    String nationalty = input.nextLine();
    System.out.println("enter your age for registration: ");
    int age = input.nextInt();
    System.out.println("Your name is : " + name);
    System.out.println("Your nationalty is : " + nationalty);
    boolean isAccept = (age >= 18 && nationalty != "S");
    System.out.println("your status: " + isAccept);

}
