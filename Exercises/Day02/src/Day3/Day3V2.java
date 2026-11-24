void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int graed = input.nextInt();
    if(graed % 2 == 0)
    {
        System.out.println("ev");
    }
    else{
        System.out.println("odd");
    }
}
