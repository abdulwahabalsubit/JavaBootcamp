void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("type your number of weekdays: ");
    int day = input.nextInt();
    System.out.println("type AM or PM: ");
    String hours = input.nextLine();
    input.nextLine();
    switch (day ) {
        case 1:
            System.out.println("Monday");
            System.out.println(hours);
            if(hours.equals("AM"))
                System.out.println("You have gift");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("out of types");
    }
}
