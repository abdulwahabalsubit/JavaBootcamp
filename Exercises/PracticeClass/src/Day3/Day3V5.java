void main() {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your number: ");

    int number = input.nextInt();

    if(number > 0 && number * 2 > 100 ){
        System.out.println("الرقم كبير");
    }else
        System.out.println("الرقم صغير");



}
