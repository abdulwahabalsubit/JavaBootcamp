void main() {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your number 1: ");
    int fnum = input.nextInt();
    System.out.println("Enter your number 2: ");
    int snum =input.nextInt();
    int total = fnum + snum;

    if( total % 2 == 0 && total / 4 ==0 ){
        System.out.println("S total of numbers is: " + total);
    }else if(total % 2 == 1 ){
        System.out.println("O total of numbers is: " + total);
    }else {
        System.out.println("N total of numbers is: " + total);
    }




}
