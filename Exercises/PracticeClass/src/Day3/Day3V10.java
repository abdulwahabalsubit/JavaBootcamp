void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("type from our list: \nnew \ncheck \nupdate ");
    String type = input.nextLine();

    switch (type) {
        case "new":
            System.out.println("enter your name");
            String newName = input.nextLine();
            System.out.println("registiron secuss");
            break;
        case "check":
            String exitName = "abdulwahab";
            System.out.println("enter your name");
            String updateName = input.nextLine();
            if (updateName.equals(exitName)) {

                System.out.println("your name is exist");
            } else
                System.out.println("uncorrect name");
            break;
        case "update":
            String exitName2 = "abdulwahab";
            System.out.println("enter your name");
            String updateName2 = input.nextLine();
            if (updateName2.equals(exitName2)) {
                System.out.println("enter your new name");
                String nupdatename = input.nextLine();
                System.out.println("your name has updated");
            } else
                System.out.println("uncorrect name");
            break;
        default:
            System.out.println("your chiose out of our list !!");
    }

}
