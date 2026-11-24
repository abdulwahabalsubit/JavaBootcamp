void main() {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your age: ");
    int age = input.nextInt();
    if (age >= 30 && age <= 39) {
        System.out.println("old in stage 1 : " + age);
    } else if (age >= 20 && age <= 29) {
        System.out.println("old in stage 2 : " + age);
    } else if (age >= 10 && age <= 19) {
        System.out.println("old in stage 3 : " + age);
    } else {
        System.out.println("old in stage 0 : " + age);
    }

}