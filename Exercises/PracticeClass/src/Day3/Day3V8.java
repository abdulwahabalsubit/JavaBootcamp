void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("type\n number 1 to check 5 or\n number 1 to check odd or \n number 3 to exit : ");
    int minu = input.nextInt();
    switch (minu) {
        case 1:
            System.out.println("your your number of double 5");
            int number = input.nextInt();
            if (number % 5 == 0)
                System.out.println("this number is 5: " + number);
            else
                System.out.println("this number is not double 5: " + number);
            break;
        case 2:
            System.out.println("your your number of odd or evnt");
            int number2 = input.nextInt();
            if (number2 % 2 == 0)
                System.out.println("this number is evne: " + number2);
            else if (number2 % 2 == 1)
                System.out.println("this number is odd: " + number2);
            break;
        case 3:
            break;
        default:
            System.out.println("this number out of our list");
    }
}
