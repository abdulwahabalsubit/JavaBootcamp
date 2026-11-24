void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your number: ");

    int number = input.nextInt();
    if (number == 1 && number < 2) {
        System.out.println("1: " + number);
    } else if (number == 2 && number < 3) {
        System.out.println("2: " + number);
    } else if (number == 3 && number < 4) {
        System.out.println("ok: " + number);
    } else {
        System.out.println("else: " + number);
    }
    // System.out.println(number);
}
